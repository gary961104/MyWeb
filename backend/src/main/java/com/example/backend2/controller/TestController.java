package com.example.backend2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@RestController(value = "test")
public class TestController {

    @GetMapping(value = "test1")
    public void test(){
        SignUtils signUtils = new SignUtils();
        signUtils.put("timestamp", "1670549739457");
        signUtils.put("amount", "100");
        signUtils.put("userName", "alden");
        signUtils.put("userPhone", "09844789231");
        signUtils.put("orderNo", "fpx08742139912");

        String sign = signUtils.getSign();
        System.out.println(sign);
    }

    @GetMapping(value = "test2")
    public void test2(){
        StringReverser reverser = new StringReverser();

        // 测试反转整个字符串
        String reversedString = reverser.reverse("Hello");
        System.out.println("整个字符串反转：" + reversedString);

        // 测试反转前 k + 1 个字符
        String partialReversedString = reverser.reverse("World", 2);
        System.out.println("前 3 个字符反转：" + partialReversedString);
    }

}

class SignUtils {
    private TreeMap<String, String> data;

    // 初始化 SignUtils 物件
    public SignUtils() {
        data = new TreeMap<>();
    }

    // 在物件中插入一個鍵值對
    public void put(String key, String value) {
        data.put(key, value);
    }

    // 將物件所有插入的鍵值對依照 key 的字典順序升序組成一個字串並返回
    public String getSign() {
        StringBuilder result = new StringBuilder();
        for (String key : data.keySet()) {
            result.append(key + "=").append(data.get(key) + "&");
        }
        return result.toString();
    }
}

class StringReverser {

    // 将整个字符串反转
    public String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }

    // 将字符串的前 k + 1 个字符反转，后面部分保持不变
    public String reverse(String s, int k) {
        if (k >= s.length()) {
            // 如果 k 大于或等于字符串的长度，直接返回整个字符串反转的结果
            return reverse(s);
        }

        // 反转前 k + 1 个字符
        StringBuilder reversedPrefix = new StringBuilder(s.substring(0, k + 1)).reverse();

        // 将反转后的前缀与剩余部分拼接
        return reversedPrefix.toString() + s.substring(k + 1);
    }
}