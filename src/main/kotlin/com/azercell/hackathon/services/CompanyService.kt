package com.azercell.hackathon.services

import com.azercell.hackathon.models.common.Company
import com.azercell.hackathon.models.exceptions.BaseException
import com.azercell.hackathon.repository.CompanyRepository
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyService(private val companyRepository: CompanyRepository) {
    fun getAll(): MutableIterable<Company> = companyRepository.findAll()
    fun getById(id: Long): Company = companyRepository.findById(id).orElseThrow { BaseException.CompanyNotFound() }
}