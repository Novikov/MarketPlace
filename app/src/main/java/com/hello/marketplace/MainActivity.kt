package com.hello.marketplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hello.player.Player

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Player().runPlayer()
    }
}