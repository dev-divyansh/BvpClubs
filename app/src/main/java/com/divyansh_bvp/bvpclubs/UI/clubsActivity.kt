package com.divyansh_bvp.bvpclubs.UI

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.divyansh_bvp.bvpclubs.R
import com.divyansh_bvp.bvpclubs.admin.AdminLogin
import com.divyansh_bvp.bvpclubs.databinding.ActivityClubsBinding
import com.google.android.material.navigation.NavigationView

class clubsActivity : AppCompatActivity() {


    private lateinit var binding : ActivityClubsBinding
    private lateinit var toggle : ActionBarDrawerToggle
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var nav_view : NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClubsBinding.inflate(layoutInflater)

        setContentView(binding.root)
        load_fragment(eventsFragment())
        supportActionBar?.subtitle = "Events & Clubs of BVP"

        toggle = ActionBarDrawerToggle(this , binding.myDrawerLayout , R.string.open , R.string.close )
        drawerLayout = binding.myDrawerLayout
        nav_view = binding.navView

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.AdminLogin -> {
                    val intent = Intent(this , AdminLogin::class.java)
                    startActivity(intent)
                    finish()
                }
                R.id.app_feedback -> {
                    Toast.makeText(this , "feedback clicked " , Toast.LENGTH_LONG).show()
                }

            }
            true

        }
        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.events_bottom -> {
                    load_fragment(eventsFragment())
                    true
                }
                R.id.clubs_bottom -> {
                    load_fragment(clubsFragment())
                    true
                }
            }
            true
        }




    }

    private fun load_fragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fram_layout , fragment)
        fragmentManager.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
