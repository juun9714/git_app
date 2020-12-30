package com.example.git

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.git.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val list_sample = ArrayList<String>()

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        val view=binding.root
        setContentView(view)

        list_sample.add("A")
        list_sample.add("B")
        list_sample.add("C")

        val list_adapter=MainListAdapter(this, list_sample)
        binding.listviewId.adapter=list_adapter



    }
}