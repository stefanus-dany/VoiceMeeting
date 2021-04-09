package com.example.voicemeeting

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.facebook.react.modules.core.PermissionListener
import org.jitsi.meet.sdk.*
import java.net.URL


class MainActivity : AppCompatActivity(), JitsiMeetActivityInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val join = findViewById<Button>(R.id.btnJoin)
        join.setOnClickListener {
            val options = JitsiMeetConferenceOptions.Builder()
                .setRoom("https://meet.jit.si/BaruGasi")
                .setAudioMuted(true)
                .setVideoMuted(true)
                .setAudioOnly(false)
                .setWelcomePageEnabled(false)
                .build()
            JitsiMeetActivity.launch(this, options)

        }


//        if (a!=1){
//            setContentView(R.layout.activity_main)
//        }
    }

    override fun requestPermissions(p0: Array<out String>?, p1: Int, p2: PermissionListener?) {
    }
}