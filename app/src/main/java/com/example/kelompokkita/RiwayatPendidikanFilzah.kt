package com.example.kelompokkita

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RiwayatPendidikanFilzahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pendidikan_filzah)

        val tvSD = findViewById<TextView>(R.id.tvSD)
        val tvSMP = findViewById<TextView>(R.id.tvSMP)
        val tvSMK = findViewById<TextView>(R.id.tvSMK)
        val tvUniv = findViewById<TextView>(R.id.tvUNIVERSITAS)

        tvSD.text = getString(R.string.SD_Filzah)
        tvSMP.text = getString(R.string.SMP_Filzah)
        tvSMK.text = getString(R.string.SMK_Filzah)
        tvUniv.text = getString(R.string.UNIVERSITAS_Filzah)
    }
}
