package com.azercell.hackathon.repository

import com.azercell.hackathon.models.proposal.Proposal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProposalRepository: JpaRepository<Proposal, Long>