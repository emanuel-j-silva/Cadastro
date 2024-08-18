package com.example.cadastro

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,
            UnidadesFederativas.entries)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        amb.selectUf.adapter = adapter


        amb.btnLimpar.setOnClickListener {
            clearAllFields()
        }
        amb.btnSalvar.setOnClickListener{
            val formulario = Formulario(
                nomeCompleto = amb.txtNome.text.toString(),
                telefone = amb.txtTelefone.text.toString(),
                email = amb.txtEmail.text.toString(),
                cadastro = amb.lblCadastro.isActivated,
                sexo = amb.rgSexo.checkedRadioButtonId.let {id ->
                    findViewById<RadioButton>(id)?.text.toString() },
                cidade = amb.txtCidade.text.toString(),
                uf = amb.selectUf.selectedItem.toString()
            )

            exibeToast(formulario)
        }

    }
    private fun exibeToast(formulario: Formulario){
        Toast.makeText(this,formulario.toString(),Toast.LENGTH_SHORT).show()
    }

    private fun clearAllFields(){
        amb.txtNome.setText("")
        amb.txtTelefone.setText("")
        amb.txtEmail.setText("")
        amb.txtCidade.setText("")
        amb.checkAssinante.isChecked = false

    }
}