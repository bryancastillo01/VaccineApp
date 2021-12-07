package com.misiontic2022.aplicacionnueva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_catalogo_vacunas.*
import kotlinx.android.synthetic.main.activity_vista_janssen.*
import kotlinx.android.synthetic.main.activity_vista_astrazeneca.*
import kotlinx.android.synthetic.main.activity_vista_moderna.*
import kotlinx.android.synthetic.main.activity_vista_pfizer.*
import kotlinx.android.synthetic.main.activity_vista_moderna.*
import kotlinx.android.synthetic.main.activity_vista_sinovac.*

class VistaCatalogoVacunas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo_vacunas)
        /*btnIrSinovac.setOnClickListener {
            val intent: Intent = Intent(this,VistaSinovac::class.java)
            startActivity(intent)
        }
        btnIrPfizer.setOnClickListener {
            val intent: Intent = Intent(this,VistaPfizer::class.java)
            startActivity(intent)
        }
        btnIrModerna.setOnClickListener {
            val intent: Intent = Intent(this,VistaModerna::class.java)
            startActivity(intent)
        }
        btnIrSinopharm.setOnClickListener {
            val intent: Intent = Intent(this,VistaSinopharm::class.java)
            startActivity(intent)
        }
        btnIrAstrazeneca.setOnClickListener {
            val intent: Intent = Intent(this,VistaAstrazeneca::class.java)
            startActivity(intent)
        }
        btnIrJanssen.setOnClickListener {
            val intent: Intent = Intent(this,VistaJanssen::class.java)
            startActivity(intent)
        }*/
    }
}