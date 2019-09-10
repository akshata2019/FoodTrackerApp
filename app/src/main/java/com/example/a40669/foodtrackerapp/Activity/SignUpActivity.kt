package com.example.a40669.foodtrackerapp.Activity

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.example.a40669.foodtrackerapp.R
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

class SignUpActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->
            var text = "You selected: "
            text += if (R.id.radioMale == checkedId) "male" else "female"

        }
        textNext.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent);
        }
        imageViewBack.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent);
        }
   //Datepicker
        editTextDob.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                editTextDob.setText("" + dayOfMonth + " /" + monthOfYear + "/" + year)
            }, year, month, day)
            dpd.show()


        }
        val height = arrayOf("Cm","Ft")
        val weight = arrayOf("lb","kg")

        // Initializing an ArrayAdapter
        val adapter = ArrayAdapter(
                this, // Context
                android.R.layout.simple_spinner_item, // Layout
                height // Array

        )
        val adapterWeight = ArrayAdapter(
                this, // Context
                android.R.layout.simple_spinner_item, // Layout
                weight // Array

        )

        // Set the drop down view resource
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        adapterWeight.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)


        // Finally, data bind the spinner object with dapter
        spinnerheight.adapter = adapter;
        spinnerweight.adapter = adapterWeight;




    }
}
