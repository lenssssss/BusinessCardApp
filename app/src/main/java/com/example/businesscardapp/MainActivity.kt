package com.example.businesscardapp// Required Imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable._16589329_p3_master1200), // Replace with your image name
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp) // Adjust size as needed
                .padding(bottom = 16.dp)
        )
        Text("Lance Silva", style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold))
        Text("Front-End Developer", style = TextStyle(fontSize = 20.sp, color = Color.Gray))
        Spacer(modifier = Modifier.height(24.dp))

        Column(horizontalAlignment = Alignment.Start) {
            ContactRow(R.drawable.phone, "+1 (587) 581 8139")
            ContactRow(R.drawable.social, "@lensDev")
            ContactRow(R.drawable.email, "lsilvadev@gmail.com")
        }
    }
}

@Composable
fun ContactRow(iconResId: Int, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 6.dp)
    ) {
        Image(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp) // Adjust icon size
                .padding(end = 8.dp)
        )
        Text(text = info, style = TextStyle(fontSize = 16.sp))
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard()
}
