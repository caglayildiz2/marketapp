package com.example.marketapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marketapp.data.entity.Kategori
import com.example.marketapp.databinding.CardTasarimKategoriBinding

class KategoriAdapter(var mContext: Context, var kategoriListesi: ArrayList<Kategori>)

    : RecyclerView.Adapter<KategoriAdapter.CardTasarimKategoriTutucu>(){

    inner class CardTasarimKategoriTutucu(var tasarim:CardTasarimKategoriBinding) : RecyclerView.ViewHolder(tasarim.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimKategoriTutucu{
        val binding = CardTasarimKategoriBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimKategoriTutucu(binding)
    }

    override fun onBindViewHolder(holder: KategoriAdapter.CardTasarimKategoriTutucu, position: Int) {
        val kategori = kategoriListesi.get(position)
        val t = holder.tasarim

        t.imageViewKategori.setImageResource(mContext.resources.getIdentifier(kategori.resim,"drawable",mContext.packageName))

        t.textViewKatAd.text = "${kategori.ad}"

    }

    override fun getItemCount(): Int {
        return kategoriListesi.size
    }
}