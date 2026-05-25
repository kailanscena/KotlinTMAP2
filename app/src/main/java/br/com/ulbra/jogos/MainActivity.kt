package br.com.ulbra.jogos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.ulbra.jogos.model.Jogo
import br.com.ulbra.jogos.ui.JogoAdapter
import br.com.ulbra.jogos.ui.viewmodel.JogoViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: JogoViewModel by viewModels()
    private lateinit var adapter: JogoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = JogoAdapter { jogo ->
            viewModel.delete(jogo)
        }

        val etNome = findViewById<EditText>(R.id.etNome)
        val etPlataforma = findViewById<EditText>(R.id.etPlataforma)
        val etGenero = findViewById<EditText>(R.id.etGenero)
        val etDescricao = findViewById<EditText>(R.id.etDescricao)
        val btnAdicionar = findViewById<Button>(R.id.btnAdicionar)
        val rvJogos = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rvJogos)

        rvJogos.adapter = adapter

        btnAdicionar.setOnClickListener {
            val nome = etNome.text.toString()
            val plataforma = etPlataforma.text.toString()
            val genero = etGenero.text.toString()
            val descricao = etDescricao.text.toString()

            if (nome.isNotEmpty() && plataforma.isNotEmpty()) {
                val jogo = Jogo(nome = nome, plataforma = plataforma, genero = genero, descricao = descricao)
                viewModel.insert(jogo)
                etNome.text.clear()
                etPlataforma.text.clear()
                etGenero.text.clear()
                etDescricao.text.clear()
            } else {
                Toast.makeText(this, "Preencha os campos obrigatórios", Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.allJogos.observe(this) { jogos ->
            adapter.submitList(jogos)
        }
    }
}