package com.example.opossumtask

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.opossumtask.logic.OpossumGenerator
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonStart).setOnClickListener {
            val generator = OpossumGenerator()
            val opossums = generator.generate(5, 15)

            val sb = StringBuilder()

            for (opossum in opossums){
                sb.append(opossum.info)
                sb.append("\n")
            }

            findViewById<TextView>(R.id.textView).text = sb.toString()
        }
    }
}