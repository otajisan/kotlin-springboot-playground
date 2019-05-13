package com.otajisan.playground

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification
import spock.lang.Unroll

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Groovy x MockMvcでコントローラのテスト
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloKotlinControllerTest extends Specification {

    @Autowired
    MockMvc mockMvc

    @Unroll
    def "HelloKotlinController - メッセージが返る"() {
        when:
        def actual = mockMvc.perform(get("/hello"))
                .andReturn()
                .getResponse()

        then:
        actual.getStatus() == HttpStatus.OK.value
        actual.getContentAsString() == "Hello Kotlin"
    }
}
