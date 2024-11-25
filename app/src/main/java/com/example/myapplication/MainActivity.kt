package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class Calculator {
    fun calc(a: Int, b: Int) = a*a + b*b

    fun getLengthStr(str: String?) : Boolean {
        println(str!!.length)
        return true
    }
}

class MainActivity : AppCompatActivity() {

    companion object {
        const val LOGIN = "test"
        const val PASS = "123456"
    }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.textView.apply {
                if(binding.editLogin.text.toString() == LOGIN &&
                    binding.editPassword.text.toString() == PASS) {
                        this.text = context.getString(R.string.auth_successful)
                    } else {
                        this.text = context.getString(R.string.auth_failed)
                }
            }
        }
    }
}