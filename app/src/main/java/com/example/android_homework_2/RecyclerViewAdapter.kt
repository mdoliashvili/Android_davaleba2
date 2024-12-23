package com.example.android_homework_2

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.snackbar.Snackbar

class RecyclerViewAdapter(val datalist: List<Country>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){

        class MyViewHolder(v: View): RecyclerView.ViewHolder(v){
            var country:Country ?= null

            init {
                itemView.setOnClickListener {
                    Snackbar.make(itemView,country.toString(), Snackbar.LENGTH_SHORT).show()
                }
            }


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
            return MyViewHolder(v)
        }

        override fun getItemCount(): Int {
            return datalist.size
        }

        @SuppressLint("SetTextI18n")
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val countries = datalist[position]
            holder.country = countries
            val country = holder.itemView.findViewById<TextView>(R.id.Country)
            val city = holder.itemView.findViewById<TextView>(R.id.City)
            country.text = countries.country
            city.text = countries.city
        }
}
