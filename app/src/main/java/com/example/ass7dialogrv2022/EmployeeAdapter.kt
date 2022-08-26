package com.example.ass7dialogrv2022

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ass7dialogrv2022.databinding.EmpItemLayoutBinding

class EmployeeAdapter(val items : List<Employee>, val context: Context) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    inner class ViewHolder(view: View, val binding: EmpItemLayoutBinding) :
        RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = EmpItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding
        binding.nameText.text = "Name: " + items[position].name
        binding.genderText.text = "Gender : " + items[position].gender
        binding.emailText.text = "E-mail : "+items[position].email
        binding.salaryText.text = "Salary : "+ String.format("%,d",items[position].salary)
    // binding.salaryText.text = "Salary : "+items[position].salary.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}