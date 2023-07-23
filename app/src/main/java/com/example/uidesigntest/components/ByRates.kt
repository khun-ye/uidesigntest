package com.example.uidesigntest.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Brush
import androidx.compose.material.icons.outlined.Details
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.OpenInFull
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uidesigntest.R
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun ByRatesList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(5) { index ->
            ItemRow(index)
        }
    }
}

@Composable
fun ItemRow(index: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {
        RateInfoLayout()
    }
}

@Composable
fun RateInfoLayout() {
var iconColor by remember{ mutableStateOf(Color(0xFFC45A00)) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
            .border(
                shape = RoundedCornerShape(0.dp),
                border = BorderStroke(1.dp, SolidColor(Color.DarkGray)),
            )
    ) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp,
                top = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = "Deluxe Twin",
                    style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "Twin Single Bed, TV, Air Conditioner",
                    style = TextStyle(fontSize = 14.sp, color = Color.Gray)
                )
            }
            Icon(imageVector = Icons.Outlined.KeyboardArrowRight, contentDescription = "Lock",
                tint = iconColor
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp,
                    top = 16.dp,
                end = 16.dp),

        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                CoilImage(
                    imageModel = R.drawable.theme,
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp),
                    alignment = Alignment.Center
                )
                Text(text = "Inclusive of \n Breakfast",
                textAlign = TextAlign.Center,
                fontSize = 14.sp)   }
            Column (
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
                    ){
                CoilImage(
                    imageModel = R.drawable.theme,
                    contentDescription = "",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                )
                Text(text = "20% of \n In-Room Service",
                textAlign = TextAlign.Center,
                    fontSize = 14.sp)   }
            Row(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color(0xFFC45A00), // Orange color
                        shape = RoundedCornerShape(0.dp)
                    )
                    .weight(1f)
                    .padding(horizontal = 12.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "View Rate",
                    style = TextStyle(fontSize = 14.sp, color = Color(0xFFC45A00))
                )
            }
        }
        DividerWithPadding()
        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        start = 16.dp,
                        end = 16.dp)
            ) {
                Text(
                    text = "Avg Nightly/Room From",
                    style = TextStyle(fontSize = 14.sp, color = Color.Black)
                )

            }
            Row(
                modifier = Modifier
                    .padding(end = 16.dp)
            ){
                Text(
                    text = "SGD",
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
                Text(
                    text = "160",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
                )
            }
        }

        ButtonDetails()
    }
}

@Composable
fun ButtonDetails() {
    var iconColor by remember{ mutableStateOf(Color(0xFFC45A00)) }

    Button(
        onClick = { /* Handle button click here */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        shape = RoundedCornerShape(0.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(imageVector = Icons.Outlined.Info, contentDescription = "Lock",
                tint = iconColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Member Details", // Make the text fill the available space
                maxLines = 1, // Limit text to a single line if it's too long
                overflow = TextOverflow.Ellipsis // Show ellipsis (...) for overflow text
            )
        }
    }
}
@Composable
fun DividerWithPadding() {
    Column {
        Spacer(modifier = Modifier.padding(top = 16.dp)) // Top padding

        Divider(
            color = Color.Black,
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        )

        Spacer(modifier = Modifier.padding(bottom = 16.dp)) // Bottom padding
    }
}

@Preview
@Composable
fun PreviewLazyColumnWithItems() {
    ByRatesList()
}
