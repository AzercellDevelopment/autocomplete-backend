package com.azercell.hackathon.controllers

import com.azercell.hackathon.services.ProposalsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ProposalsController(private val service: ProposalsService) {
    @GetMapping("/proposals")
    fun retrieve() = service.getAll()

    @GetMapping("/proposal/{id}")
    fun retrieveById(@PathVariable id: Long) = service.getById(id)
}