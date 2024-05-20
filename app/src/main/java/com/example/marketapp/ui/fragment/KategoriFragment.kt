package com.example.marketapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marketapp.R
import com.example.marketapp.databinding.FragmentKategoriBinding

class KategoriFragment : Fragment() {
    private lateinit var binding : FragmentKategoriBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKategoriBinding.inflate(inflater,container,false)


        return binding.root
    }
}
