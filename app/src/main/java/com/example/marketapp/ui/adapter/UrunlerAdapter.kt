package com.example.marketapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.marketapp.data.entity.Urunler
import com.example.marketapp.databinding.CardTasarimBinding
import com.example.marketapp.databinding.FragmentAnasayfaBinding
import com.example.marketapp.ui.fragment.AnasayfaFragmentDirections
import com.example.marketapp.ui.fragment.FavorilerFragmentDirections
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext: Context, var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>(){


    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewUrun.setImageResource(mContext.resources.getIdentifier(urun.resim,"drawable",mContext.packageName))

        t.textViewAd.text = "${urun.adi}"

        t.textViewFiyat.text = " ₺ ${urun.fiyati}"


        t.cardViewUrun.setOnClickListener {
            val gecis = FavorilerFragmentDirections.favoriDetayGecis(urun = urun)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.buttonSepet.setOnClickListener {
            Snackbar.make(it, "${urun.adi} sepete eklendi", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
      return urunlerListesi.size
    }
}