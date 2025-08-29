package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example")
public class AppConfi {

    //@Bean(name={"com","Beast","desktop1"})


//    @Scope("prototype")


//
//    @Bean
//    public Alien alien(@Qualifier("laptop") Computer com){
//        Alien obj = new Alien();
//        obj.setAge(34);
//        obj.setCom(com);
//        return obj;
//    }
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//  //  @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
