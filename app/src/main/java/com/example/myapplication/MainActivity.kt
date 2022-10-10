package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val myDataClass = MyDataClass("TO DO", "some description")
    var message = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)


        binding.btn.setOnClickListener { Toast.makeText(this, createMessage(), Toast.LENGTH_LONG).show()}


        binding.description.text = myDataClass.description
        binding.title.text = myDataClass.title
        val newCopy = myDataClass.copy("new title")
        binding.copy.text = newCopy.title

    }
    fun createMessage() : String{
        var newMessage = ""
        if (message > 0){
            newMessage = "Hello"
        }else {newMessage = "!"}
        return newMessage
    }
}