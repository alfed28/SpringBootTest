package com.springbootmabatisplusdemo4;

import com.springbootmabatisplusdemo4.domain.User;
import com.springbootmabatisplusdemo4.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBootMabatisPlusDemo4ApplicationTests {

    @Autowired
    private TestMapper t;
    @Test
    void test1() {
        User u=new User();
        u.setUsername("test7");
        u.setPassword(123456);
        u.setIsdeleted(0);
        t.save(u);
    }
    @Test
    void test2(){
        User u=new User();
        u.setPassword(123456);
        u.setUsername("test7");
        t.delete(u);
    }
    @Test
    void test3(){
        User u=new User();
        u.setPassword(654321);
        u.setUsername("test7");
        u.setUid(2l);
        u.setIsdeleted(1);
        t.save(u);
    }
    @Test
    void test4(){
        User user = t.findById(2).get();
        System.out.println(user);
    }
    @Test
    void test5(){
        List<User> all = t.findAll();
        all.forEach(System.out::println);
    }
    @Test
    void test6(){
        Sort uid = Sort.by(Sort.Order.desc("uid"));
        List<User> all = t.findAll(uid);
        all.forEach(System.out::println);
    }
    @Test
    void   test7(){
//        分页,页码从0开始
        Pageable pageable= PageRequest.of(0,2);

        Page<User> page = t.findAll(pageable);
        List<User> users = page.getContent();
        users.forEach(System.out::println);
    }
    @Test
    void test8(){
        Sort uid = Sort.by(Sort.Order.desc("uid"));
        Pageable pageable= PageRequest.of(0,2,uid);

        Page<User> all = t.findAll(pageable);
        all.forEach(System.out::println);
    }
    @Test
    void   test9(){
        /*任意条件查询*/

        List<User>   users=t.findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate>   where  =new ArrayList<>();

//                username=zhagnsan
                where.add(criteriaBuilder.equal(root.get("username"),"test7"));
                where.add(criteriaBuilder.ge(root.get("uid"),2));

                Predicate or = criteriaBuilder.or(where.toArray(new Predicate[0]));

                return or;
            }
        });

        users.forEach(System.out::println);
    }
    @Test
    void test10(){
        List<User> t = this.t.findByUsernameAndPassword("test7", 654321);
        System.out.println(t);
    }
    @Test
    void test11(){
        List<User> test7 = t.findUserByUsername("test7");
        System.out.println(test7);
    }
}
