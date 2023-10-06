package com.demo.hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/json")
    public Map<String, Object> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("results", 123);
        return map;
    }
}
