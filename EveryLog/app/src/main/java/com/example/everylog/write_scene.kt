package com.example.everylog

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.everylog.databinding.ActivityWriteSceneBinding
import java.util.*


class write_scene : AppCompatActivity() {

    val REQ_GALLERY = 12

    val binding by lazy { ActivityWriteSceneBinding.inflate(layoutInflater) }

    var arrayList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //완료 버튼 누르면 일단 해시태그만 전달되도록 함 (중복되는 문제 발생, []가 자꾸 같이 껴있음)
        binding.reviewWritesubmitBtn.setOnClickListener {
            val st = StringTokenizer(binding.ReviewHashTagEditText.text.toString(),"#")
            var j=st.countTokens()
            for(i in 1..j){
                arrayList.add(st.nextToken().toString())
            }
            binding.editTextReviewContent.setText(arrayList.toString())
        }

        binding.ReviewImageView.setOnClickListener {
            openGallery()
        }

        /*binding.DiaryWriteBtn.setOnClickListener {
            //버튼 누를때마다 레이아웃 바뀌도록 하는 코드
            //버튼마다 작성해야 함. 다른 사람들과 합쳐야 하는 부분
        }*/

        //binding.ReviewHashTagEditText.
    }
    //갤러리 호출 코드(창 띄우는 코드)
    fun openGallery(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = MediaStore.Images.Media.CONTENT_TYPE
        startActivityForResult(intent, REQ_GALLERY)
    }

    //갤러리에서 선택 후 호출됨(edit 화면 프사 바뀜)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode== RESULT_OK){
            when(requestCode){
                REQ_GALLERY->{
                    data?.data?.let { uri->
                        binding.ReviewImageView.setImageURI(uri)
                    }
                }
            }
        }
    }
}