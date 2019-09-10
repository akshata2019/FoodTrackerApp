package com.example.a40669.foodtrackerapp.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.view.ViewPager
import com.example.a40669.foodtrackerapp.Adapters.SlidingImage_Adapter
import com.example.a40669.foodtrackerapp.ModelClass.ImageModel
import com.example.a40669.foodtrackerapp.R
import com.viewpagerindicator.CirclePageIndicator
import kotlinx.android.synthetic.main.activity_login.*
import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by 40669 on 8/28/2019.
 */
class LoginActivity : Activity() {

    private var imageModelArrayList: ArrayList<ImageModel>? = null
    private var textModelArrayList: ArrayList<ImageModel>?= null

    private val myImageList = intArrayOf(R.drawable.firsticon, R.drawable.gymnastics, R.drawable.ramen, R.drawable.diet)
    val text = arrayOf("Food Tracker is Healthy Diet Tool", "Healthy Habites", "Health requires Healthy Food","Get Fit in Gym lose weight in kitchen")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()
        textModelArrayList= ArrayList()
        textModelArrayList=populateList()
        loginText.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, LoginFormActivity::class.java)
            startActivity(intent);
        }
        signupText.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent);
        }

        init()

    }

    private fun populateList(): ArrayList<ImageModel> {

        val list = ArrayList<ImageModel>()

        for (i in 0..3) {
            val imageModel = ImageModel()
            imageModel.setImage_drawables(myImageList[i])
            imageModel.setName(text[i])
            list.add(imageModel)
        }

        return list
    }

    private fun init() {

        mPager = findViewById<ViewPager>(R.id.pager) as ViewPager
        mPager!!.adapter = SlidingImage_Adapter(this@LoginActivity, this.imageModelArrayList!!, this.textModelArrayList!!)


        val indicator = findViewById<CirclePageIndicator>(R.id.indicator) as CirclePageIndicator

        indicator.setViewPager(mPager)

        val density = resources.displayMetrics.density

        //Set circle indicator radius
        indicator.setRadius(5 * density)

        NUM_PAGES = imageModelArrayList!!.size
        NUM_PAGES =textModelArrayList!!.size

        // Auto start of viewpager
        val handler = Handler()
        val Update = Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            mPager!!.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 1000, 1000)

        // Pager listener over indicator
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageSelected(position: Int) {
                currentPage = position

            }

            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {

            }

            override fun onPageScrollStateChanged(pos: Int) {

            }
        })

    }

    companion object {

        private var mPager: ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }

}