package com.example.extra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extra.ui.theme.ExtraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchkinMain()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MunchkinMain() {
    var nome1 by remember { mutableStateOf("") }
    var nome2 by remember { mutableStateOf("") }
    var nome3 by remember { mutableStateOf("") }
    var nome4 by remember { mutableStateOf("") }
    var nome5 by remember { mutableStateOf("") }
    var nome6 by remember { mutableStateOf("") }

    var level1 by remember { mutableStateOf(1) }
    var level2 by remember { mutableStateOf(1) }
    var level3 by remember { mutableStateOf(1) }
    var level4 by remember { mutableStateOf(1) }
    var level5 by remember { mutableStateOf(1) }
    var level6 by remember { mutableStateOf(1) }

    var bonusEquipamento1 by remember { mutableStateOf(0) }
    var bonusEquipamento2 by remember { mutableStateOf(0) }
    var bonusEquipamento3 by remember { mutableStateOf(0) }
    var bonusEquipamento4 by remember { mutableStateOf(0) }
    var bonusEquipamento5 by remember { mutableStateOf(0) }
    var bonusEquipamento6 by remember { mutableStateOf(0) }

    var modificador1 by remember { mutableStateOf(0) }
    var modificador2 by remember { mutableStateOf(0) }
    var modificador3 by remember { mutableStateOf(0) }
    var modificador4 by remember { mutableStateOf(0) }
    var modificador5 by remember { mutableStateOf(0) }
    var modificador6 by remember { mutableStateOf(0) }

    LazyColumn {
        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome1,
                    onValueChange = { nome1 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level1 + bonusEquipamento1 + modificador1}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level1 <= 0) {
                            //Eliminado
                        } else {
                            level1--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level1", fontSize = 20.sp)
                    Button(onClick = {
                        if (level1 >= 10) {
                            //level maximo
                        } else {
                            level1++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento1 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento1--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento1", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento1 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento1++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador1 <= -5) {
                            //Limite minimo
                        } else {
                            modificador1--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador1", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador1 >= 10) {
                            //Limite maximo
                        } else {
                            modificador1++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome2,
                    onValueChange = { nome2 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level2 + bonusEquipamento2 + modificador2}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level2 <= 0) {
                            //Eliminado
                        } else {
                            level2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level2", fontSize = 20.sp)
                    Button(onClick = {
                        if (level2 >= 10) {
                            //level maximo
                        } else {
                            level2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento2 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento2", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento2 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador2 <= -5) {
                            //Limite minimo
                        } else {
                            modificador2--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador2", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador2 >= 10) {
                            //Limite maximo
                        } else {
                            modificador2++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome3,
                    onValueChange = { nome3 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level3 + bonusEquipamento3 + modificador3}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level3 <= 0) {
                            //Eliminado
                        } else {
                            level3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level3", fontSize = 20.sp)
                    Button(onClick = {
                        if (level3 >= 10) {
                            //level maximo
                        } else {
                            level3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento3 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento3", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento3 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador3 <= -5) {
                            //Limite minimo
                        } else {
                            modificador3--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador3", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador3 >= 10) {
                            //Limite maximo
                        } else {
                            modificador3++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome4,
                    onValueChange = { nome4 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level4 + bonusEquipamento4 + modificador4}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level4 <= 0) {
                            //Eliminado
                        } else {
                            level4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level4", fontSize = 20.sp)
                    Button(onClick = {
                        if (level4 >= 10) {
                            //level maximo
                        } else {
                            level4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento4 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento4", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento4 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador4 <= -5) {
                            //Limite minimo
                        } else {
                            modificador4--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador4", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador4 >= 10) {
                            //Limite maximo
                        } else {
                            modificador4++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome5,
                    onValueChange = { nome5 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level5 + bonusEquipamento5 + modificador5}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level5 <= 0) {
                            //Eliminado
                        } else {
                            level5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level5", fontSize = 20.sp)
                    Button(onClick = {
                        if (level5 >= 10) {
                            //level maximo
                        } else {
                            level5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento5 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento5", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento5 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador5 <= -5) {
                            //Limite minimo
                        } else {
                            modificador5--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador5", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador5 >= 10) {
                            //Limite maximo
                        } else {
                            modificador5++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }

        item {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = nome6,
                    onValueChange = { nome6 = it },
                    label = { Text(text = "Nome") })
                Text(
                    text = "Poder: ${level6 + bonusEquipamento6 + modificador6}",
                    fontSize = 20.sp
                )
                Row {
                    Button(onClick = {
                        if (level6 <= 0) {
                            //Eliminado
                        } else {
                            level6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Level: $level6", fontSize = 20.sp)
                    Button(onClick = {
                        if (level6 >= 10) {
                            //level maximo
                        } else {
                            level6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }

                Row {
                    Button(onClick = {
                        if (bonusEquipamento6 <= 0) {
                            //Limite minimo
                        } else {
                            bonusEquipamento6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Equipamento: $bonusEquipamento6", fontSize = 20.sp)
                    Button(onClick = {
                        if (bonusEquipamento6 >= 40) {
                            //Limite maximo
                        } else {
                            bonusEquipamento6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
                Row {
                    Button(onClick = {
                        if (modificador6 <= -5) {
                            //Limite minimo
                        } else {
                            modificador6--
                        }
                    }) {
                        Text(text = "-")
                    }
                    Text(text = "Modificador: $modificador6", fontSize = 20.sp)
                    Button(onClick = {
                        if (modificador6 >= 10) {
                            //Limite maximo
                        } else {
                            modificador6++
                        }
                    }) {
                        Text(text = "+")
                    }
                }
            }
        }
    }
}