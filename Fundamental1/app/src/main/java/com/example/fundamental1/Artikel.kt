package com.example.fundamental1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView
import android.widget.ImageView

class Artikel : AppCompatActivity() {

    private lateinit var textViewForYou: TextView
    private lateinit var textViewRecommendation: TextView
    private lateinit var textViewTranding: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikel)

        textViewForYou = findViewById(R.id.textViewForYou)
        textViewRecommendation = findViewById(R.id.textViewRecommendation)
        textViewTranding = findViewById(R.id.textViewTranding)

        textViewForYou.setOnClickListener { updateUnderline(textViewForYou) }
        textViewRecommendation.setOnClickListener { updateUnderline(textViewRecommendation) }
        textViewTranding.setOnClickListener { updateUnderline(textViewTranding) }
    }

    private fun updateUnderline(textView: TextView) {
        resetUnderline()

        val content = SpannableString(textView.text)
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        textView.text = content
    }

    private fun resetUnderline() {
        // Reset underline for all text views
        textViewForYou.text = removeUnderline(textViewForYou)
        textViewRecommendation.text = removeUnderline(textViewRecommendation)
        textViewTranding.text = removeUnderline(textViewTranding)
    }

    private fun removeUnderline(textView: TextView): CharSequence {
        val content = SpannableString(textView.text)
        content.removeSpan(UnderlineSpan())
        return content
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikel)

        // Artikel 1
        val imageView1: ImageView = findViewById(R.id.imageView)
        val textViewTitle1 = findViewById<TextView>(R.id.textViewTitle)
        val textViewPublisher1 = findViewById<TextView>(R.id.textViewPublisher)
        val textViewDate1 = findViewById<TextView>(R.id.textViewDate)
        val imageViewShare1: ImageView = findViewById(R.id.imageViewShare1)

        // Artikel 2
        val imageView2: ImageView = findViewById(R.id.imageView2)
        val textViewTitle2 = findViewById<TextView>(R.id.textViewTitle2)
        val textViewPublisher2 = findViewById<TextView>(R.id.textViewPublisher2)
        val textViewDate2 = findViewById<TextView>(R.id.textViewDate2)
        val imageViewShare2: ImageView = findViewById(R.id.imageViewShare2)

        // Artikel 3
        val imageView3: ImageView = findViewById(R.id.imageView3)
        val textViewTitle3 = findViewById<TextView>(R.id.textViewTitle3)
        val textViewPublisher3 = findViewById<TextView>(R.id.textViewPublisher3)
        val textViewDate3 = findViewById<TextView>(R.id.textViewDate3)
        val imageViewShare3: ImageView = findViewById(R.id.imageViewShare3)

        // Artikel 4
        val imageView4: ImageView = findViewById(R.id.imageView4)
        val textViewTitle4 = findViewById<TextView>(R.id.textViewTitle4)
        val textViewPublisher4 = findViewById<TextView>(R.id.textViewPublisher4)
        val textViewDate4 = findViewById<TextView>(R.id.textViewDate4)
        val imageViewShare4: ImageView = findViewById(R.id.imageViewShare4)

        // Artikel 5
        val imageView5: ImageView = findViewById(R.id.imageView5)
        val textViewTitle5 = findViewById<TextView>(R.id.textViewTitle5)
        val textViewPublisher5 = findViewById<TextView>(R.id.textViewPublisher5)
        val textViewDate5 = findViewById<TextView>(R.id.textViewDate5)
        val imageViewShare5: ImageView = findViewById(R.id.imageViewShare5)

        // Artikel 6
        val imageView6: ImageView = findViewById(R.id.imageView6)
        val textViewTitle6 = findViewById<TextView>(R.id.textViewTitle6)
        val textViewPublisher6 = findViewById<TextView>(R.id.textViewPublisher6)
        val textViewDate6 = findViewById<TextView>(R.id.textViewDate6)
        val imageViewShare6: ImageView = findViewById(R.id.imageViewShare6)

        // Set data Artikel 1
        imageView1.setImageResource(R.drawable.artike1)
        textViewTitle1.text = "Pentingnya Pendidikan Bagi Masa Depan"
        textViewPublisher1.text = "Oleh : Dispendik Mojokerto"
        textViewDate1.text = "15 Agustus 2023"

        // Set data Artikel 2
        imageView2.setImageResource(R.drawable.artikel2)
        textViewTitle2.text = "8 Cara Membuat Katalog Online untuk Tingkat Bisnis"
        textViewPublisher2.text = "Oleh : Redaksi Jagoan Hosting"
        textViewDate2.text = "15 Agustus 2023"

        // Set data Artikel 3
        imageView3.setImageResource(R.drawable.artikel4)
        textViewTitle3.text = "Para Penerima Beasiswa Amanah Bangun Desa Telah Memasuki Tahap Implementasi Proyek"
        textViewPublisher3.text = "Oleh : Kompasiana"
        textViewDate3.text = "15 Agustus 2023"

        // Set data for Artikel 4
        imageView4.setImageResource(R.drawable.artikel5)
        textViewTitle4.text = "LazisMu UMS Berikan Beasiswa Hingga Lulus"
        textViewPublisher4.text = "Oleh : Dispendik Mojokerto"
        textViewDate4.text = "15 Agustus 2023"

        // Set data for Artikel 5
        imageView5.setImageResource(R.drawable.artikel6)
        textViewTitle5.text = "Pengumuman Pendaftaran Pewawancara Seleksi Beasiswa Indonesia Bangkit 2023"
        textViewPublisher5.text = "Oleh : Dispendik Mojokerto"
        textViewDate5.text = "15 Agustus 2023"

        // Set data for Artikel 6
        imageView6.setImageResource(R.drawable.artikel7)
        textViewTitle6.text = "Pengumuman Pendaftaran Pewawancara Seleksi Beasiswa Indonesia Bangkit 2023"
        textViewPublisher6.text = "Oleh : Dispendik Mojokerto"
        textViewDate6.text = "15 Agustus 2023"
    }
}
