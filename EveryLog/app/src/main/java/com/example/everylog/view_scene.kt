package com.example.everylog

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.everylog.databinding.ActivityViewSceneBinding


class view_scene : AppCompatActivity() {
    
    val binding by lazy {ActivityViewSceneBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var data = listOf("수정","삭제")
        var adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1 , data)

        binding.ThreeDots.adapter=adapter


        //해당 스피너가 클릭되면 해당 기능 수행
        binding.ThreeDots.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (data.get(position) == "수정") {
                    //다시 write하러 돌아가기
                } else {
                    //진짜 삭제할 것인지 토스트 메시지 띄우기
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}