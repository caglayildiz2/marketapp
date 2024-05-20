package com.example.marketapp.data.entity

import java.io.Serializable

data class Urunler(
    var id: Int,
    var detay:String,
    var ad:String,
    var resim:String,
    var fiyat:Int,
    var olcu:Int) : Serializable{
}