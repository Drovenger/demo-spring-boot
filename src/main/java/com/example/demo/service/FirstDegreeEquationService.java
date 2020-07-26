package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FirstDegreeEquationService {

    static class Result {
        public double decimal;
        public String fraction;
        public String message;
    }

    public Object firstDegreeEquation(double a, double b) {
        int an = intNum(a,b);
        int bn = intNum(b,a);
        int gdc = gcd(an, bn);
        an = an / gdc;
        bn = bn / gdc;
        Result result = new Result();
        if (an == 0) {
            if (bn == 0) {
                result.message = "Pt co vo so nghiem";
            } else {
                result.message = "Pt vo nghiem";
            }
        } else {
            result.decimal = -bn / an;
            result.fraction = "-" + bn + "/" + an;
        }
        return result;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int intNum(double a, double b) {
        int result;
        while (a % 1 != 0 || b % 1 != 0) {
            a *= 10;
        }
        result = (int) a;
        return result;
    }
}
