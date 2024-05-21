package com.example.marketapp.data.entity

import java.io.Serializable

 data class Urunler(
    var id: Int,
    var adi:String?,
    var barkod:String?,
    var kategori:String?,
    var fiyati:Double?,
    var stok_miktari:Double?,
    var aciklama:String?,
    var resim:String?,
    var yapay_zeka_sorgusu:String?,
    var sepet_miktari :Int = 0,
    ) : Serializable{
}