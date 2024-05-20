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
        val u1 = Urunler(1,"Ürün Detayı","Domates","domates",32,600)
        val u2 = Urunler(2,"Ürün Detayı","Ekmek","ekmek",10,50)
        val u3 = Urunler(3,"Ürün Detayı","Elma","kirmizielma",25,1000)
        val u4 = Urunler(4,"Ürün Detayı","Üzüm","uzum",32,600)
        val u5 = Urunler(5,"Ürün Detayı","Salatalık","salatalik",40,500)
        val u6 = Urunler(6,"Ürün Detayı","Cips","rufflescips",40,107)
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)

        val urunlerAdapter = UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunRv.adapter = urunlerAdapter

        return binding.root
    }
}
