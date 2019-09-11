package com.example.a40669.foodtrackerapp.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import android.widget.Toast
import com.example.a40669.foodtrackerapp.R
import kotlinx.android.synthetic.main.fragment_goal.*


class GoalFragment : Fragment() {

//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
//            inflater.inflate(R.layout.fragment_goal, container, false)
//
override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    // Inflate the layout for this fragment

    return inflater!!.inflate(R.layout.fragment_goal, container, false)
}


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    buttonPlus.setOnClickListener {
        display(editNumber.text.toString().toInt() + 1)
    }
    buttonMinus.setOnClickListener {
        display(editNumber.text.toString().toInt() - 1)
    }
    }
    private fun display(number: Int) {
        editNumber.setText("$number")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }





    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {

        inflater!!.inflate(R.menu.two_menu, menu)

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.itemId


        if (id == R.id.action_car) {
            Toast.makeText(activity, "Car clicked!", Toast.LENGTH_SHORT).show()
            return true

        }

        return super.onOptionsItemSelected(item)
    }
}


