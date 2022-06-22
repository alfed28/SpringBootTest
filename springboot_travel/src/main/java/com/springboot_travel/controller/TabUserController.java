package com.springboot_travel.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.springboot_travel.domain.TabUser;
import com.springboot_travel.service.TabUserService;
import com.springboot_travel.util.MailUtil;
import com.springboot_travel.util.R;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.Date;


/**
 * (TabUser)表控制层
 *
 * @author makejava
 * @since 2022-06-06 11:35:00
 */
@RestController
@RequestMapping("/tabUser")
@Slf4j
@CrossOrigin
@Api(tags = "用户的登陆，注册，获取验证码，激活用户功能")
public class TabUserController {
    /**
     * 服务对象
     */
    @Autowired
    private TabUserService tabUserService;

    private boolean jihuo;

    /**
     * 验证码
     * @author shiao
     * @date 2022/6/6 22:41
     * @param response 响应
     */
    @GetMapping("/img")
    public R img(HttpServletResponse response){
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(100, 50, 4, 5);
        ServletOutputStream outputStream=null;
        String code = captcha.getCode();
        System.err.println("验证码:"+code);
        //session.getServletContext().setAttribute("imgCode",code);
        //前后端分离需要将图片经过base64后传到前端src中
       return R.setR(200,code,captcha.getImageBase64Data());
    }
    /**
     * 登陆
     * @author shiao
     * @date 2022/6/6 20:04
     * @param username 用户名
     * @param password 密码
     * @return R
     */
    @ApiOperation(value = "用户登陆",notes = "this is userLogin-------=")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "username",value = "用户名",required = true
            ),
            @ApiImplicitParam(
                    name = "password",value = "密码",required = true
            )
        }
    )
    @ApiResponses({
            @ApiResponse(code = 200,message = "登陆成功"),
            @ApiResponse(code = 300,message = "登陆失败")
    })
    @GetMapping
    public R userLogin(String username,String password){
        log.info(username,password);
        int i = tabUserService.userLogin(username, password);
        if (i==0) return R.fail("用户不存在");
        if (i==1) return R.fail("密码错误");
        if (i==2) return R.fail("用户未激活");
        return R.ok("登陆成功");
    }
    //@GetMapping
    //public R userLogin(String username,String password,HttpSession session,String check){
    //    log.info(username,password,check);
    //    String imageCode = (String) session.getServletContext().getAttribute("imageCode");
    //    //将正确的验证码与用户填写的验证码作比较，这个equals是忽略大小写的
    //    boolean boo = imageCode.equalsIgnoreCase(check);
    //    if (boo){
    //        int i = tabUserService.userLogin(username, password);
    //        if (i==0) return R.fail("用户不存在");
    //        if (i==1) return R.fail("密码错误");
    //        return R.ok("登陆成功");
    //    }else {
    //        return R.fail("验证码错误");
    //    }
    //
    //}
    /**
     * 用户注册
     * @author shiao
     * @date 2022/6/6 20:03
     * @param user 用户
     * @return R
     */
    @ApiOperation(value = "用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid",value = "用户编号"),
            @ApiImplicitParam(name = "username",value = "用户名"),
            @ApiImplicitParam(name = "password",value = "密码"),
            @ApiImplicitParam(name = "name",value = "昵称"),
            @ApiImplicitParam(name = "birthday",value = "生日"),
            @ApiImplicitParam(name = "sex",value = "性别",defaultValue = "男"),
            @ApiImplicitParam(name = "telephone",value = "电话号码"),
            @ApiImplicitParam(name = "email",value = "邮箱"),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "注册成功"),
            @ApiResponse(code = 300,message = "注册失败"),
            @ApiResponse(code = 500,message = "系统错误")
    })
    @PostMapping("/reg")
    public R userRegister(@Valid TabUser user){
        log.info(user.toString());
        int i = tabUserService.userReg(user);
        if (i==0) return R.fail("注册失败");
        log.info(String.valueOf(i));
        //注册成功发邮件
        MailUtil.sendMail("2779496452@qq.com",new String[]{user.getEmail()},"注册验证"
        ,"点击此处<a href='http://127.0.0.1:8080/tabUser/jihuo?username="+user.getUsername()+"'>验证</a>邮箱",null);
        return R.ok("注册成功");
    }
    /**
     * 注册用户激活
     * @author shiao
     * @date 2022/6/8 11:36
     * @param username 用户名
     * @return R
     */
    @GetMapping("/jihuo")
    public R userJiHuo(String username){
        log.info(username);
        int i = tabUserService.userJiHuo(username);
        if (i==0)return R.fail("激活失败");
        jihuo=true;
        return R.ok("激活成功");
    }

    /**
     *
     * @author shiao
     * @date 2022/6/12 12:18
     register_ok02页用户注册激活成功验证·
     * @return R
     */

    @GetMapping("/jihuo2")
    public R userJiHuo02(){
        if (!jihuo) return R.fail("验证激活失败");
        return R.ok("验证激活成功");
    }


    //@PostMapping("/reg")
    //public R userRegister(TabUser user,HttpSession session,String check){
    //    log.info(user.toString());
    //    //先从session作用域中获取正确的的验证码文本
    //    String imageCode = (String) session.getServletContext().getAttribute("imageCode");
    //    //将正确的验证码与用户填写的验证码作比较，这个equals是忽略大小写的
    //    boolean boo = imageCode.equalsIgnoreCase(check);
    //    if (boo){
    //        int i = tabUserService.userReg(user);
    //        if (i==0) return R.fail("注册失败");
    //        log.info(String.valueOf(i));
    //        return R.ok("注册成功");
    //    }else {
    //        return R.fail("验证码错误");
    //    }
    //}
}

