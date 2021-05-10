package com.britishbroadcast.databinding101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.britishbroadcast.databinding101.databinding.ActivityMainBinding
import com.britishbroadcast.databinding101.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        viewModel = MainViewModel()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel

        Handler(mainLooper).postDelayed({
            viewModel.changeTopic()
        }, 4000)

    }
}