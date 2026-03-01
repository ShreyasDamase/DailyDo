package com.example.dailydo.ui.screens.todo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailydo.ui.theme.DailyDoTheme
import com.example.dailydo.ui.theme.Tokens
import com.example.dailydo.ui.theme.foundation.AppShapes
import com.example.dailydo.ui.theme.foundation.AppTypography
import com.example.dailydo.ui.theme.tokens.AppColors

data class Triple(val string: String, val favorite: ImageVector)

@Composable
fun AddTaskSheet(onSave: () -> Unit, onDismiss: () -> Unit) {
    var title by remember { mutableStateOf("") }

    var description by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("Work") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .padding(bottom = 24.dp)
    ) {


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Add New Task",
                style = AppTypography.headlineSmall,
                color = Tokens.colors.text.primary
            )
            IconButton(onClick = onDismiss) {
                Icon(
                    Icons.Rounded.Close,
                    contentDescription = "Close",
                    tint = Tokens.colors.icon.muted
                )
            }
        }

        Spacer(Modifier.height(90.dp))

        Text("Task Title", style = AppTypography.titleSmall, color = Tokens.colors.text.brand)
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    "What needs to be done?",
                    style = AppTypography.bodyLarge,
                    color = Tokens.colors.text.pinkLight
                )
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            shape = AppShapes.extraLarge,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Tokens.colors.icon.primary,
                focusedBorderColor = Tokens.colors.icon.primary,

                unfocusedContainerColor = Tokens.colors.surface.pressed,
                focusedContainerColor = Tokens.colors.surface.pressed
            )
        )

        Spacer(Modifier.height(24.dp))
        Text("DESCRIPTION", style = AppTypography.titleSmall, color = Tokens.colors.text.brand)
        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    "Add more details about this task...",
                    style = AppTypography.bodyLarge,
                    color = Tokens.colors.text.pinkLight
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            maxLines = 5,
            shape = AppShapes.extraLarge,
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Tokens.colors.icon.primary,
                focusedBorderColor = Tokens.colors.icon.primary,

                unfocusedContainerColor = Tokens.colors.surface.pressed,
                focusedContainerColor = Tokens.colors.surface.pressed
            )
        )
        Spacer(Modifier.height(24.dp))

        Text("Due Date", style = AppTypography.titleSmall, color = Tokens.colors.text.brand)
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, color = Tokens.colors.icon.primary, shape = AppShapes.extraLarge)
                .clip(AppShapes.extraLarge)
                .background(Tokens.colors.surface.pressed)
                .padding(horizontal = 16.dp, vertical = 17.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Icon(
                imageVector = Icons.Rounded.Favorite,//temp

//                painter = painterResource(R.drawable.calender),
                contentDescription = null,
                tint = AppColors.PinkBrand,
                modifier = Modifier.size(24.dp)
            )
            Text(
                "Tomorrow, Oct 24",
                style = AppTypography.titleSmall,
                color = Tokens.colors.text.primary
            )

        }
        Spacer(Modifier.height(24.dp))

        Text("Category", style = AppTypography.titleSmall, color = Tokens.colors.text.brand)
        Spacer(Modifier.height(12.dp))

        val categoryOption = listOf(
            Triple("Work", Icons.Rounded.Favorite),
            Triple("Work", Icons.Rounded.Favorite),
            Triple("Work", Icons.Rounded.Favorite), Triple("Work", Icons.Rounded.Favorite),
            Triple("Work", Icons.Rounded.Favorite),
            Triple("Work", Icons.Rounded.Favorite)
        )
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            categoryOption.forEach { (cat, icon) ->

                CategorySelectChip(
                    label = cat,
                    icon = icon,

                    isSelected = selectedCategory == cat,
                    onClick = { selectedCategory = cat }
                )

            }
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = AppShapes.extraLarge,
            colors = ButtonDefaults.buttonColors(
                containerColor = Tokens.colors.card.dark,
                contentColor = Tokens.colors.card.primary
            ),
            elevation = ButtonDefaults.buttonElevation(0.dp)
        ) {
            Icon(Icons.Rounded.CheckCircle, contentDescription = null)
            Spacer(Modifier.width(8.dp))
            Text(
                "Save Task",
                style = AppTypography.headlineMedium,
            )
        }


    }
}


@Composable
fun CategorySelectChip(label: String, icon: ImageVector, isSelected: Boolean, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clip(AppShapes.extraLarge)
            .background(if (isSelected) Tokens.colors.card.dark else Tokens.colors.card.mute)
            .border(
                width = 1.dp,
                color = if (isSelected) Tokens.colors.border.muted else Tokens.colors.border.muted,
                shape = AppShapes.extraLarge
            )
            .clickable { onClick() }
            .padding(horizontal = 11.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = if (isSelected) Tokens.colors.card.mute else Tokens.colors.card.dark,
            modifier = Modifier.size(16.dp)
        )
        Text(
            label,
            style = AppTypography.titleMedium,
            color = if (isSelected) Tokens.colors.text.inverse else Tokens.colors.text.tertiary
        )

    }
}

@Preview(
    showBackground = true,
)
@Composable
fun AddTaskSheetPreview() {
    DailyDoTheme(darkTheme = false) {
        AddTaskSheet(
            onSave = { },
            onDismiss = {}
        )
    }
}

