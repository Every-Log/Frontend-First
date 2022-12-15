package com.seohee.everylog_seohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seohee.everylog_seohee.databinding.ActivityDiaryReadBinding

class DiaryRead : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding by lazy { ActivityDiaryReadBinding.inflate(layoutInflater) }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}