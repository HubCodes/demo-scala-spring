package com.example.demoscalawebflux.repository

import com.example.demoscalawebflux.entity.Member
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
trait DemoRepository extends ReactiveCrudRepository[Member, String]
