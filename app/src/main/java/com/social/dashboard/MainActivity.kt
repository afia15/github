package com.social.dashboard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var adminCard:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
         adminCard = findViewById(R.id.c1)
        val teacherCard: CardView = findViewById(R.id.c2)
        val studentCard: CardView = findViewById(R.id.c3)
        val alumniCard: CardView = findViewById(R.id.c4)

        // Set onClickListeners for each card
        adminCard.setOnClickListener {
            var intent = Intent(this,AdminActivity::class.java)
            startActivity(intent)
        }

        teacherCard.setOnClickListener {


            var intent = Intent(this,TeacherActivity::class.java)
            startActivity(intent)
        }

        studentCard.setOnClickListener {

            var intent = Intent(this,StudentActivity::class.java)
            startActivity(intent)
        }

        alumniCard.setOnClickListener {
            var intent = Intent(this,AlumniActivity::class.java)
            startActivity(intent)
        }
    }
}


