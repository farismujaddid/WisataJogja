package com.aclass.wisatajogja

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class VideoWisata : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener{
    lateinit var yb: YouTubePlayerView
    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
       if (p1!!.isUserRecoverableError){
           p1.getErrorDialog(this,1).show()
       }
    }

    override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, p1: YouTubePlayer?, p2: Boolean) {
        p1!!.setFullscreen(true)
        p1.cueVideo("aAf4fUFlw_I")
        p1.play()
    }

    override fun onCreate(p0: Bundle?) {
       super.onCreate(p0)
        setContentView(R.layout.activity_video_wisata)
        yb = findViewById(R.id.youtubePlayer)
        yb.initialize("AIzaSyCcg9dg0jpovLX79ij10P2m9O1UaV0Fd1w", this)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }



}
