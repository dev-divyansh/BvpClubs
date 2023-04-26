package com.divyansh_bvp.bvpclubs.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import com.divyansh_bvp.bvpclubs.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
     window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN)
          super.onCreate(savedInstanceState)

        supportActionBar?.hide()

         setContentView(R.layout.activity_splash)
        
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this , clubsActivity::class.java)
                startActivity(intent)
                finish()
            } , 3000
        )
    }
}