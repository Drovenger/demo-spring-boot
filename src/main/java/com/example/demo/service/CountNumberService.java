package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CountNumberService {

    public Integer countNumber(int[] a, int k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (k == a[i]) {
                count++;
            }
        }
        return count;
    }

}
