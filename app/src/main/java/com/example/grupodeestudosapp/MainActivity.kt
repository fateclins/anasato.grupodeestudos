package com.example.grupodeestudosapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.grupodeestudosapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CardAdapter
    private lateinit var cardItems: MutableList<CardItem>
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(MyProfileFragment())
                R.id.add -> replaceFragment(AddFragment())
                else -> false
            }
            true
        }

        cardItems = mutableListOf()
        cardItems.add(CardItem("Reuniao ultra mega blaster importante", "18/06/2024", "14:00"))
        cardItems.add(CardItem("Almoçoooooo oqweqew aadfdasf erqwewwe asdfasdf", "19/06/2024", "11:00"))

        adapter = CardAdapter(cardItems)

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }


}