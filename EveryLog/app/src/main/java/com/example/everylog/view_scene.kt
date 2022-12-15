package com.example.everylog

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.everylog.databinding.ActivityViewSceneBinding


class view_scene : AppCompatActivity() {
    
    val binding by lazy {ActivityViewSceneBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //누르면 팝업 메뉴 보이도록 하는 코드(three dots)
        binding.ReivewPopUp.setOnClickListener {
            var popupMenu= PopupMenu(applicationContext,it)
            menuInflater?.inflate(R.menu.popup,popupMenu.menu)
            popupMenu.show()
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.edit->{  //수정 선택한 경우
                        return@setOnMenuItemClickListener true
                    }
                    R.id.delete->{  //삭제 선택한 경우
                        return@setOnMenuItemClickListener true
                    }
                    else->{return@setOnMenuItemClickListener false}
                }
            }
        }
    }



}