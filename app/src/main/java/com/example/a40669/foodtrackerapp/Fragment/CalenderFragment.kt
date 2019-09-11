package com.example.a40669.foodtrackerapp.Fragment


import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.Toast
import com.example.a40669.foodtrackerapp.R
import com.example.a40669.foodtrackerapp.R.id.calendarView
import kotlinx.android.synthetic.main.fragment_calender.*
import java.util.*
import android.widget.DatePicker




class CalenderFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view1 = inflater!!.inflate(R.layout.fragment_calender,container,false)

//        calendarView?.setOnDateChangeListener { view, year, month, dayOfMonth ->
//            val msg = "Selected date is " + dayOfMonth + "/" + (month + 1) + "/" + year
//
//            Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
//
//        }

        // Inflate the layout for this fragment
        return view1
    }

}// Required empty public constructor
