package com.azercell.hackathon.models.exceptions

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

class ErrorResponse(val code: String, val message: String)

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(value = [RuntimeException::class])
    @ResponseBody
    fun handleExceptions(exception: BaseException): ResponseEntity<ErrorResponse> {
        val response = ErrorResponse(exception.code, exception.message.orEmpty())
        return ResponseEntity.status(exception.status).body(response)
    }
}