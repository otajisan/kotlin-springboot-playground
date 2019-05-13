package com.otajisan.playground.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * Kotlin x MockMvcでコントローラのテスト
 */
@RunWith(SpringRunner::class)
@WebMvcTest
class HelloKotlinControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun testHelloKotlinController__returnGreetingMessageSuccessfully() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk)
                .andExpect(content().string("Hello Kotlin"))
                .andReturn()
    }
}