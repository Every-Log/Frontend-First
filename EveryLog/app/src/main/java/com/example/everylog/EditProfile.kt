package com.example.everylog

import android.Manifest
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.everylog.databinding.ActivityEditProfileBinding

class EditProfile : AppCompatActivity() {

    val REQ_GALLERY = 12

    val binding by lazy {ActivityEditProfileBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //프로필사진 변경 클릭하는 경우
        binding.editProfileImg.setOnClickListener {
            openGallery()
        }

        //저장 버튼 누르는 경우-정보 MAIN으로 넘기기
        binding.btnSave.setOnClickListener {
            val returnIntent = Intent()
            val name = binding.editPersonName.text.toString()
            returnIntent.putExtra("returnValue", name)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
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
                        binding.imageView3.setImageURI(uri)
                    }
                }
           }
        }
    }
}