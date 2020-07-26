package com.example.demo.controller;

import com.example.demo.service.FirstDegreeEquationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstDegreeEquationController {
    @Autowired
    private FirstDegreeEquationService firstDegreeEquationService;

    @GetMapping("firstDegreeEquation")
    public ResponseEntity<Object> firstDegreeEquation1(@RequestParam double a, @RequestParam double b) {
        Object result = this.firstDegreeEquationService.firstDegreeEquation(a,b);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
