package com.aclass.wisatajogja

import android.content.Intent
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MenuAwal : Fragment(), View.OnClickListener{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_menu_awal,null)
    }
    lateinit var btn_profile: ImageView
    lateinit var btn_web: ImageView
    lateinit var btn_lokasi: ImageView
    lateinit var btn_video: ImageView
    lateinit var btn_galeri: ImageView
    lateinit var btn_tentang: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btn_profile=view.findViewById(R.id.button_obwis)
        btn_web=view.findViewById(R.id.button_web)
        btn_lokasi=view.findViewById(R.id.button_lokasi)
        btn_video=view.findViewById(R.id.button_video)
        btn_galeri=view.findViewById(R.id.button_galeri)
        btn_tentang=view.findViewById(R.id.button_tentang)

        btn_profile.setOnClickListener(this)
        btn_web.setOnClickListener(this)
        btn_lokasi.setOnClickListener(this)
        btn_video.setOnClickListener(this)
        btn_galeri.setOnClickListener(this)
        btn_tentang.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_obwis->{
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.content,Home())?.commit()
            }
            R.id.button_web->{
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.content,WebWisata())?.commit()
            }
            R.id.button_lokasi->{
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.content,PetaWisata())?.commit()
            }
            R.id.button_video->{
                var i: Intent
                i= Intent(activity,
                    VideoWisata::class.java)
                activity?.startActivity(i)
            }
            R.id.button_galeri->{
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.content,GaleriWisata())?.commit()
            }
            R.id.button_tentang->{
                activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.content,About())?.commit()
            }
        }
    }


}
