package com.example.demo2911;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello Test"));
    }

    @Test
    public void testReverseString() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse")
                .param("input", "Hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("olleH"));
    }

    @Test
    public void testReverseStringEmpty() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse")
                .param("input", ""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

    @Test
    public void testReverseStringWithSpecialCharacters() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse")
                .param("input", "Hello World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("!dlroW olleH"));
    }

    @Test
    public void testRemoveVowels() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/remove-vowels")
                .param("input", "Hello World"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll Wrld"));
    }

    @Test
    public void testRemoveVowelsEmpty() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/remove-vowels")
                .param("input", ""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));
    }

    @Test
    public void testRemoveVowelsWithSpecialCharacters() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/remove-vowels")
                .param("input", "Hello World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll Wrld!"));
    }

    @Test
    public void testIsPalindrome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/is-palindrome")
                .param("input", "madam"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("true"));
    }

    @Test
    public void testIsNotPalindrome() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/is-palindrome")
                .param("input", "hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("false"));
    }
    
}