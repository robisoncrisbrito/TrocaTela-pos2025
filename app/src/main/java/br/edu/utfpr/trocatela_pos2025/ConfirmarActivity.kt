package br.edu.utfpr.trocatela_pos2025

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var tvCod : TextView
    private lateinit var tvQtd : TextView
    private lateinit var tvValor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)

        val cod = intent.getStringExtra(  "cod" )
        val qtd = intent.getStringExtra(  "qtd" )
        val valor = intent.getStringExtra(  "valor" )

        tvCod = findViewById( R.id.tvCod )
        tvQtd = findViewById( R.id.tvQtd )
        tvValor = findViewById( R.id.tvValor )

        tvCod.setText( cod )
        tvQtd.setText( qtd )
        tvValor.setText( valor )

    }
}