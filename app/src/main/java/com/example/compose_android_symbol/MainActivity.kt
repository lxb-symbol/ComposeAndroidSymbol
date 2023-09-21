package com.example.compose_android_symbol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_android_symbol.compose_basic.MyTextRow
import com.example.compose_android_symbol.ui.theme.COLOR_EF
import com.example.compose_android_symbol.ui.theme.ComposeAndroidsymbolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAndroidsymbolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 10.dp)
            .background(color = Color.Green, shape = RoundedCornerShape(4.dp))
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAndroidsymbolTheme {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(color = COLOR_EF)
        ) {
            Greeting("Android")
            Greeting("Android")
            MyTextRow()
        }
    }
}


