package com.springbootmabatisplusdemo4.mapper;

import com.springbootmabatisplusdemo4.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Classname TestMapper
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/6/21 15:05
 * @Created by 石傲
 */
public interface TestMapper extends JpaRepository<User,Integer> , JpaSpecificationExecutor<User> {
    List<User> findByUsernameAndPassword(String username, Integer password);

    @Query("from  User  where  username=?1 ")
    List<User>  findUserByUsername(String  username);
}
