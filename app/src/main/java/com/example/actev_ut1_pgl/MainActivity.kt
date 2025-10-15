package com.example.actev_ut1_pgl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.actev_ut1_pgl.ui.theme.ActEv_UT1_PGLTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActEv_UT1_PGLTheme {
                //Llamo al método de contador
                Contador()
            }
        }
    }
}

//Creo una función que hará las veces de contador
@Composable
fun Contador() {
    //Creo una vatiable que tenga el numero por el que vamos contando y le aplico by remember{mutableStateOf(0)}
    var numero by remember{mutableStateOf(0)}

    //Para que los elementos se vean bien y no colapsados, los añado en una columna con normas para que sea manejable en el movil
    Column( modifier = Modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        //Introduzco los elementos de la app

        //Hago un texto que tiene el contenido del contador
        Text(
            text = "Contador: $numero"
        )

        //Añado un espacio hasta el siguiente elemento
        Spacer(modifier = Modifier.height(20.dp))

        //Hago

        //Creo el boton que va a servir para disminuir el numero
        Button(onClick = {numero--}){
            //Le pongo texto al boton
            Text(text = "-")
        }

        //Añado un espacio hasta el siguiente elemento
        Spacer(modifier = Modifier.height(20.dp))

        //Creo el boton que va a servir para aumentar el numero
        Button(onClick = {numero++}){
            //Le pongo texto al boton
            Text(text = "+")
        }

    }


}