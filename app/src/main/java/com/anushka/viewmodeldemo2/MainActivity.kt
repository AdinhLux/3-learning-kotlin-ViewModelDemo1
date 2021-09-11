package com.anushka.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.tvResult.text = viewModel.getCurrentSum().toString()

        binding.btnAdd.setOnClickListener {
            if (binding.etInput.text.toString().isNotBlank())
                binding.tvResult.text =
                    viewModel.getModifiedSum(Integer.valueOf(binding.etInput.text.toString()))
                        .toString()
        }
    }
}