package com.example.dialogfragmant_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvrate.setOnClickListener {
            var dialog = DialogFragment()

            dialog.show(supportFragmentManager,"customDialog")
        }
    }
}