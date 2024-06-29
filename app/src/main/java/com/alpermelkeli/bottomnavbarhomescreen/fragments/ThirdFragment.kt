package com.alpermelkeli.bottomnavbarhomescreen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import com.alpermelkeli.bottomnavbarhomescreen.R


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {

                Text(text = "Third Fragment",color = Color.Red)



            }
        }
    }


}