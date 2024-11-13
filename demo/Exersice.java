package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exersice {

   // - GET /name : returns “My name is .......”
//            - GET /age : returns “My age is ........”
//            - GET /check/status : returns “Everything OK”
//            - GET /health : returns “Server health is up and running” - Get /names :
//            return array of names

    @GetMapping("/name")
  public String getmyname(){
      return "my name is Ebtehal";

  }
  @GetMapping("/age")
  public int getmyage(){
      System.out.print("my age is ");
        return 24;
  }
  @GetMapping("/check/status")
  public String getstatuse(){
     
   
       return "evrey thing is ok"; 
    
  }


    //GET /health : returns “Server health is up and running” - Get /names :
//            return array of names
  @GetMapping("/health")
  public String health(){
      
            return "Server health is up and running";
      
  }
@GetMapping("/names")
    public String[] getMyArray() {
        String[] myArray = {"Sara","mona","ebtehal"};
        return myArray;
    }



}
