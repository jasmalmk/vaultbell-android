package com.example.vaultbell.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vaultbell.domain.Document
import com.example.vaultbell.domain.GetDocumentsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val getDocumentsUseCase: GetDocumentsUseCase) : ViewModel() {
    private val _documents = MutableStateFlow<List<Document>>(emptyList())
    val documents: StateFlow<List<Document>> = _documents

    fun loadDocuments() {
        viewModelScope.launch {
            _documents.value = getDocumentsUseCase.execute()
        }
    }
}