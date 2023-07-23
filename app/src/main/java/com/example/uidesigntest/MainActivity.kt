package com.example.uidesigntest


import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uidesigntest.components.ImageSlider
import com.example.uidesigntest.ui.theme.UidesigntestTheme
import com.skydoves.landscapist.coil.CoilImage
import com.example.uidesigntest.components.TabScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UidesigntestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                            ){
                        MainScreen()
                        headerUI()
                        TabUI()
                    }
                }
            }
        }
    }
}


@Composable
fun MainScreen(){
    val contextForToast = LocalContext.current.applicationContext

    TopAppBar(
        backgroundColor = Color.Transparent,
        title = {
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Back Click", Toast.LENGTH_SHORT)
                    .show()
            }) {
                Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Lock")
            }
        },
        actions = {
            // search icon
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Currency Click", Toast.LENGTH_SHORT)
                    .show()
            }) {
                CoilImage(
                    imageModel = R.drawable.currency,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
            }

            // lock icon
            IconButton(onClick = {
                Toast.makeText(contextForToast, "Chat Click", Toast.LENGTH_SHORT)
                    .show()
            }) {
                CoilImage(
                    imageModel = R.drawable.chatactive,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
            }
        }
    )
}
@Preview(showBackground = true)
@Composable
fun headerUI(){
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Furama Riverfront, Singapore",
                    color = Color.Black,
                    fontSize = 25.sp
                )
            }
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(end = 8.dp)
            ) {
                IconButton(onClick = {
                }) {
                    CoilImage(
                        imageModel = R.drawable.nextred,
                        contentDescription = "",
                        modifier = Modifier
                            .width(55.dp)
                            .height(55.dp)
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "405 Havelock Road, Singapore 69633",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(end = 8.dp)
            ) {
                IconButton(onClick = {
                }) {
                    CoilImage(
                        imageModel = R.drawable.currentlocation,
                        contentDescription = "",
                        modifier = Modifier
                            .width(35.dp)
                            .height(35.dp)
                    )
                }
            }
        }
        val images = listOf("https://media.npr.org/assets/img/2021/08/11/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg",
            "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492__480.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrfPnodZbEjtJgE-67C-0W9pPXK8G9Ai6_Rw&usqp=CAU",
            "https://i.ytimg.com/vi/E9iP8jdtYZ0/maxresdefault.jpg",
            "https://cdn.shopify.com/s/files/1/0535/2738/0144/articles/shutterstock_149121098_360x.jpg")

        ImageSlider(images)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CoilImage(
                    imageModel = R.drawable.theme,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(text = "Amenities")   }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CoilImage(
                    imageModel = R.drawable.workout,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(text = "Facilities")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CoilImage(
                    imageModel = R.drawable.fnb,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(text = "F&B")
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
                    ){
                CoilImage(
                    imageModel = R.drawable.kidsfamily,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(text = "Facilities")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CoilImage(
                    imageModel = R.drawable.wellness,
                    contentDescription = "",
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(text = "Wellness")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabUI(){

    Column {

        TabScreen()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UidesigntestTheme {
        Greeting("Android")
    }
}