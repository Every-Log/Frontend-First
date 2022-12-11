package com.example.everylog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.everylog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val PERM_STORAGE = 9
    val PERN_CAMERA = 10

    val REQ_CAMERA = 11

    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {

        val intent = Intent(this, EditProfile::class.java)
        val intent2 = Intent(this, view_scene::class.java)

        var pre_color = "g"
        var percent = 0

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener {
            //로그아웃
            startActivityForResult(intent2, 99)
        }

        //프로필 편집 누르면 편집 레이아웃으로 전환
        binding.EditProfile.setOnClickListener {
            startActivityForResult(intent, 99)
        }

        //진행도 표시 코드
        binding.progressBar.setProgress(100)


        //색 바뀌는 코드
        if(binding.progressBar.progress==100){
            binding.progressBar.setProgress(0)
            when(pre_color) {
                "g" -> {
                    binding.EggImg.setImageResource(R.drawable.yellow_grey)
                    pre_color = "gy"
                }
                "gy"-> {
                    binding.EggImg.setImageResource(R.drawable.light_yellow)
                    pre_color = "ly"
                }
                "ly" -> {
                    binding.EggImg.setImageResource(R.drawable.yellow_egg)
                    pre_color = "y"
                }
                else -> {}
            }
        }


    }

    //프로필 편집한 것 메인 화면에 적용(메인에서 받기)
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode== RESULT_OK){
            when(requestCode){
                99->{
                    data?.getStringExtra("returnValue")?.let { message ->
                        binding.UserName.setText(message)
                    }
                }
            }
        }
    }
}