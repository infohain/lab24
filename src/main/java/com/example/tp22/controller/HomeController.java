package com.example.tp22.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp22.service.HomeService;
@RestController
public class HomeController {
	private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }
	
    @RequestMapping("/p1")
    public String home1() {
        return homeService.message1();
    }

    @RequestMapping("/p2")
    public String home2() {
        return homeService.message2();
    }

}
