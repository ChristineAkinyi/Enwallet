package com.christineakinyi.dev.enwallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter (val expensesList: List<Expenses>):RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(rvExpenditure: ViewGroup, viewType: Int): ExpensesViewHolder {
       var itemView = LayoutInflater.from(rvExpenditure.context)
           .inflate(R.layout.expense_tracker, rvExpenditure, false)
           return  ExpensesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
    val expense = expensesList[position]

    }

    override fun getItemCount(): Int {
       return expensesList.size
    }
}