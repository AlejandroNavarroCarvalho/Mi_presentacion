package com.example.mipresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mipresentacion.ui.theme.MiPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaFinal()
                }
            }
        }
    }
}

@Composable
fun PantallaFinal(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Row (
            modifier = modifier.weight(1f).background(Color(0xFF89F7F7))

        ) {
            FotoPerfil(modifier.weight(1f).fillMaxHeight())
            Informacion(modifier.weight(1f))
        }
        Row (
            modifier = modifier.weight(1f)
        ){

        }
        Row (
            modifier = modifier.weight(1f)
        ){

        }
    }
}

@Composable
fun Informacion(modifier: Modifier = Modifier){
    Column (
        modifier = modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "ALEJANDRO NAVARRO",
            modifier = Modifier,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "Programador Junior",
            modifier = Modifier
        )
    }
}

@Composable
fun FotoPerfil(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable._4442b79_509b_46f4_a2c0_dfd593485020_removebg_preview)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxHeight(),
        )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPresentacionTheme {
        PantallaFinal()
    }
}