package com.azercell.hackathon.services

import com.azercell.hackathon.models.common.Category
import com.azercell.hackathon.repository.CategoryRepository
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException

@Service
class CategoryService(private val categoryRepository: CategoryRepository) {
    fun getAll(): MutableIterable<Category> = categoryRepository.findAll()

    fun createCategory(category: Category): Category {
        if (category.id != null) {
            throw IllegalArgumentException("ID should be null")
        }

        return categoryRepository.save(category)
    }
}