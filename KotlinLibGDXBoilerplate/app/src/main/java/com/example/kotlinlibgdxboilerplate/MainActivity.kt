package com.example.kotlinlibgdxboilerplate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
 * @author: rafalgolarz.com
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val libGDXLauncherBtn : Button = findViewById(R.id.libGDXLauncherBtn) as Button

        libGDXLauncherBtn.setOnClickListener {
            launchlibGDX()
        }
    }

    fun launchlibGDX() {
        val intent = Intent(this, Launcher::class.java)
        startActivity(intent)
    }
}
