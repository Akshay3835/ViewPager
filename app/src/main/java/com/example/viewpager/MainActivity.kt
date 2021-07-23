package com.example.viewpager

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager2? = null
    private var drawerLayout: DrawerLayout? = null
    private var navigationView: NavigationView? = null
    private var toggle: ActionBarDrawerToggle? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        drawerLayout = findViewById(R.id.drawer)
        navigationView = findViewById(R.id.nav)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout!!.addDrawerListener(toggle!!)
        toggle!!.syncState()

        val fm: FragmentManager = supportFragmentManager
        val adapter = MyAdapter(fm, lifecycle)
        viewPager!!.adapter = adapter

        tabLayout!!.addTab(tabLayout!!.newTab().setText("Main"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Sports"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Movie"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("Jobs"))
        tabLayout!!.tabGravity = TabLayout.GRAVITY_FILL



        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager!!.currentItem = tab.position
                    Toast.makeText(
                        applicationContext,
                        "Your are Selected ${tab.text}",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewPager!!.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                tabLayout!!.selectTab(tabLayout!!.getTabAt(position))
            }
        })

        navigationView!!.setNavigationItemSelectedListener{ item ->
            if (item.itemId == R.id.first_fragment_menu)
                Toast.makeText(applicationContext, "home navigation is clicked", Toast.LENGTH_SHORT)
                    .show()

            if (item.itemId == R.id.fragment_menu_sports)
                Toast.makeText(applicationContext, "home navigation is clicked", Toast.LENGTH_SHORT)
                    .show()

            if (item.itemId == R.id.fragment_menu_movies)
                Toast.makeText(applicationContext, "home navigation is clicked", Toast.LENGTH_SHORT)
                    .show()

            if (item.itemId == R.id.fragment_menu_jobs)
                Toast.makeText(applicationContext, "home navigation is clicked", Toast.LENGTH_SHORT)
                    .show()

            drawerLayout!!.closeDrawer(GravityCompat.START)
            false

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_share -> {
                Toast.makeText(applicationContext, "click on share", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_exit -> {
                Toast.makeText(applicationContext, "click on exit", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}

