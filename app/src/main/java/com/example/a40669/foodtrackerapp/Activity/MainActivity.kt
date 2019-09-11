package com.example.a40669.foodtrackerapp.Activity

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.Toolbar
import com.example.a40669.foodtrackerapp.Fragment.CalenderFragment
import com.example.a40669.foodtrackerapp.Fragment.GoalFragment
import com.example.a40669.foodtrackerapp.Fragment.MealFragment
import com.example.a40669.foodtrackerapp.Fragment.MenuFragment
import com.example.a40669.foodtrackerapp.R
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

       // toolbar = <Too>findViewById(R.id.toolbar) as Toolbar
//        setSupportActionBar(toolbar)
//        supportActionBar!!.title = ""
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
    val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_calender -> {
                val fragment = CalenderFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                return@OnNavigationItemSelectedListener true

            }
            R.id.nav_goal -> {
                val fragment = GoalFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_meal -> {
                val fragment = MealFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_menu -> {
                val fragment = MenuFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container, fragment, fragment.javaClass.getSimpleName())
                        .commit()

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
//    private fun openFragment(fragment: Fragment) {
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }

}
