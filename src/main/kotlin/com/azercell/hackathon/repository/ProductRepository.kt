package com.azercell.hackathon.repository

import com.azercell.hackathon.models.product.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {
    fun findAllByCategoryId(id: Long): MutableIterable<Product>
}