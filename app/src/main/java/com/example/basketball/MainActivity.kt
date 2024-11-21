package com.example.basketball

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

import androidx.activity.enableEdgeToEdge

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activitymain)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val scoremodel= ScoreModel()

       val teamAScore: TextView = findViewById(R.id.a_score)
        val teamBScore: TextView = findViewById(R.id.b_score)

        findViewById<Button>(R.id.a_1).setOnClickListener{
            scoremodel.plusOne("A")
            teamAScore.text=scoremodel.getTotal("A").toString()
        }
        findViewById<Button>(R.id.a_2).setOnClickListener{
            scoremodel.plusTwo("A")
            teamAScore.text=scoremodel.getTotal("A").toString()
        }
        findViewById<Button>(R.id.a_3).setOnClickListener{
            scoremodel.plusThree("A")
            teamAScore.text=scoremodel.getTotal("A").toString()
        }

        findViewById<Button>(R.id.b_1).setOnClickListener{
            scoremodel.plusOne("B")
            teamBScore.text=scoremodel.getTotal("B").toString()
        }
        findViewById<Button>(R.id.b_2).setOnClickListener{
            scoremodel.plusTwo("B")
            teamBScore.text=scoremodel.getTotal("B").toString()
        }
        findViewById<Button>(R.id.b_3).setOnClickListener{
            scoremodel.plusThree("B")
            teamBScore.text=scoremodel.getTotal("B").toString()
        }

    }
}

