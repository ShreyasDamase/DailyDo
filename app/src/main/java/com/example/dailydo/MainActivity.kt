package com.example.dailydo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailydo.ui.theme.AppTheme
import com.example.dailydo.ui.theme.foundation.AppTypography
import com.example.dailydo.ui.theme.tokens.AppColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemePlayground()
        }
    }
}

/* ────────────────────────────────────────────── */
/* THEME PLAYGROUND */
/* ────────────────────────────────────────────── */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemePlayground() {
    var dark by remember { mutableStateOf(false) }

    AppTheme(darkTheme = dark) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Theme Playground") },
                    actions = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("Dark")
                            Switch(
                                checked = dark,
                                onCheckedChange = { dark = it }
                            )
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {

                TypographySection()
                ColorSection()
                ShapeSection()
                ElevationSection()
            }
        }
    }
}

/* ────────────────────────────────────────────── */
/* TYPOGRAPHY */
/* ────────────────────────────────────────────── */

@Composable
private fun TypographySection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Typography", style = MaterialTheme.typography.titleLarge)

        Text("Display Large", style = AppTypography.displayLarge)
        Text("Headline Medium", style = AppTypography.headlineMedium)
        Text("Title Medium", style = AppTypography.titleMedium)
        Text("Body Large", style = AppTypography.bodyLarge)
        Text("Body Small", style = AppTypography.bodySmall)
        Text("Label Small", style = AppTypography.labelSmall)
    }
}

/* ────────────────────────────────────────────── */
/* COLORS */
/* ────────────────────────────────────────────── */

@Composable
private fun ColorSection() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Colors", style = MaterialTheme.typography.titleLarge)

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            ColorBox("Primary", MaterialTheme.colorScheme.primary)
            ColorBox("Secondary", MaterialTheme.colorScheme.secondary)
            ColorBox("Error", MaterialTheme.colorScheme.error)
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            ColorBox("Surface", MaterialTheme.colorScheme.surface)
            ColorBox("Background", MaterialTheme.colorScheme.background)
            ColorBox("Outline", MaterialTheme.colorScheme.outline)
        }
    }
}

@Composable
private fun ColorBox(label: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color, RoundedCornerShape(12.dp))
        )
        Text(label, textAlign = TextAlign.Center)
    }
}

/* ────────────────────────────────────────────── */
/* SHAPES */
/* ────────────────────────────────────────────── */

@Composable
private fun ShapeSection() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Shapes", style = MaterialTheme.typography.titleLarge)

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.shapes.small
                    )
            )
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.shapes.medium
                    )
            )
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.shapes.large
                    )
            )
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        CircleShape
                    )
            )
        }
    }
}

/* ────────────────────────────────────────────── */
/* ELEVATION */
/* ────────────────────────────────────────────── */

@Composable
private fun ElevationSection() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Elevation", style = MaterialTheme.typography.titleLarge)

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            ElevatedCard(elevation = CardDefaults.cardElevation(1.dp)) {
                CardBox("1dp")
            }
            ElevatedCard(elevation = CardDefaults.cardElevation(6.dp)) {
                CardBox("6dp")
            }
            ElevatedCard(elevation = CardDefaults.cardElevation(12.dp)) {
                CardBox("12dp")
            }
        }
    }
}

@Composable
private fun CardBox(text: String) {
    Box(
        modifier = Modifier
            .size(80.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text)
    }
}

/* ────────────────────────────────────────────── */
/* PREVIEW */
/* ────────────────────────────────────────────── */

@Preview(showBackground = true)
@Composable
fun ThemePlaygroundPreview() {
    ThemePlayground()
}