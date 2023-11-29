package com.example.demo2911;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Entrada: Ninguna");
        String output = "Hello World";
        System.out.println("Salida: " + output);
        return output;
    }

    @GetMapping("/reverse")
    public String reverseString(@RequestParam("input") String input) {
        System.out.println("Entrada: " + input);
        StringBuilder reversed = new StringBuilder(input);
        String output = reversed.reverse().toString();
        System.out.println("Salida: " + output);
        return output;
    }

    

    @GetMapping("/remove-vowels")
    public String removeVowels(@RequestParam("input") String input) {
        System.out.println("Entrada: " + input);
        String output = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Salida: " + output);
        return output;
    }

    @GetMapping("/is-palindrome")
    public boolean isPalindrome(@RequestParam("input") String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

}

