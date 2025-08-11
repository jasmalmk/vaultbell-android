package com.example.vaultbell.domain

import com.example.vaultbell.data.DocumentDao

class GetDocumentsUseCase(private val dao: DocumentDao) {
    suspend fun execute(): List<Document> =
        dao.getAll().map { entity ->
            Document(
                id = entity.id,
                title = entity.title,
                filePath = entity.filePath,
                expiryDate = entity.expiryDate,
                isFamily = entity.isFamily
            )
        }
}