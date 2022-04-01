package com.example.a7_congratulations

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val video:VideoView=findViewById(R.id.video)
        val next:ImageButton=findViewById(R.id.boton_next)
        video.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.video))
        video.start()
        next.setOnClickListener {
            val intent= Intent(this,game::class.java)
            startActivity(intent)
        }

    }

}