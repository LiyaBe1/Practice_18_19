package com.example.breed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.detailsText)
        val imageView = view?.findViewById<ImageView>(R.id.imageView2)
        when(selectedItem){
            "Датский дог" -> {views?.text = context?.getString(R.string.Great)
                imageView?.setImageResource(R.drawable.great_dane)}
            "Бигль" -> {views?.text = context?.getString(R.string.Beagle)
                imageView?.setImageResource(R.drawable.beagle)}
            "Бишон-фризе" -> {views?.text = context?.getString(R.string.Bichon)
                imageView?.setImageResource(R.drawable.bichon_frise)}
            "Такса" -> {views?.text = context?.getString(R.string.Dachshund)
                imageView?.setImageResource(R.drawable.dachshund_smooth_haired)}
        }

    }
}