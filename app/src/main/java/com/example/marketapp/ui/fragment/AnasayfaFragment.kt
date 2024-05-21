package com.example.marketapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.marketapp.R
import com.example.marketapp.data.entity.Kategori
import com.example.marketapp.data.entity.Urunler
import com.example.marketapp.databinding.FragmentAnasayfaBinding
import com.example.marketapp.ui.adapter.KategoriAdapter
import com.example.marketapp.ui.adapter.UrunlerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.fab.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.favorilerGecis)
        }

        binding.searchView.setOnQueryTextListener(object : OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }

            fun ara(aramaKelimesi:String){
                Log.e("Ürün Ara",aramaKelimesi)
            }
        })

        binding.kategoriRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val kategoriListesi = ArrayList<Kategori>()
        val k1 = Kategori(1,"Su&İçecek","suicecek")
        val k2=  Kategori(2,"Süt Ürünleri","suturunleri")
        val k3 = Kategori(3,"Temel Gıda","temelgida")
        val k4 = Kategori(4,"Meyve&   Sebze","meyvesebze")
        val k5 = Kategori(5,"Atıştırmalık","atistirmalik")
        val k6 = Kategori(6,"Fırından","firindan")
        val k7 = Kategori(7,"Kahvaltılık","kahvaltilik")
        val k8 = Kategori(8,"Ev Bakım","evbakim")
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        kategoriListesi.add(k8)

        val kategoriAdapter = KategoriAdapter(requireContext(),kategoriListesi)
        binding.kategoriRv.adapter = kategoriAdapter
        return binding.root
    }
}
