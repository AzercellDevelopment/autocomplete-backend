package com.azercell.hackathon.controllers

import com.azercell.hackathon.services.ProductService
import com.azercell.hackathon.models.product.Product
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ProductsController(private val handler: ProductService) {
    @GetMapping("/products")
    fun getProducts() = handler.getAll()

    @GetMapping("/product/{id}")
    fun getProductById(@PathVariable id: Long) = handler.getById(id)

    @GetMapping("/product/category/{id}")
    fun getProductsByCategoryId(@PathVariable id: Long) = handler.getProductsByCategoryId(id)

    @PutMapping("/product/upvote/{id}")
    fun upvoteProduct(@PathVariable id: Long) = handler.upvote(id)

    @PutMapping("/product/downvote/{id}")
    fun downvoteProduct(@PathVariable id: Long) = handler.downvote(id)
}