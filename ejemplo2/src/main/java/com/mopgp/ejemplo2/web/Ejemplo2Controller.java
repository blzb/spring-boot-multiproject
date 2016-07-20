package com.mopgp.ejemplo2.web;

import com.mopgp.framework.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo2")

class Ejemplo2Controller {
  final static String response = "Greetings from Spring Boot!";
  @Autowired
  TestService testService;
  @RequestMapping("/test")
  String index() {
    return testService.getRandom()+"Controller";
  }

}