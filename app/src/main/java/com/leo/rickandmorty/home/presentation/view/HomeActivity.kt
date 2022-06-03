package com.leo.rickandmorty.home.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leo.rickandmorty.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1000)
        setTheme(R.style.Theme_RickAndMorty)
        setContentView(R.layout.activity_home)
    }
}