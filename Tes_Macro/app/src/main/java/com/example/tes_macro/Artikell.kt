package com.example.tes_macro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.ImageView
import android.widget.TextView

class Artikell : AppCompatActivity() {
    private lateinit var textViewForYou: TextView
    private lateinit var textViewRecommendation: TextView
    private lateinit var textViewTranding: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikell)

        textViewForYou = findViewById(R.id.textViewForYou)
        textViewRecommendation = findViewById(R.id.textViewRecommendation)
        textViewTranding = findViewById(R.id.textViewTranding)

        textViewForYou.setOnClickListener {
            updateUnderline(textViewForYou)
            resetUnderline(textViewRecommendation, textViewTranding)
        }

        textViewRecommendation.setOnClickListener {
            updateUnderline(textViewRecommendation)
            resetUnderline(textViewForYou, textViewTranding)
        }

        textViewTranding.setOnClickListener {
            updateUnderline(textViewTranding)
            resetUnderline(textViewForYou, textViewRecommendation)
        }
        data class Artikell(val imageRes: Int, val title: String, val publisher: String, val date: String)

        val artikelList = listOf(
            Artikell(R.drawable.artike1, "Pentingnya Pendidikan Bagi Masa Depan", "Oleh : Dispendik Mojokerto", "15 Agustus 2023"),
            Artikell(R.drawable.artikel2, "8 Cara Membuat Katalog Online untuk Tingkat Bisnis", "Oleh : Redaksi Jagoan Hosting", "15 Agustus 2023"),
            Artikell(R.drawable.artikel4, "Para Penerima Beasiswa Amanah Bangun Desa Telah Memasuki Tahap Implementasi Proyek", "Oleh : Kompasiana", "15 Agustus 2023"),
            Artikell(R.drawable.artikel5, "LazisMu UMS Berikan Beasiswa Hingga Lulus", "Oleh : Dispendik Mojokerto", "15 Agustus 2023"),
            Artikell(R.drawable.artikel6, "Pengumuman Pendaftaran Pewawancara Seleksi Beasiswa Indonesia Bangkit 2023", "Oleh : Dispendik Mojokerto", "15 Agustus 2023"),
            Artikell(R.drawable.artikel7, "Pengumuman Pendaftaran Pewawancara Seleksi Beasiswa Indonesia Bangkit 2023", "Oleh : Dispendik Mojokerto", "15 Agustus 2023")
        )

        setArtikelData(artikelList)
    }

    private fun updateUnderline(textView: TextView) {
        val content = SpannableString(textView.text)
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        textView.text = content
    }

    private fun resetUnderline(vararg textViews: TextView) {
        textViews.forEach {
            it.text = removeUnderline(it)
        }
    }

    private fun removeUnderline(textView: TextView): CharSequence {
        val content = SpannableString(textView.text)
        content.removeSpan(UnderlineSpan())
        return content
    }

    private fun setArtikelData(artikelList: List<ArtikelData>) {
        for ((index, artikelData) in artikelList.withIndex()) {
            val imageView: ImageView = findViewById(resources.getIdentifier("imageView${index + 1}", "id", packageName))
            val textViewTitle = findViewById<TextView>(resources.getIdentifier("textViewTitle${index + 1}", "id", packageName))
            val textViewPublisher = findViewById<TextView>(resources.getIdentifier("textViewPublisher${index + 1}", "id", packageName))
            val textViewDate = findViewById<TextView>(resources.getIdentifier("textViewDate${index + 1}", "id", packageName))
            val imageViewShare: ImageView = findViewById(resources.getIdentifier("imageViewShare${index + 1}", "id", packageName))

            imageView.setImageResource(artikelData.imageRes)
            textViewTitle.text = artikelData.title
            textViewPublisher.text = artikelData.publisher
            textViewDate.text = artikelData.date
        }
    }
}