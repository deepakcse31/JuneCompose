package com.example.junecompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(
            text = "Android",
            modifier = Modifier.padding(top = 20.dp),
            fontSize = 20.sp
        )
        Text(
            text = "Android1",
            modifier = Modifier.padding(top = 20.dp),
            fontSize = 20.sp
        )
        Text(
            text = "Android2",
            modifier = Modifier.padding(top = 20.dp),
            fontSize = 20.sp
        )
    }


}