package com.example.vaultbell.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.vaultbell.ui.MainViewModel

@Composable
fun HomeScreen(viewModel: MainViewModel) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("VaultBell") }) }
    ) { padding ->
        // TODO: List documents, add buttons for reminders, sharing, etc.
        Text("Welcome to VaultBell!", modifier = Modifier.padding(padding))
    }
}