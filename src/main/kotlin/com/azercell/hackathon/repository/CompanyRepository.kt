package com.azercell.hackathon.repository

import com.azercell.hackathon.models.common.Company
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository: CrudRepository<Company, Long>