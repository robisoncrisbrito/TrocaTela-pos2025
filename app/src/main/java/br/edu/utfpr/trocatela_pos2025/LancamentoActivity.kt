package br.edu.utfpr.trocatela_pos2025

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class LancamentoActivity : AppCompatActivity() {

    private lateinit var etCod : EditText
    private lateinit var etQtd : EditText
    private lateinit var etValor : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamento)

        etCod = findViewById( R.id.etCod )
        etQtd = findViewById( R.id.etQtd )
        etValor = findViewById( R.id.etValor )

    }

    fun btConfirmarOnClick(view: View) {
        val intent = Intent( this, ConfirmarActivity::class.java )

        intent.putExtra( "cod",  etCod.text.toString() )
        intent.putExtra( "qtd",  etQtd.text.toString() )
        intent.putExtra( "valor",  etValor.text.toString() )

        startActivity( intent )
    }

    fun btListarOnClick(view: View) {
        val intent = Intent( this, ListarActivity::class.java )
        getResult.launch( intent )
    }

    private val getResult = registerForActivityResult (
        ActivityResultContracts.StartActivityForResult() ) { it ->

        if ( it.resultCode == RESULT_OK ) {
            val codRetorno = it.data?.getIntExtra( "codRetorno", 0 )
            etCod.setText( codRetorno.toString() )
        }

    }






}