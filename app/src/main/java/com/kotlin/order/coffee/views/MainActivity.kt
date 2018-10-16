package com.kotlin.order.coffee.views

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre: Array<String> = arrayOf("sting", "christian", "jose", "davis", "eslis", "erison", "giancarlo", "miguel")

        var nombreadapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, nombre)

        lstnombres.adapter = nombreadapter
    }

    fun verdetalle(view: View){
        var myIntent = Intent(this, rECYCLERVIEW:: class.java)
        startActivity(myIntent)
    }

}
