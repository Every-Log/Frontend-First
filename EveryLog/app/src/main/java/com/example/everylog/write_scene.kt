package com.example.everylog

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.everylog.databinding.ActivityWriteSceneBinding


class write_scene : AppCompatActivity() {

    val binding by lazy { ActivityWriteSceneBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.DiaryWriteBtn.setOnClickListener {
            //버튼 누를때마다 레이아웃 바뀌도록 하는 코드
            //버튼마다 작성해야 함. 다른 사람들과 합쳐야 하는 부분
        }
    }
}