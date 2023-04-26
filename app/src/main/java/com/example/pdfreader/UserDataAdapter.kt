package com.example.pdfreader

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class UserDataAdapter(imglist: Array<Int>, titlelist: Array<String>, pdflist: Array<String>) :
    RecyclerView.Adapter<UserDataAdapter.UserDataHolder>() {
    lateinit var context: Context
    var imglist = imglist
    var titlelist = titlelist
    var pdflist = pdflist

    class UserDataHolder(itemview: View) : ViewHolder(itemview) {
        var img = itemView.findViewById<ImageView>(R.id.idIVcourseIV)
        var title = itemView.findViewById<TextView>(R.id.idTVCourse)
        var card = itemView.findViewById<LinearLayout>(R.id.card)
//        var pdf=itemview.findViewById<PdfRendererView>(R.id.pdf)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserDataHolder {
        context = parent.context
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return UserDataHolder(view)
    }

    override fun getItemCount(): Int {
        return titlelist.size
    }
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: UserDataHolder, position: Int) {
        holder.title.text= titlelist.get(position).toString()
        Glide.with(context).load(imglist.get(position)).into(holder.img)


        holder.itemView.setOnClickListener{
          context.startActivity(Intent(context,viewpdf::class.java).putExtra("name",pdflist.get(position)))
        }
    }
}