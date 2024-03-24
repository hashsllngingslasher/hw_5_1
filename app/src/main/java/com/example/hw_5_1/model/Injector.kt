package com.example.hw_5_1.model

import com.example.hw_5_1.counter.Presenter
import com.example.hw_5_1.counter.view.CounterView

class Injector {

    companion object {
        fun getModel() = CounterModel()

        fun getPresenter(view: CounterView) = Presenter(view)
    }
}