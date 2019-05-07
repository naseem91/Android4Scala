package com.example

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
//import org.scaloid.common._

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    val view = new TextView(this)
    view.setText("HeloOoO Baghdad")
    setContentView(view)
  }
}
