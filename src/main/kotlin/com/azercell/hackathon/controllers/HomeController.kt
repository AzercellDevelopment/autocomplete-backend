package com.azercell.hackathon.controllers

import com.azercell.hackathon.services.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HomeController(private val handler: HomeService) {
    @GetMapping("/home")
    fun getHomeItems() = handler.buildDashboard()
}