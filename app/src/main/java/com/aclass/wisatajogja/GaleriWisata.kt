package com.aclass.wisatajogja

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class GaleriWisata : Fragment() {
    lateinit var rc: RecyclerView
    lateinit var lm: RecyclerView.LayoutManager
    lateinit var adapter: GaleriAdapter
    val url = arrayOf(
        "https://www.nativeindonesia.com/wp-content/uploads/2017/05/jembatan-pulau-nglambor.jpg",
        "https://cdn-images-1.medium.com/max/1600/1*Pp28rqMZWenBjs2sW8Bd3Q.jpeg"
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_galeri_wisata,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rc = view.findViewById(R.id.rc)
        rc.setHasFixedSize(true)
        lm=GridLayoutManager(context,2)
        rc.layoutManager=lm
        adapter= GaleriAdapter(url,this.context!!)
        rc.adapter=adapter
    }
}
