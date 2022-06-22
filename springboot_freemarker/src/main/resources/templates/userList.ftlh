<table style="font-size: 20px">
    <tr style="background-color: aqua;width: 50px">
        <td>用户编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>昵称</td>
        <td>电话</td>
        <td>邮箱</td>
    </tr>
    <#list users as user>
        <tr style="background-color: #66d262">
            <td>${user.uid}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.name}</td>
            <td>${user.telephone}</td>
            <td>${user.email}</td>
        </tr>
    </#list>
</table>

<#--#获取数组长度-->
${users?size}<br>

<p>获取第一个：${users?first}</p>
<p>获取最后一个：${users?last}</p>
<p>倒叙输出：
    <#list users?reverse as user>
        ${user}<br>
    </#list>
</p>
<p>升序输出：
    <#list users?sort as user>
        ${user}<br>
    </#list>
</p>
<p>降序输出:
    <#list users?sort?reverse as user>
        ${user}<br>
    </#list>
</p>
<p>按指定字段输出:
    <#list users?sort_by("uid") as user>
        ${user}<br>
    </#list>
</p>
<p>判断是否为空，返回boolean类型：${(users??)?string}</p>

<#--
	assign 自定义变量指令
		语法：
			<#assign 变量名=值>
			<#assign 变量名=值 变量名=值> （定义多个变量）
-->
    <#assign name="zhangshan">
    <#assign age=[23,25,48] sex="男" test="">
    ${name}<br>
    ${age?join("++")}--${sex}
    <#if sex=="男">
        男
        <#elseif sex=="女">
        女
        <#else>
        不男不女
    </#if>
    <#if test??>
        数据存在
        <#else>
        数据不存在
    </#if><br>
<#--
macro 自定义指令 （宏）
    1. 基本使用
    格式：
        <#macro 指令名>
            指令内容
        </#macro>
    使用：
        <@指令名></@指令名>
     2. 有参数的自定义指令
    格式：
        <#macro 指令名 参数名1 参数名2>
            指令内容
        </#macro>
    使用：
        <@指令名 参数名1=参数值1 参数名2=参数值2></@指令名>
注：
    1. 指令可以被多次使用。
    2. 自定义指令中可以包含字符串，也可包含内置指令
-->
    <#macro mym>
        123456789
    </#macro>
    <@mym></@mym><br>
    <#macro username name1 name2>
        通过用户名查询用户信息:${name1}-${name2}
    </#macro>
    <@username name1="abc" name2="def"></@username>

