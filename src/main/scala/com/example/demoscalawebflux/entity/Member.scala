package com.example.demoscalawebflux.entity

import org.springframework.data.annotation.Id

case class Member(
  @Id
  id: String,

  name: String,

  age: Int
)
