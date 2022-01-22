package com.azercell.hackathon.repository

import com.azercell.hackathon.models.product.ProductOwner
import org.springframework.data.repository.CrudRepository

interface ProductOwnerRepository: CrudRepository<ProductOwner, Long>