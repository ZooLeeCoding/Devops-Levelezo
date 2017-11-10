package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a, 
    @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }

    @RequestMapping("/sub")
    String sub(@RequestParam("a") Integer a, 
    @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sub(a, b));
    }

    @RequestMapping("/mul")
    String mul(@RequestParam("a") Integer a, 
    @RequestParam("b") Integer b) {
        return String.valueOf(calculator.mul(a, b));
    }

    @RequestMapping("/div")
    String div(@RequestParam("a") Integer a, 
    @RequestParam("b") Integer b) {
        return String.valueOf(calculator.div(a, b));
    }

}