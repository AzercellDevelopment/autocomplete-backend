package com.azercell.hackathon.services

import com.azercell.hackathon.models.exceptions.BaseException
import com.azercell.hackathon.models.idea.BusinessIdea
import com.azercell.hackathon.repository.IdeasRepository
import org.springframework.stereotype.Service

@Service
class BusinessIdeaService(private val ideasRepository: IdeasRepository) {
    fun getAll(): MutableList<BusinessIdea> = ideasRepository.findAll()
    fun getAllByCategoryId(id: Long) = ideasRepository.findAllByCategoryId(id)
    fun getById(id: Long): BusinessIdea = ideasRepository.findById(id).orElseThrow { BaseException.IdeaNotFound() }
}
