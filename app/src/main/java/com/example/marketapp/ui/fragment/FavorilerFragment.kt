package com.example.marketapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.marketapp.R
import com.example.marketapp.data.entity.Urunler
import com.example.marketapp.databinding.FragmentFavorilerBinding
import com.example.marketapp.ui.adapter.UrunlerAdapter

class FavorilerFragment : Fragment() {
    private lateinit var binding: FragmentFavorilerBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavorilerBinding.inflate(inflater, container, false)


        binding.urunRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Salatalık","","Meyve&Sebze",40.0,0.0,"Çengelköy Salatalık","salatalik",null)
        val u7 = Urunler(1,"Elma","","Meyve&Sebze",20.0,0.0,"Kırmızı Elma","elma",null)
        urunlerListesi.add(u1)
        urunlerListesi.add(u7)

        val urunlerAdapter = UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunRv.adapter = urunlerAdapter

        return binding.root
    }
}
