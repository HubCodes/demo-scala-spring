package com.example.demoscalawebflux.controller

import com.example.demoscalawebflux.entity.Member
import com.example.demoscalawebflux.repository.DemoRepository
import org.springframework.web.bind.annotation.{GetMapping, RestController}
import reactor.core.publisher.{Flux, Mono}

@RestController
class DemoController(private val demoRepository: DemoRepository) {
  @GetMapping(Array("/hello"))
  def get(): Mono[String] = {
    val mono = Mono.just("Hello, Scala + Spring boot + Webflux + R2dbc!")
    for {
      str <- mono
      result = str + "!!!"
    } yield result
  }

  @GetMapping(Array("/demo"))
  def getDemo: Flux[Member] = demoRepository.findAll()
}
