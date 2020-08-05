package com.example.reactiontimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    enum class TimerState {
        Stopped, Running
    }

    private lateinit var timer: Timer
    private var timerMiliSeconds: Long = 0
    // private var timerState: TimerState.Stopped


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setIcon(R.drawable.ic_timer)
        supportActionBar?.title= "     Reaction Timer"
    }
}