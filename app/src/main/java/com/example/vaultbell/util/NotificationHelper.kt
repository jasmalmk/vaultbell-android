package com.example.vaultbell.util

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.vaultbell.R

object NotificationHelper {
    fun showReminder(context: Context, message: String) {
        val builder = NotificationCompat.Builder(context, "vaultbell_channel")
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("VaultBell Reminder")
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        NotificationManagerCompat.from(context).notify(1, builder.build())
    }
}