package com.ntc.personal

import RecordViewModel
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ntc.personal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val recordViewModel: RecordViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.recordCardTitle.text = recordViewModel.recordTitle
        binding.recordCardDate.text = recordViewModel.recordDate.toString()
        binding.recordCardContent.text = recordViewModel.recordContent

        binding.recordCard.setOnClickListener {
            intentToRecordDetail(recordViewModel.recordTitle, recordViewModel.recordContent, recordViewModel.recordDate.toString())
        }

        setContentView(binding.root)
    }

    private fun intentToRecordDetail(title: String, content: String, date: String) {
        val intent = RecordDetailActivity.newIntent(this@MainActivity, title, content, date)
        startActivity(intent)
    }
}