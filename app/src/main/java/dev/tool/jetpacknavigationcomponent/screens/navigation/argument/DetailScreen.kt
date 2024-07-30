package dev.tool.jetpacknavigationcomponent.screens.navigation.argument


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DetailScreen(
    name: String?,
    surName: String?,
    age: Int?,
) {
    val modifier = Modifier
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Detail Screen", fontSize = 35.sp)
        Spacer(modifier = modifier.height(25.dp))
        Text(text = "Your Name : $name", fontSize = 20.sp)
        Spacer(modifier = modifier.height(35.dp))
        Text(text = "Your Surname : $surName", fontSize = 20.sp)
        Spacer(modifier = modifier.height(35.dp))
        Text(text = "Your Age : ${age.toString()}", fontSize = 20.sp)
    }
}