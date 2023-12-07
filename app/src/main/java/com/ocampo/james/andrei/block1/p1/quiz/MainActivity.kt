package com.ocampo.james.andrei.block1.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     private lateinit var etlogin: EditText
     private lateinit var etpassword: EditText
     private lateinit var btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etlogin = findViewById(R.id.editText)
        etpassword = findViewById(R.id.editText2)
        btn = findViewById(R.id.button)

        val login = etlogin.text.toString()
        val password = etpassword.text.toString()

        btn.setOnClickListener{
            if (TextUtils.isEmpty(login) || TextUtils.isEmpty(password)){
                Toast.makeText(this, "Complete all details", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        }

        }
    }


}