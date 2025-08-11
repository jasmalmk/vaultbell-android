package com.example.vaultbell.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DocumentDao {
    @Insert
    suspend fun insert(document: DocumentEntity)

    @Query("SELECT * FROM documents")
    suspend fun getAll(): List<DocumentEntity>
}