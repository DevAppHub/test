package com.cts.estock.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController{
@GetMapping
public String testApi(){
    return "APi test is working on Azure";
}
}
