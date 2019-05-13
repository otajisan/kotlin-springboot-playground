package com.otajisan.playground.controller

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Kotlinでハロワ
 */
@RestController
@RequestMapping
class HelloKotlinController {

    /**
     * @see <a href="http://localhost:8080/hello">http://localhost:8080/hello</a>
     */
    @GetMapping("/hello")
    fun get(): String {
        return "Hello Kotlin"
    }
}
