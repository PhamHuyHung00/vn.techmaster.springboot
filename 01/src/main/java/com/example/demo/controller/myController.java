package com.example.demo.controller;

import com.example.demo.controller.model.BMI;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class myController {
    @GetMapping("/random")
    public String random() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuvmxyz1234567890";
        Random rnd = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = rnd.nextInt(str.length());
            stringBuilder.append(str.charAt(index));
        }
        return stringBuilder.toString();
    }

    @GetMapping("/quote")
    public String quote() {
        Random rnd = new Random();
        String s1 = "";
        String[] str = {"Kiến tha lâu đầy tổ", "Có công mài sắt, có ngày nên kim", "Không thầy đố mày làm nên", "Học thầy không tày học bạn"};
        for (int i = 0; i < str.length; i++) {
            int index = rnd.nextInt(str.length);
            s1 = str[index];
        }
        return s1;
    }

    @PostMapping("/bmi")
    public BMI calculateBmi(@RequestBody BMI bmi) {
        return bmi;
    }


}