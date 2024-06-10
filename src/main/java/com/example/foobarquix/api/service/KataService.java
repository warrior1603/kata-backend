package com.example.foobarquix.api.service;

import org.springframework.stereotype.Service;

@Service
public class KataService {
    public String transformNumber(int number) {
        StringBuilder result = new StringBuilder();
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        if (isDivisibleBy3) {
            result.append("FOO");
        }
        if (isDivisibleBy5) {
            result.append("BAR");
        }

        String numberStr = String.valueOf(number);
        for (char c : numberStr.toCharArray()) {
            if (c == '3' && !isDivisibleBy3) {
                result.append("FOO");
            }
            if (c == '5' && !isDivisibleBy5) {
                result.append("BAR");
            }
            if (c == '7') {
                result.append("QUIX");
            }
        }

        return result.length() > 0 ? result.toString() : numberStr;
    }
}
