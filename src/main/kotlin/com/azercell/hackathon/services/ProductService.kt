package com.azercell.hackathon.services

import com.azercell.hackathon.models.exceptions.BaseException
import com.azercell.hackathon.models.product.Product
import com.azercell.hackathon.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun getAll(): MutableIterable<Product> = productRepository.findAll()
    fun getProductsByCategoryId(id: Long): MutableIterable<Product> = productRepository.findAllByCategoryId(id)
    fun getById(id: Long): Product = productRepository.findById(id).orElseThrow { BaseException.IdeaNotFound() }

    fun upvote(id: Long): Product {
        val product = productRepository.findById(id).orElseThrow { BaseException.ProductNotFound() }
        return productRepository.save(product.copy(upvotes = product.upvotes?.inc()))
    }

    fun downvote(id: Long): Product {
        val product = productRepository.findById(id).orElseThrow { BaseException.ProductNotFound() }
        return productRepository.save(product.copy(upvotes = product.upvotes?.dec()))
    }
}
