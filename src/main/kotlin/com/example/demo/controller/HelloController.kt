package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    lateinit var accountService: AccountService

    @GetMapping("/hello")
    fun helloWorld():ResponseEntity<String>{
        return ResponseEntity.ok().body("HelloWorld")
    }

    @GetMapping("/calculate")
    fun calculate() :ResponseEntity<String>{
        return ResponseEntity.ok().body("<h1>calculate</h1>")
    }

    @GetMapping("/account/{firstName}")
    fun getAccountByFirstName(@PathVariable firstName: String): ResponseEntity<User> {
        val user = accountService.findAccountByName(firstName)
        return ResponseEntity.ok().body(user)
    }
}