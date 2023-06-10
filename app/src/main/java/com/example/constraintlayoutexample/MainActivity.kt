package com.example.constraintlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.constraintlayoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)


        val personList= listOf<Person>(
            Person("Rahul","Android Developer","B.Tech","1234567890","example@mail.com","Delhi"),
            Person("Rahul","Android Developer","B.Tech","1234567890","example@gmail.com","Delhi"),
            Person("Rahul","Android Developer","B.Tech","1234567890","example@gmail.com","Delhi"),
            Person("Rahul","Android Developer","B.Tech","1234567890","example@gmail.com","Delhi"),
            )
        binding.visitingCardRV.adapter=VisitingCardRecyclerViewAdapter(personList)

        setContentView(binding.root)

    }
}