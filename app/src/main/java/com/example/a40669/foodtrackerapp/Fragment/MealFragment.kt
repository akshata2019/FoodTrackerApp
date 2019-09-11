package com.example.a40669.foodtrackerapp.Fragment


import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import com.example.a40669.foodtrackerapp.R
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*
import kotlinx.android.synthetic.main.fragment_meal.*
import java.time.LocalDateTime


class MealFragment : Fragment() {



    private var view1: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        view1 = inflater!!.inflate(R.layout.fragment_meal, container, false)



        return view1
    }
//
//    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
//
//       // inflater!!.inflate(R.menu.one_menu, menu)
//
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        val id = item!!.itemId
//
//
//        if (id == R.id.action_user) {
//            Toast.makeText(activity, "Message clicked!", Toast.LENGTH_SHORT).show()
//            return true
//
//        }
//
//        return super.onOptionsItemSelected(item)
//    }

}