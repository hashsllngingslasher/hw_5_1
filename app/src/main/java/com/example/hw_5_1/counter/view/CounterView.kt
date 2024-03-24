package com.example.hw_5_1.counter.view

interface CounterView {

    fun showCount(count: Int) {
    }

    fun showToast(message: String) {
    }

    fun changeColor(color: Int) {
    }
}