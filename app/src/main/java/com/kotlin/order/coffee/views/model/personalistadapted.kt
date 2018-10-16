package com.kotlin.order.coffee.views.model
 import android.content.Context
 import android.support.constraint.R.id.parent
 import android.support.v7.widget.RecyclerView
 import android.view.LayoutInflater
 import android.view.View
import android.view.ViewGroup
import android.widget.TextView
 import com.kotlin.order.coffee.views.R

import kotlinx.android.synthetic.main.activity_cardview.view.*

    class personalistadapted(private val list: ArrayList<persona>,
                         private val context: Context):
        RecyclerView.Adapter<personalistadapted.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(context).inflate(R.layout.activity_cardview,
            parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return list.size

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bindItem(list[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bindItem(persona: persona){

            var nombres = itemView.findViewById(R.id.txtnonmbre) as TextView

            var apellidos = itemView.findViewById(R.id.txtapellido) as TextView

            nombres.setText(persona.nombres)
            apellidos.setText(persona.apellidos)
        }
    }


}