package com.example.a40669.foodtrackerapp.Adapters

import android.content.Context
import android.os.Parcelable
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.a40669.foodtrackerapp.ModelClass.ImageModel
import com.example.a40669.foodtrackerapp.R

/**
 * Created by 40669 on 8/30/2019.
 */
class SlidingImage_Adapter(private val context: Context, private val imageModelArrayList: ArrayList<ImageModel>, private val textModelArrayList: ArrayList<ImageModel>) : PagerAdapter() {
    private val inflater: LayoutInflater


    init {
        inflater = LayoutInflater.from(context)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return imageModelArrayList.size
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.slidingimages_layout, view, false)!!


        val imageView = imageLayout.findViewById<ImageView>(R.id.image)
        val textView = imageLayout.findViewById<TextView>(R.id.texttView)


        imageView.setImageResource(imageModelArrayList[position].getImage_drawables())
        textView.setText(textModelArrayList[position].getName())

        view.addView(imageLayout, 0)

        return imageLayout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}

    override fun saveState(): Parcelable? {
        return null
    }

}

