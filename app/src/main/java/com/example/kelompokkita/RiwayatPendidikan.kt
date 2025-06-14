package com.example.kelompokkita

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RiwayatPendidikanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_pendidikan)

        val tvSD = findViewById<TextView>(R.id.tvSD)
        val tvSMP = findViewById<TextView>(R.id.tvSMP)
        val tvSMK = findViewById<TextView>(R.id.tvSMK)
        val tvUniv = findViewById<TextView>(R.id.tvUNIVERSITAS)

        tvSD.text = getString(R.string.SD_Mutia)
        tvSMP.text = getString(R.string.SMP_Mutia)
        tvSMK.text = getString(R.string.SMK_Mutia)
        tvUniv.text = getString(R.string.UIVERSITAS_Mutia)
    }
}
