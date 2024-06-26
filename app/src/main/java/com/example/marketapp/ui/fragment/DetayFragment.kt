package com.example.marketapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.marketapp.R
import com.example.marketapp.databinding.FragmentDetayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)


        val bundle:DetayFragmentArgs by navArgs()
        val urun = bundle.urun

        binding.toolbarDetay.title = urun.adi

        binding.ivUrun.setImageResource(
            resources.getIdentifier(urun.resim,"drawable",requireContext().packageName))

        binding.tvUrunAd.text = "${urun.adi}"

        binding.tvFiyat.text = "₺ ${urun.fiyati}"


        return binding.root
    }
}
