import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun ByRoomList() {
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
        CoilImage(
            imageModel = "https://media.npr.org/assets/img/2021/08/11/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg",
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        RoomInfoLayout()
    }
}

@Composable
fun RoomInfoLayout() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // First Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
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
            Row(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color(0xFFC45A00), // Orange color
                        shape = RoundedCornerShape(0.dp)
                    )
                    .padding(horizontal = 12.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "View Rate",
                    style = TextStyle(fontSize = 14.sp, color = Color(0xFFC45A00))
                )
            }
        }

        // Second Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp)
            ) {
                Text(
                    text = "Avg Nightly/Room From",
                    style = TextStyle(fontSize = 14.sp, color = Color.Black)
                )

            }
            Row(
                modifier = Modifier
                    .padding(end = 8.dp)
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
    }
}

@Preview
@Composable
fun PreviewLazyColumnWithItems() {
    ByRoomList()
}
