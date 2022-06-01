package com.ivoronline.compose_viewmodel_separatefile

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MyCounter() {
  Button({
    myViewModel.increase(10)                                             //Call Model Functions
    myViewModel.concat  (" hi")                                          //Call Model Functions
  }) {
    Text("(Count, Name) = (${myViewModel.count}, ${myViewModel.name})")  //Display State Variables
  }
}

