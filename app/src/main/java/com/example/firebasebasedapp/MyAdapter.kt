package com.example.firebasebasedapp

import android.view.LayoutInflater
import android.view.*
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val mList:List<MyData>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_card_view , parent, false)
        return ViewHolder(view)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tVid = itemView.findViewById<TextView>(R.id.tvId)
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvDob = itemView.findViewById<TextView>(R.id.tvDob)
    }
    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        val Mydata = mList[position]
        holder.tVid.text = Mydata.id.toString()
        holder.tvName.text = Mydata.name
        holder.tvDob.text = Mydata.dob
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}