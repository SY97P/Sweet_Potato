package com.example.sweet_potato

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var map_btn : Button
    private lateinit var vote_btn : Button
    private lateinit var notice_btn : Button
    private lateinit var game_btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        map_btn = findViewById(R.id.btn_map)
        vote_btn = findViewById(R.id.btn_vote)
        notice_btn = findViewById(R.id.btn_notice)
        game_btn = findViewById(R.id.btn_game)
    }

    override fun onStart() {
        super.onStart()

        map_btn.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }

        vote_btn.setOnClickListener {
            startActivity(Intent(this, VoteActivity::class.java))
        }

        notice_btn.setOnClickListener {
            startActivity(Intent(this, NoticeActivity::class.java))
        }

        game_btn.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}