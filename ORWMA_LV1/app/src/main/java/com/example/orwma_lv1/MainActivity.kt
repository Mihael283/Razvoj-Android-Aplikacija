package com.example.orwma_lv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun editInfo(value1: String,value2: String): Unit {
            val textView1 = findViewById<TextView>(R.id.textView1)
            val textView2 = findViewById<TextView>(R.id.textView2)

            textView1.text = value1
            textView2.text = value2
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            val input1 = findViewById<View>(R.id.name) as EditText
            val value1 = input1.text.toString()
            val input2 = findViewById<View>(R.id.desc) as EditText
            val value2 = input2.text.toString()

            editInfo(value1,value2)
        }


        fun BMI(cm: Int, kg: Int): Double {
            val m = cm.toDouble() / 100
            return kg / (m.pow(2.0))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val input1 = findViewById<View>(R.id.height) as EditText
            val value1 = Integer.parseInt(input1.text.toString())
            val input2 = findViewById<View>(R.id.weight) as EditText
            val value2 = Integer.parseInt(input2.text.toString())

            Toast.makeText(this, BMI(value1,value2).toString(),
                Toast.LENGTH_SHORT).show()


        }
    }
}