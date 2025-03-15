package br.edu.utfpr.trocatela_pos2025

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btLancamentoOnClick(view: View) {
        val intent = Intent( this, LancamentoActivity::class.java )
        startActivity( intent )
    }
}