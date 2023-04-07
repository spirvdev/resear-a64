package com.beloncode.resear64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beloncode.resear64.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI()
    }

    private external fun stringFromJNI(): String

    companion object {
        // Used to load the 'seacore' library on application startup
        init {
            System.loadLibrary("seacore")
        }
    }
}