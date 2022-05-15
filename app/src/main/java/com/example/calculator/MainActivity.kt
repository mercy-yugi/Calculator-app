package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvHead:TextView
    lateinit var etFirstnum:EditText
    lateinit var etSecondnum:EditText
    lateinit var btnAdd:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvOutput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHead=findViewById(R.id.tvHead)
        etFirstnum=findViewById(R.id.etFirstnum)
        etSecondnum=findViewById(R.id.etSecondnum)
        btnAdd=findViewById(R.id.btnAdd)
        btnMinus=findViewById(R.id.btnMinus)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvOutput=findViewById(R.id.tvOutput)

        btnAdd.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstnum.text.toString()
            val secondNum = etSecondnum.text.toString()
            if (firstNum.isBlank()) {
                etFirstnum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondnum.setError("Number is required!")
                return@setOnClickListener
            }
            addNum(firstNum.toInt(),secondNum.toInt())
        }
        btnMinus.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstnum.text.toString()
            val secondNum = etSecondnum.text.toString()
            if (firstNum.isBlank()) {
                etFirstnum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondnum.setError("Number is required!")
                return@setOnClickListener
            }
            minusNum(firstNum.toInt(),secondNum.toInt())
        }
        btnMultiply.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstnum.text.toString()
            val secondNum = etSecondnum.text.toString()
            if (firstNum.isBlank()) {
                etFirstnum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondnum.setError("Number is required!")
                return@setOnClickListener
            }
            multiplyNum(firstNum.toInt(),secondNum.toInt())
        }
        btnModulus.setOnClickListener {
            tvOutput.text=""
            val firstNum = etFirstnum.text.toString()
            val secondNum = etSecondnum.text.toString()
            if (firstNum.isBlank()) {
                etFirstnum.setError("Number is required!")
                return@setOnClickListener
            }
            if (secondNum.isBlank()) {
                etSecondnum.setError("Number is required!")
                return@setOnClickListener
            }
            modulusNum(firstNum.toInt(),secondNum.toInt())
        }


        }
        fun addNum(first_num:Int,second_num:Int){
            val add=first_num+second_num
            tvOutput.text=add.toString()
        }
    fun minusNum(first_num:Int,second_num:Int){
        val add=first_num-second_num
        tvOutput.text=add.toString()
    }
    fun multiplyNum(first_num:Int,second_num:Int){
        val add=first_num*second_num
        tvOutput.text=add.toString()
    }
    fun modulusNum(first_num:Int,second_num:Int){
        val add=first_num%second_num
        tvOutput.text=add.toString()
    }
    }
