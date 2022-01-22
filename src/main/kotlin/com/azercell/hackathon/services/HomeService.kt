package com.azercell.hackathon.services

import com.azercell.hackathon.models.home.HomeItem
import com.azercell.hackathon.models.home.HomeSection
import com.azercell.hackathon.models.home.items.BusinessIdeaHomeItem
import com.azercell.hackathon.models.home.items.ProductHomeItem
import com.azercell.hackathon.models.home.items.ProposalHomeItem
import com.azercell.hackathon.repository.IdeasRepository
import com.azercell.hackathon.repository.ProductRepository
import com.azercell.hackathon.repository.ProposalRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class HomeService(
    private val productRepository: ProductRepository,
    private val ideasRepository: IdeasRepository,
    private val proposalRepository: ProposalRepository
) {
    private val topFivePageRequest = PageRequest.of(0, 5, Sort.by(Sort.Direction.DESC, "upvotes"))

    fun buildDashboard(): List<HomeSection<HomeItem>> = mutableListOf<HomeSection<HomeItem>>().apply {
        add(HomeSection("Products", buildProductItems()))
        add(HomeSection("Business ideas", buildBusinessIdeaItems()))
        add(HomeSection("Proposals", buildProposalItems()))
    }

    private fun buildProductItems(): List<ProductHomeItem> {
        val page = productRepository.findAll(topFivePageRequest)
        return page.get().map { ProductHomeItem(it) }.toList()
    }

    private fun buildBusinessIdeaItems(): List<BusinessIdeaHomeItem> {
        val page = ideasRepository.findAll(topFivePageRequest)
        return page.get().map { BusinessIdeaHomeItem(it) }.toList()
    }

    private fun buildProposalItems(): List<ProposalHomeItem> {
        val page = proposalRepository.findAll(topFivePageRequest)
        return page.get().map { ProposalHomeItem(it) }.toList()
    }
}