package com.example.kelompokkita

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AktivitasSehariHariActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aktivitas_seharihari)

        val anim = AnimationUtils.loadAnimation(this, R.anim.fly)

        val butterfly1 = findViewById<ImageView>(R.id.butterflyImage1)
        val butterfly2 = findViewById<ImageView>(R.id.butterflyImage2)

        butterfly1.startAnimation(anim)
        butterfly2.startAnimation(anim)


    }
}
