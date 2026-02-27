package com.example.dailydo.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dailydo.ui.theme.Tokens

@Composable
fun HomeScreen(
    isDark: Boolean,
    onToggleTheme: (Boolean) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Tokens.colors.bg.primary)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Home",
            color = Tokens.colors.text.primary,
            style = MaterialTheme.typography.titleLarge
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Tokens.colors.surface.raised,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = if (isDark) "Dark Mode" else "Light Mode",
                color = Tokens.colors.text.primary
            )

            Switch(
                checked = isDark,
                onCheckedChange = onToggleTheme,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Tokens.colors.brand.light,
                    checkedTrackColor = Tokens.colors.brand.default,
                    uncheckedThumbColor = Tokens.colors.icon.muted,
                    uncheckedTrackColor = Tokens.colors.surface.pressed
                )
            )
        }
    }
}