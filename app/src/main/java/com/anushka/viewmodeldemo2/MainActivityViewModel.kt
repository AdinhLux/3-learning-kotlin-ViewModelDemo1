package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

/**
 * Class extending ViewModel
 *
 * When during a configuration change like screen rotation, the Activity is destroyed and recreated. ViewModel helps us to keep data in memory.
 *
 * 'startingSum' is a constructor parameter to be used with a ViewModel Factory class
 */
class MainActivityViewModel(startingSum: Int) : ViewModel() {
    private var sum = 0

    // Method to pass value from constructor parameter to private field
    init {
        sum = startingSum
    }

    fun getCurrentSum(): Int {
        return sum
    }

    fun getModifiedSum(value: Int): Int {
        sum += value
        return sum
    }
}