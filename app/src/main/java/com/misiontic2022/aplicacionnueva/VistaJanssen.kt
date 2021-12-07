package com.misiontic2022.aplicacionnueva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_vista_janssen.*

class VistaJanssen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_janssen)
        btnVolver2.setOnClickListener {
            val intent: Intent = Intent(this, VistaCatalogoVacunas::class.java)
            startActivity(intent)
        }
    }
}