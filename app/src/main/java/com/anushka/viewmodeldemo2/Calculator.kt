package com.anushka.viewmodeldemo2

/**
 * Data classes specialize in holding data. The Kotlin compiler automatically generates the following functionality for them:
 *
 * A correct, complete, and readable 'toString()' method
 * Value equality-based 'equals()' and 'hashCode()' methods
 * Utility 'copy()' and 'componentN()' methods
 *
 * The primary constructor must not be empty, and it should contain only val or var properties.
 *
 * https://www.raywenderlich.com/20934302-deep-dive-into-kotlin-data-classes-for-android
 * https://weihungchin.medium.com/a-practical-guide-to-kotlin-data-class-with-examples-6e30771ba717
 */
data class Calculator(
    var sum: Int,
) {}