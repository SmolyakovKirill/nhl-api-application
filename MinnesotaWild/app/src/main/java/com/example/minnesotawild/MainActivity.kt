package com.example.minnesotawild

import androidx.appcompat.app.AppCompatActivity
import com.example.minnesotawild.databinding.FragmentBlankBinding
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, BlankFragment.newInstance())
            .commit()
    }
}