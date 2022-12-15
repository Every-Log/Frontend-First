package com.seohee.everylog_seohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seohee.everylog_seohee.databinding.ActivityDiaryReadBinding
import com.seohee.everylog_seohee.databinding.ActivityDiaryWriteBinding

class DiaryWrite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding by lazy { ActivityDiaryWriteBinding.inflate(layoutInflater) }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}