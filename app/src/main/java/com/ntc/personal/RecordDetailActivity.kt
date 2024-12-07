package com.ntc.personal

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ntc.personal.databinding.ActivityRecordDetailBinding

const val EXTRA_RECORD_TITLE = "com.ntc.personal.record_title"
const val EXTRA_RECORD_CONTENT = "com.ntc.personal.record_content"
const val EXTRA_RECORD_DATE = "com.ntc.personal.record_date"
class RecordDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecordDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecordDetailBinding.inflate(layoutInflater)

        val title = intent.getStringExtra(EXTRA_RECORD_TITLE)
        val content = intent.getStringExtra(EXTRA_RECORD_CONTENT)
        val date = intent.getStringExtra(EXTRA_RECORD_DATE)

        binding.personalRecordTitle.text = title
        binding.personalRecordContent.setText(content)
        binding.personalRecordDate.text = date


        setContentView(binding.root)
    }

    companion object {
        fun newIntent(packageContext: Context, title: String, content: String, date: String): Intent {
            val intent = Intent(packageContext, RecordDetailActivity::class.java)
            intent.putExtra(EXTRA_RECORD_TITLE, title)
            intent.putExtra(EXTRA_RECORD_CONTENT, content)
            intent.putExtra(EXTRA_RECORD_DATE, date)
            return intent
        }
    }
}