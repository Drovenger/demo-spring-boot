package com.example.demo.controller;

import com.example.demo.service.CountNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

class CountNumber {
    public int[] a;
    public int k;
}

@RestController
public class CountNumberController {
    @Autowired
    private CountNumberService countNumberService;

//    @GetMapping("countNumber")
//    public ResponseEntity<Integer> countNumber(@RequestParam int[] a, @RequestParam int k) {
//        Integer value = this.countNumberService.countNumber(a, k);
//        return new ResponseEntity<>(value, HttpStatus.OK);
//    }

    @PutMapping("countNumber")
    public ResponseEntity<Integer> countNumber1(@RequestBody CountNumber countNumber) {
        Integer value = this.countNumberService.countNumber(countNumber.a, countNumber.k);
        return new ResponseEntity<>(value, HttpStatus.OK);
    }

//    @PutMapping("countNumber2")
//    public ResponseEntity<Integer> countNumber2(@ModelAttribute("a") int[] a, @ModelAttribute("k") int k) {
//        Integer value = this.countNumberService.countNumber(a, k);
//        return new ResponseEntity<>(value, HttpStatus.OK);
//    }
}
