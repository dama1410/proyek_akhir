package com.example.kelompokkita

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvNIM = findViewById<TextView>(R.id.tvNim)
        val tvJurusan = findViewById<TextView>(R.id.tvAlamat)
        val tvAlamat = findViewById<TextView>(R.id.tvEmail)
        val tvUniversitas = findViewById<TextView>(R.id.tvTelepon)

        tvNama.text = getString(R.string.Nama_Mutia)
        tvNIM.text = getString(R.string.Nim_Mutia)
        tvJurusan.text = getString(R.string.Alamat_Mutia)
        tvAlamat.text = getString(R.string.Email_Mutia)
        tvUniversitas.text = getString(R.string.Telepon_Mutia)

        val anim = AnimationUtils.loadAnimation(this, R.anim.fly)

        val butterfly1 = findViewById<ImageView>(R.id.butterflyImage1)
        val butterfly2 = findViewById<ImageView>(R.id.butterflyImage2)
        val butterfly3 = findViewById<ImageView>(R.id.butterflyImage3)

        butterfly1.startAnimation(anim)
        butterfly2.startAnimation(anim)
        butterfly3.startAnimation(anim)

    }
}
