package com.example.git

import android.animation.LayoutTransition
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MainListAdapter(val context: Context, val list_sample : ArrayList<String>) : BaseAdapter(){
    override fun getCount(): Int {
        return list_sample.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//      listviewitem --> xml 이름 --> item의 각각의 view와 연결
//      list_sample_text --> listviewitem.xml의 textview의 id
//      list의 text를 바꿀 data는 main으로부터 받는다
//      position 저 값이 0부터 전달받은 데이터 개수만큼 회전

        val view : View = LayoutInflater.from(context).inflate(R.layout.listviewitem, null)

        view.findViewById<TextView>(R.id.list_sample_text).setText(list_sample.get(position))
        //main에서 전달해준 데이터의 개수만큼 list item이 생성되어서 listview가 완성됨

        return view
    }

}