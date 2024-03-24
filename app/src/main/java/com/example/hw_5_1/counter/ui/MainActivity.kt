package com.example.hw_5_1.counter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_5_1.counter.view.CounterView
import com.example.hw_5_1.databinding.ActivityMainBinding
import com.example.hw_5_1.model.Injector

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    private var presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickListeners()
    }

    private fun clickListeners() {
        with(binding) {
            btnInc.setOnClickListener {
                presenter.increase()
                presenter.makeMessage()
                presenter.changeColorText()
            }
            btnDec.setOnClickListener {
                presenter.decrease()
                presenter.makeMessage()
                presenter.changeColorText()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.tvCount.text = count.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvCount.setTextColor(color)
    }
}