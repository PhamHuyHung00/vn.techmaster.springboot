package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuvmxyz1234567890";
//        System.out.println(chainRadom(str));
//        String[] proverb = {"Kiến tha lâu đầy tổ", "Có công mài sắt, có ngày nên kim", "Không thầy đố mày làm nên", "Học thầy không tày học bạn"};
//        System.out.println(proverbRandom(proverb));
    }

//    public static String chainRadom(String str) {
//        Random rdm = new Random();
//        StringBuilder strbd = new StringBuilder();
//        for (int i = 0; i < 8; i++) {
//            int rand = rdm.nextInt(str.length());
//            strbd.append((str.charAt(rand)));
//
//        }
//        return strbd.toString();
//    }

//    public static String proverbRandom(String[] s1) {
//        Random rdm = new Random();
//        String str = "";
//        for (int i = 0; i < 1; i++) {
//            int index = rdm.nextInt(s1.length);
//             str = s1[index];
//
//        }
//        return str;
//
//    }

}
