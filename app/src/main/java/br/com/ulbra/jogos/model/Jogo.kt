package br.com.ulbra.jogos.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jogos")
data class Jogo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val plataforma: String,
    val genero: String,
    val descricao: String
)