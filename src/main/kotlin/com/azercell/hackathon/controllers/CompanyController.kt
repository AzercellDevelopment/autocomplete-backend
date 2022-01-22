package com.azercell.hackathon.controllers

import com.azercell.hackathon.services.CompanyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CompanyController(private val handler: CompanyService) {
    @GetMapping("/companies")
    fun getCompanies() = handler.getAll()

    @GetMapping("/company/{id}")
    fun getCompany(@PathVariable id: Long) = handler.getById(id)
}