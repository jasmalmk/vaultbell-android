package com.example.vaultbell.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DocumentEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun documentDao(): DocumentDao
}