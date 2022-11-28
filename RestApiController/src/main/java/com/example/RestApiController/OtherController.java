package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class OtherController {
//    @Autowired
//    User obj1 ;
    private  int id = 5  ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  OtherController(){
          System.out.println("spring is creating the object in the other controller");
      }
//      public User fun(){
//          System.out.println("the address in other controller" + obj1);
//          return obj1 ;
//      }
}
