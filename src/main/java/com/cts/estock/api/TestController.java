package com.cts.estock.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/test")
public class TestController{
@GetMapping("/v1")
public String testApi(){
    return "APi test is working on Azure";
}
}
