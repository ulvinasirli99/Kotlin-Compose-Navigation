package dev.tool.jetpacknavigationcomponent.screens.navigation.argument

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.tool.jetpacknavigationcomponent.screens.widgets.GlobalTextField


@Composable
fun HomeScreen(
    navCtr: NavController
) {
    val modifier = Modifier
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var nameValue by remember {
            mutableStateOf("")
        }
        var surNameValue by remember {
            mutableStateOf("")
        }
        var ageValue by remember {
            mutableStateOf("")
        }
        Text(text = "Home Screen")
        Spacer(modifier = modifier.height(40.dp))
        GlobalTextField(
            value = nameValue,
            onValueChange = { nameValue = it },
            placeholderText = "Enter your Name"
        )
        GlobalTextField(
            value = surNameValue,
            onValueChange = { surNameValue = it },
            placeholderText = "Enter your Surname"
        )
        GlobalTextField(
            value = ageValue,
            onValueChange = { ageValue = it },
            placeholderText = "Enter your Age",
            keyboardType = KeyboardType.Number,
        )
        Spacer(modifier = modifier.height(8.dp))
        Button(
            onClick = {
                //   navCtr.navigate("DetailScreen/$nameValue/$surNameValue/$ageValue")
                navCtr.navigate("DetailScreen?name=$nameValue&surName=$surNameValue&age=$ageValue")
            }) {
            Text(text = "Pass Data", fontSize = 30.sp)
        }
    }
}