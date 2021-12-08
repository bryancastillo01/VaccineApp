package com.misiontic2022.aplicacionnueva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_vista_janssen.*
import kotlinx.android.synthetic.main.activity_vista_pfizer.*

class VistaPfizer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_pfizer)
        btnVolver4.setOnClickListener {
            val intent: Intent = Intent(this, VistaCatalogoVacunas::class.java)
            startActivity(intent)
        }
        btnComprar4.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("Compra realizada")
                setMessage("Usted a comprado Vacunas Pfizer")

            }.show()
        }
    }
}