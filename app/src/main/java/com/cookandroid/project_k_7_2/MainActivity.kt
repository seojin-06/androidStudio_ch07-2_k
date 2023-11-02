package com.cookandroid.project_k_7_2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.cookandroid.project_k_7_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setTitle("제주도 풍경 앱")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val mInflater : MenuInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        item.isChecked = !item.isChecked
        when (item.itemId) {
            R.id.itemRotate -> {
                binding.imgView1.rotation = binding.edit1.text.toString().toFloat()
            }
            R.id.item1 -> {
                binding.imgView1.setImageResource(R.drawable.jeju12)
            }
            R.id.item2 -> {
                binding.imgView1.setImageResource(R.drawable.jeju14)
            }
            R.id.item3 -> {
                binding.imgView1.setImageResource(R.drawable.jeju15)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}