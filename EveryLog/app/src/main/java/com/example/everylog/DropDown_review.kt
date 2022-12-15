package com.example.everylog

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.everylog.databinding.ActivityDropDownReviewBinding
import com.example.everylog.frag.ReviewFragment

class DropDown_review : AppCompatActivity() {
    val binding by lazy {ActivityDropDownReviewBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        //스피너 리스트 만드는 코드
        var data = listOf("일기", "리뷰", "여행", "공부")
        var adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, data)

        binding.spinner.adapter=adapter


        //해당 스피너가 클릭되면 해당 프래그먼트로 레이아웃 바뀌는 코드
        binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                /*if(data.get(position)=="리뷰")
                    setFragment()*/
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        //삭제 버튼 누르면
        binding.btnTrash.setOnClickListener {

        }
    }

    fun setFragment(){
        //1. 사용할 프래그먼트 생성
        val reviewFragment = ReviewFragment()
        //2. 트랜잭션 생성
        val transaction = supportFragmentManager.beginTransaction()
        //3. 트랜잭션을 통해 프래그먼트 삽입
        //transaction.add(binding.ChangeLayout, reviewFragment)
        transaction.commit()
    }
}
