
package com.kotlin.order.coffee.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.kotlin.order.coffee.views.model.persona
import com.kotlin.order.coffee.views.model.personalistadapted
import kotlinx.android.synthetic.main.activity_r_ecyclerview.*

class rECYCLERVIEW : AppCompatActivity() {


    private var adapter: personalistadapted?= null
    private var personalist: ArrayList<persona>?= null
    private var LayoutManager: RecyclerView.LayoutManager?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_ecyclerview)

        personalist = ArrayList<persona>()
        LayoutManager = LinearLayoutManager(this)
        adapter = personalistadapted(personalist!!, this)

        rcview.layoutManager = LayoutManager
        rcview.adapter = adapter

        var nombrelist: Array<String> = arrayOf("sting", "christian", "joan", "mildor", "davie", "eslis", "erison", "giancarlo", "miguel")

        var apellidolist: Array<String> = arrayOf("lucana", "vela", "paucar", "mostacero", "acuña", "aquino", "mostacero", "barreto", "vasquez")

        for (i in 0..nombrelist.size - 1){
            var persona = persona()
            persona.nombres = nombrelist[i]
            persona.apellidos = apellidolist[i]
            personalist?.add(persona)

        }

    }

}
