package com.example.a7_congratulations

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val presentacion:VideoView=findViewById(R.id.videoView2)
        presentacion.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.chamba))
        presentacion.start()
    }
}