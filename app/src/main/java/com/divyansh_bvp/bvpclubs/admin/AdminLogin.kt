package com.divyansh_bvp.bvpclubs.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.divyansh_bvp.bvpclubs.databinding.ActivityAdminLoginBinding

class AdminLogin : AppCompatActivity() {
    private lateinit var binding : ActivityAdminLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.adminLoginSubmit.setOnClickListener {
            check_login_details(binding.adminEmail.text.toString() , binding.adminPassword.text.toString())
        }
        binding.superAdminButton.setOnClickListener {
            Toast.makeText(this@AdminLogin , "Unknown error occured" , Toast.LENGTH_LONG ).show()

        }
    }

    private fun check_login_details(admin_email: String, admin_password: String) {
        if ( admin_email.isBlank() || admin_password.isBlank()){
            Toast.makeText(this , "Input all fields" , Toast.LENGTH_LONG).show()
            return
        }
        /*
        * implement here the code to authenticate the admin
        *
        * > we are directly logging in the admin for now*/

        // after successful login

        var intent = Intent(this@AdminLogin , add_event::class.java)
        startActivity(intent)


    }
}