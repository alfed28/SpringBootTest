package com.springboot_travel;

import com.springboot_travel.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTravelApplicationTests {

   @Autowired
    private PerSon perSon;
   @Autowired
   private PerSon2 perSon2;
    @Autowired
    private PerSon3 perSon3;
    @Autowired
    private PerSon4 perSon4;
    @Autowired
    private PerSon5 perSon5;

   @Test
    public void test(){
       System.out.println(perSon);
       System.out.println(perSon2);
       System.out.println(perSon3);
       System.out.println(perSon4);
       System.out.println(perSon5);
   }

}
