package com.example.videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)

        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        videoView.setMediaController(mediaController)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.video1 )

        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()

    }
}