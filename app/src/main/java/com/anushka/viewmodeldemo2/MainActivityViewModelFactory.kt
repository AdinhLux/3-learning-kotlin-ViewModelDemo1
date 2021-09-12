package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

/**
 * This is a class used to create custom ViewModel classes
 *
 * We use it to pass values to private fields (like 'sum' in 'MainActivityViewModel.kt')
 *
 * We need to define 'startingSum' as variable to pass it to ViewModel classes when constructing them
 */
class MainActivityViewModelFactory(private val startingSum: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(startingSum) as T
        }

        throw IllegalArgumentException("Unknown View Model Class")
    }
}