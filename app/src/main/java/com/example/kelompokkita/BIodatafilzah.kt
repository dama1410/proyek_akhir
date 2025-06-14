package com.example.kelompokkita

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class BiodatafilzahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodatafilzah)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvNIM = findViewById<TextView>(R.id.tvNim)
        val tvJurusan = findViewById<TextView>(R.id.tvAlamat)
        val tvAlamat = findViewById<TextView>(R.id.tvEmail)
        val tvUniversitas = findViewById<TextView>(R.id.tvTelepon)

        tvNama.text = getString(R.string.Nama_Filzah)
        tvNIM.text = getString(R.string.Nim_Filzah)
        tvJurusan.text = getString(R.string.Alamat_Filzah)
        tvAlamat.text = getString(R.string.Email_Filzah)
        tvUniversitas.text = getString(R.string.Telepon_Filzah)
    }
}
