package com.alpermelkeli.bottomnavbarhomescreen.fragments

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun HelloText(id:String){
    Text(text = "Hello $id Fragment", color = Color.Red)
}