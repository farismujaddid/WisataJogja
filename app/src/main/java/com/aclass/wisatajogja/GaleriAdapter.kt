package com.aclass.wisatajogja

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.security.AccessControlContext

class GaleriAdapter (url:Array<String>,context: Context):RecyclerView.Adapter<GaleriAdapter.ViewHolder>() {
    var context:Context
    var url: Array<String>
    init {
        this.context=context
        this.url=url
    }
    override fun onBindViewHolder(p0: GaleriAdapter.ViewHolder, p1: Int) {
        Glide.with(context)
            .load(url.get(p1))
            .into(p0.gambar)
    }

    override fun getItemCount(): Int {
        return url.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): GaleriAdapter.ViewHolder {
       var v: View
        v= LayoutInflater.from(parent.context).inflate(R.layout.activity_galeri_adapter, parent, false)
        return ViewHolder(v)
    }
    class ViewHolder (itemView: View?):
            RecyclerView.ViewHolder(itemView!!){
        var gambar: ImageView
        init {
            gambar = itemView!!.findViewById(R.id.gambar)
        }
    }


}
