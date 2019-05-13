package com.otajisan.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringbootPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringbootPlaygroundApplication>(*args)
}
