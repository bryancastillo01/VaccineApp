package com.misiontic2022.aplicacionnueva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vista_sinopharm.*

class VistaSinopharm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_sinopharm)
        btnVolver5.setOnClickListener {
            val intent: Intent = Intent(this, VistaCatalogoVacunas::class.java)
            startActivity(intent)
        }
    }
}