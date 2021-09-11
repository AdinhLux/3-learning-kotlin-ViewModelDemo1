package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

/**
 * Class extending ViewModel
 *
 * When during a configuration change like screen rotation, the Activity is destroyed and recreated. ViewModel helps us to keep data in memory.
 */
class MainActivityViewModel : ViewModel() {
    private var sum = 0

    fun getCurrentSum(): Int {
        return sum
    }

    fun getModifiedSum(value: Int): Int {
        sum += value
        return sum
    }
}