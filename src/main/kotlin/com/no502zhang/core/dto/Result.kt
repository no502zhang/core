package com.no502zhang.core.dto

data class Result<T>(val status: Int, val message: String, val data: T, val timestamp: Number = System.currentTimeMillis())