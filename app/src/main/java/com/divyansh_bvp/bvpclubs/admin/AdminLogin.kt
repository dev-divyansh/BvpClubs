package com.divyansh_bvp.bvpclubs.admin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.divyansh_bvp.bvpclubs.databinding.ActivityAdminLoginBinding

class AdminLogin : AppCompatActivity() {
    private lateinit var binding : ActivityAdminLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}