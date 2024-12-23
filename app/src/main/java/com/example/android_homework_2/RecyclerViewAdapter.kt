package com.example.android_homework_2

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.google.android.material.snackbar.Snackbar

class RecyclerViewAdapter(val datalist: List<Football>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){

        class MyViewHolder(v: View): RecyclerView.ViewHolder(v){
            var currentCourse:Football ?= null

            init {
                itemView.setOnClickListener {
                    Snackbar.make(itemView,currentCourse.toString(), Snackbar.LENGTH_SHORT).show()
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
            val football = datalist[position]
            holder.currentCourse = football
            val name = holder.itemView.findViewById<TextView>(R.id.Text)

            name.text = football.name

        }
}
