package com.ivoronline.compose_viewmodel_separatefile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

//GLOBAL MODEL INSTANCE
val myViewModel = MyViewModel()

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyCounter()
    }
  }
}
