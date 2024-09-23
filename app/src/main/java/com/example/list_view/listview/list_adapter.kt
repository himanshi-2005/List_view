package com.example.list_view.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.list_view.R

class list_adapter (var array:ArrayList<Student>): BaseAdapter() {
    override fun getCount(): Int {
        return  array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.basic_item_list, parent, false)

        var rollNo=view.findViewById<TextView>(R.id.tvRollno)
        rollNo.setText(array[position].rollNo.toString())
        var name=view.findViewById<TextView>(R.id.tvStuName)
        name.setText(array[position].name)
        var mclass=view.findViewById<TextView>(R.id.tvClass)
        mclass.setText(array[position].subject)
        return view
    }
}
