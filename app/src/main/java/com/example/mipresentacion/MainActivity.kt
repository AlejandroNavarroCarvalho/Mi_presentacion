package com.example.mipresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mipresentacion.ui.theme.MiPresentacionTheme
import kotlinx.coroutines.delay


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPresentacionTheme{
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
            modifier = modifier
                .weight(2f)
                .background(Color(0xFF89F7F7))

        ) {
            FotoPerfil(
                modifier
                    .weight(1f)
                    .fillMaxHeight())
        }
        Row (
            modifier = modifier.weight(1f)
        ){
            Informacion(modifier.weight(1f))
        }
        Row (
            modifier = modifier
                .weight(1f)
                .background(Color(0xFF89F7F7))
                .fillMaxWidth()
        ){
            Innovacion(modifier)
        }
    }
}

@Composable
fun Informacion(modifier: Modifier = Modifier){
    var visible by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        while (true) {
            visible = !visible
            kotlinx.coroutines.delay(250) // Cambia el tiempo de espera según tus necesidades
        }
    }
        Column (
            modifier = modifier
                .fillMaxHeight()
                .padding(10.dp),
            horizontalAlignment = Alignment.Start
        ){
            var nombreParpadeo by remember { mutableStateOf("") }
            if (visible) {
                nombreParpadeo = "ALEJANDRO NAVARRO"
            } else{
                nombreParpadeo = ""
            }
            Text(
                text = nombreParpadeo,
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "--------------- Programador Junior ---------------",
                modifier = Modifier.align(CenterHorizontally),
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic
            )
            Row (){
                InformacionAdicional()
                InformacionAdicional2()
            }
        }
}

@Composable
fun InformacionAdicional (modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .padding(15.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ){
        Row () {
            Icon(Icons.Default.Call, contentDescription = null)
            Text(
                text = " +34 987654321",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Row (){
            Icon(Icons.Default.AccountCircle, contentDescription = null)
            Text(
                text = " @alejandro_navarro",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Row (){
            Icon(Icons.Default.Email, contentDescription = null)
            Text(
                text = " navarro@gmail.com",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Composable
fun InformacionAdicional2 (modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ){
        Row () {
            Text(
                text = "comunidad de Madrid ",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Icon(Icons.Default.LocationOn, contentDescription = null)
        }
        Row (){
            Text(
                text = "IES Virgen Paloma ",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Icon(Icons.Default.Home, contentDescription = null)
        }
        Row (){
            Text(
                text = "segundo de DAM ",
                fontSize = 13.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Icon(Icons.Default.AddCircle, contentDescription = null)
        }
    }
}

@Composable
fun Innovacion(modifier: Modifier = Modifier){
    var texto by remember { mutableStateOf("Soy un apasionado por la tecnología y la resolución de problemas. Poseo habilidades sólidas en desarrollo web y programación en Kotlin, con experiencia en la creación de aplicaciones web dinámicas y funcionales.") }
    var butonTexto by remember {mutableStateOf("Pulse para ver la informacion importante")}
    Column (
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .fillMaxSize()
            .padding(25.dp)
    ) {
        Text(
            text = texto,
            modifier = Modifier.height(110.dp),
            textAlign = TextAlign.Justify,
            fontSize = 13.sp

        )
        Button(onClick = {
            if (butonTexto == "Pulse para ver la informacion importante" ){
                texto = "Toda la informacion ha sido parcialmente inventada para la realizacion de este trabajo de clase."
                butonTexto = "Volver a la descripcion"
            } else{
                texto = "Soy un apasionado por la tecnología y la resolución de problemas. Poseo habilidades sólidas en desarrollo web y programación en Kotlin, con experiencia en la creación de aplicaciones web dinámicas y funcionales."
                butonTexto = "Pulse para ver la informacion importante"
            }
        }, modifier = Modifier.width(325.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF89F7F7),
                contentColor = Color.Black,
            ), border = BorderStroke(3.dp, Color.Black)
            ) {
            //Icon(Icons.Rounded.Warning, contentDescription = null)
            Text(
                text = butonTexto
            )
        }
    }
}

@Composable
fun FotoPerfil(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable._198afef5_ed79_471c_82de_1ff01971d15c_removebg_preview)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier.fillMaxSize(),
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPresentacionTheme {
        PantallaFinal()
    }
}