package com.azercell.hackathon.repository

import com.azercell.hackathon.models.common.Category
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository: CrudRepository<Category, Long>