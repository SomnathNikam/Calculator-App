package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ac.setOnClickListener {
            binding.inputtext.text = ""
            binding.outputtext.text = ""
        }
        binding.zero.setOnClickListener {
            binding.inputtext.append("0")
        }

        binding.one.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.two.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.three.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.four.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.five.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.six.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.seven.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.eight.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.nine.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.plus.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.minus.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.divide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.cross.setOnClickListener {
            binding.inputtext.append("x")
        }
        binding.lb.setOnClickListener {
            binding.inputtext.append("(")
        }
        binding.rb.setOnClickListener {
            binding.inputtext.append(")")
        }
        binding.dot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.equals.setOnClickListener {
            val expression=ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result =expression.evaluate()
            val longresult = result.toLong()

            if (result==longresult.toDouble()){
                binding.outputtext.text= longresult.toString()
            }
            else{
                binding.outputtext.text= result.toString()
            }
        }
    }
}