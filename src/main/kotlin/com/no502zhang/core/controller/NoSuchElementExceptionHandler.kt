package com.no502zhang.core.controller

import com.no502zhang.core.dto.Result
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 * TODO 抽取到core中
 *//**/
@RestControllerAdvice
class NoSuchElementExceptionHandler {

    // 返回200状态, body中写异常信息
    @ExceptionHandler(NoSuchElementException::class)
    fun handleException(): ResponseEntity<Result<Nothing>> {
        return ResponseEntity.ok().body(Result(404, "Not Found", null))
    }
}