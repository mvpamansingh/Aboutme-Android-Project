package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName:MyName= MyName("Aman Singh")
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName=myName
        binding.doneButton.setOnClickListener()
        {
            callme(it)
        }
    //val ddonButton= findViewById<Button>(R.id.done_button)
//        ddonButton.setOnClickListener()
//        {
//            callme(it)
//        }
    }
    fun callme(view:View)
    {

        binding.dispNick.text=binding.editText.text
        binding.myName?.nickKname=binding.editText.text.toString()
        binding.editText.visibility=View.GONE
        binding.doneButton.visibility =View.GONE
        binding.dispNick.visibility=View.VISIBLE


//        val dipNk= findViewById<TextView>(R.id.disp_nick)
//        val inpNk=findViewById<TextView>(R.id.edit_Text)
//        dipNk.text=inpNk.text
//        inpNk.visibility=View.GONE
//        view.visibility = View.GONE
//
//        dipNk.visibility=View.VISIBLE
    }
}