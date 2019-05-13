package com.otajisan.playground.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Jackson普通に使えるよね？
 */
@RestController
@RequestMapping
class JacksonSampleController(
        val mapper: ObjectMapper) {

    /**
     * ControllerはPOJOをJson変換するよね？
     */
    @GetMapping("/jackson1")
    fun getJson1(): List<Member> {
        return DUMMY_LIST
    }

    /**
     * SpringはObjectMapperをDIしてるよね？
     */
    @GetMapping("/jackson2")
    fun getJson2(): String {
        return mapper.writeValueAsString(DUMMY_LIST)
    }

    data class Member(val name: String, val age: Int)

    companion object {
        val DUMMY_LIST = listOf(Member("shuhei", 38),
                Member("taji", 33),
                Member("bunta", 35))
    }

}
