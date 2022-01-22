package com.azercell.hackathon.services

import com.azercell.hackathon.dto.ProposalDto
import com.azercell.hackathon.models.exceptions.BaseException
import com.azercell.hackathon.models.proposal.Proposal
import com.azercell.hackathon.repository.ProposalRepository
import org.springframework.stereotype.Service

@Service
class ProposalsService(private val proposalRepository: ProposalRepository) {
    fun getAll(): MutableList<Proposal> = proposalRepository.findAll()
    fun getById(id: Long): ProposalDto = proposalRepository.findById(id).map { ProposalDto(it) }.orElseThrow { BaseException.ProposalNotFound() }
}
