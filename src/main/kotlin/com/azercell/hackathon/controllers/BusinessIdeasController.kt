package com.azercell.hackathon.controllers

import com.azercell.hackathon.services.BusinessIdeaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BusinessIdeasController(private val service: BusinessIdeaService) {
    @GetMapping("/ideas")
    fun retrieve() = service.getAll()

    @GetMapping("/idea/{id}")
    fun retrieveById(@PathVariable id: Long) = service.getById(id)
}