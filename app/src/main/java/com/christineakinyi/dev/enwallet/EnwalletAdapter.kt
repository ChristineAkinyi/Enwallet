package com.christineakinyi.dev.enwallet

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class EnwalletAdapter (val expensesList: List<Tracker>):RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(rvExpenditure: ViewGroup, viewType: Int): ExpensesViewHolder {
       var itemView = LayoutInflater.from(rvExpenditure.context)
           .inflate(R.layout.expense_tracker, rvExpenditure, false)
           return  ExpensesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
    val expense = expensesList[position]
//       holder.imgTwo.text = expense.image
        holder.txtSalary.text = expense.salary
        holder.txtAmnt.text = expense.amount
        holder.txtDate.text = expense.date
    }

    override fun getItemCount(): Int {
       return expensesList.size
    }
}

class ExpensesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
//    var imgTwo = itemView.findViewById<TextView>(R.id.imgTwo)
    var txtSalary = itemView.findViewById<TextView>(R.id.txtSalary)
    var txtAmnt = itemView.findViewById<TextView>(R.id.txtAmnt)
    var txtDate = itemView.findViewById<TextView>(R.id.txtDate)
}