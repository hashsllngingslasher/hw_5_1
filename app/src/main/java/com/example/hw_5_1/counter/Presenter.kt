package com.example.hw_5_1.counter

import android.graphics.Color
import com.example.hw_5_1.counter.view.CounterView
import com.example.hw_5_1.model.Injector

class Presenter(private var view: CounterView) {
    private val model = Injector.getModel()

    fun increase() {
        model.inc()
        view.showCount(model.count)
    }

    fun decrease() {
        model.dec()
        view.showCount(model.count)
    }

    fun makeMessage() {
        if (model.count == 10) view.showToast("Yeah its 10")
    }

    fun changeColorText() {
        if (model.count == 15) view.changeColor(Color.GREEN)
        else view.changeColor(Color.BLACK)
    }
}