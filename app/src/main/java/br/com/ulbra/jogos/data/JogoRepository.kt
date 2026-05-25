package br.com.ulbra.jogos.data

import androidx.lifecycle.LiveData
import br.com.ulbra.jogos.data.local.JogoDao
import br.com.ulbra.jogos.model.Jogo

class JogoRepository(private val jogoDao: JogoDao) {
    val allJogos: LiveData<List<Jogo>> = jogoDao.getAll()

    suspend fun insert(jogo: Jogo) {
        jogoDao.insert(jogo)
    }

    suspend fun delete(jogo: Jogo) {
        jogoDao.delete(jogo)
    }
}