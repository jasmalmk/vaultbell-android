package com.example.vaultbell.util

import android.content.Context
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.MasterKey
import java.io.File

object DocumentEncryptor {
    fun getEncryptedFile(context: Context, file: File): EncryptedFile {
        val masterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()
        return EncryptedFile.Builder(
            context,
            file,
            masterKey,
            EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
        ).build()
    }
}