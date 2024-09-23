package com.example.list_view.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.ListAdapter
import com.example.list_view.R
import com.example.list_view.databinding.ActivityBaseAdapterBinding

class Base_adapter : AppCompatActivity() {
    lateinit var binding: ActivityBaseAdapterBinding
    var list = arrayListOf("c", "C++", "Java")
    var studentList = arrayListOf<Student>()
    var listAdapter= list_adapter(studentList)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityBaseAdapterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        studentList.add(Student(1,"Rohan","C"))
        studentList.add(Student(2,"Mohan","C++"))
        studentList.add(Student(3,"sahil","Java"))
        binding.listiewnew.adapter=listAdapter

    }
}