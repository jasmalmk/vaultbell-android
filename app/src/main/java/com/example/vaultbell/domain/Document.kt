package com.example.vaultbell.domain

data class Document(
    val id: Int = 0,
    val title: String,
    val filePath: String,
    val expiryDate: Long,
    val isFamily: Boolean
)