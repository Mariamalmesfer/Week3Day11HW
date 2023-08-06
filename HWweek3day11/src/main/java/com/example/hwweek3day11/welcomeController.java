package com.example.hwweek3day11;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path="/welcome")
@RestController
public class welcomeController {



    @GetMapping(path = "name")
    public String name (){
        return "My Name is Mariam almesfer";
    }


    @GetMapping(path = "age")
    public String  age (){
        return "My age is 22 ";
    }


    @GetMapping(path = "/check/status")
    public String  check (){
        return "Everything OK" ;
    }


   // - GET /health : returns “Server health is up and running”
    //- Get /names : return array of names

    @GetMapping(path = "/health")
    public String  health (){
        return "Server health is up and running" ;
    }


    @GetMapping(path = "/names")
    public String[] names (){
        String[] names = {"Norah", "Sultan", "Sattam", "Reem"};
        return names;
    }





}
