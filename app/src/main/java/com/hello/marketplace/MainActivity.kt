package com.hello.marketplace

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hello.player.DataConsumer
import com.hello.player.di.DemoSdkApplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        DemoSdkApplication.init(applicationContext)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val formatter = DataConsumer.greetingsFormatter
        Log.i("ASDASDSAD", formatter.sayHiWithName())
    }

    override fun onResume() {
        super.onResume()
        DemoSdkApplication.init(applicationContext)
    }

    override fun onStop() {
        super.onStop()
        DemoSdkApplication.close()
    }
}
