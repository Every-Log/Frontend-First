package com.seohee.everylog_seohee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.seohee.everylog_seohee.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 뷰바인딩 설정
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.writeBtn.setOnClickListener {
            val intent = Intent(context, DiaryWrite::class.java)
            startActivity(intent)
            activity?.finish()
        }

        return binding.root
    }
}
