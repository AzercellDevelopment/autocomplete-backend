package com.azercell.hackathon.models.exceptions

import org.springframework.http.HttpStatus

sealed class BaseException(val code: String, val status: HttpStatus, message: String): RuntimeException(message) {
    companion object {
        const val companyNotFound = "C-1"
        const val productNotFound = "C-2"
        const val ideaNotFound = "C-3"
        const val proposalNotFound = "C-4"
    }

    class CompanyNotFound: BaseException(companyNotFound, HttpStatus.NOT_FOUND, "Company not found")
    class ProductNotFound: BaseException(productNotFound, HttpStatus.NOT_FOUND, "Product not found")
    class IdeaNotFound: BaseException(ideaNotFound, HttpStatus.NOT_FOUND, "Idea not found")
    class ProposalNotFound: BaseException(proposalNotFound, HttpStatus.NOT_FOUND, "Proposal not found")
}