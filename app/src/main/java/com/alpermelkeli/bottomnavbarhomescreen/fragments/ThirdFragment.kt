package com.alpermelkeli.bottomnavbarhomescreen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import com.alpermelkeli.bottomnavbarhomescreen.R


class ThirdFragment : Fragment() {


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                HelloTextThird()
            }
        }
    }
}
@Composable
@Preview
fun HelloTextThird(){
    Text(text = "Hello Third Fragment", color = Color.Red)
}