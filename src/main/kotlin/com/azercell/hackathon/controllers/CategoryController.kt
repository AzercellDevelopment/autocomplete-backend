package com.azercell.hackathon.controllers

import com.azercell.hackathon.models.common.Category
import com.azercell.hackathon.services.CategoryService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/categories")
class CategoryController(private val handler: CategoryService) {
    @GetMapping
    fun retrieve() = handler.getAll()

    @PostMapping
    fun createCategory(@RequestBody category: Category) = handler.createCategory(category)
}