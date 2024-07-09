package com.christineakinyi.dev.enwallet

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.GridLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.christineakinyi.dev.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvViews.layoutManager = LinearLayoutManager(this)

        displayExpenses()
    }
    fun displayExpenses(){
        val expense1 = Tracker("Salary", "KES 35000", "1 July 2024", "")
        val expense2 = Tracker("Salary", "KES 35000", "1 July 2024", "")
        val expense3 = Tracker("Salary", "KES 35000", "1 July 2024", "")
        val expense4 = Tracker("Salary", "KES 35000", "1 July 2024", "")

        val expensesList = listOf(expense1, expense2,expense3,expense4)
        val enwalletAdapter = EnwalletAdapter(expensesList)
        binding.rvViews.adapter = enwalletAdapter
    }
}