package com.example.demoscalawebflux

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
class JacksonConfiguration {
  @Bean
  def objectMapper: ObjectMapper = {
    val objectMapper = new ObjectMapper()
    objectMapper.registerModule(DefaultScalaModule)
    objectMapper
  }
}
