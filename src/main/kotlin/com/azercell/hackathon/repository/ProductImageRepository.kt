package com.azercell.hackathon.repository

import com.azercell.hackathon.models.product.ProductImage
import org.springframework.data.repository.CrudRepository

interface ProductImageRepository: CrudRepository<ProductImage, Long>