package com.azercell.hackathon.repository

import com.azercell.hackathon.models.idea.BusinessIdea
import com.azercell.hackathon.models.product.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IdeasRepository: JpaRepository<BusinessIdea, Long> {
    fun findAllByCategoryId(id: Long): MutableIterable<BusinessIdea>
}