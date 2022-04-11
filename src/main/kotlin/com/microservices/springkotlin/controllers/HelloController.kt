package com.microservices.springkotlin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        if (name.isNotBlank()) return "Hello, $name"
         return "Hello, World"
    }
}