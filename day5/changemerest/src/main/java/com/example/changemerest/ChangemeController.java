package com.example.changemerest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/")
public class ChangemeController {

    @GetMapping
    public String hello() {
        return "Hello ";
    }

    @PostMapping
    public String helloPost() {
        return "Post method was called";
    }

    @PutMapping
    public String helloPut() {
        return "Put method was called";
    }

    @DeleteMapping
    public String helloDelete() {
        return "Delete method was called";
    }

    @GetMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/params")
    public String helloParams(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort", defaultValue = "desc", required = false) String sort) {
        return "Hello params was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
    }
    @GetMapping("/quote")
    public String getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",String.class);
    }


}
