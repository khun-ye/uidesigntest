package com.example.uidesigntest.components

import ByRoomList
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TabScreen() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("By Room", "By Rates")

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(
            selectedTabIndex = tabIndex,
            modifier = Modifier.padding(
                end = 16.dp
            ),
            indicator = { },
            divider = { },
            backgroundColor = Color.Transparent, // Set the background of the TabRow to be transparent
            contentColor = Color.Black // Set the content (text) color of the tabs
        ) {
            tabs.forEachIndexed { index, title ->
                CustomTab(
                    title = title,
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> ByRoomList()
            1 -> ByRatesList()
        }
    }
}

@Composable
fun CustomTab(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = if (selected) Color(0xFF68A0B0)
    else Color.Transparent
    val contentColor = if (selected) Color.Black else Color.Black

    Box(
        modifier = Modifier
            .height(60.dp)
            .padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
            .clickable { onClick() }
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(0.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            color = contentColor,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}


@Preview
@Composable
fun PreviewCustomTabRow() {
    TabScreen()

}







