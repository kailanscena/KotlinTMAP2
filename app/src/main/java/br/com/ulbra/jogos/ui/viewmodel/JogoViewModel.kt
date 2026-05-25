package br.com.ulbra.jogos.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import br.com.ulbra.jogos.data.JogoRepository
import br.com.ulbra.jogos.data.local.AppDatabase
import br.com.ulbra.jogos.model.Jogo
import kotlinx.coroutines.launch

class JogoViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: JogoRepository
    val allJogos: LiveData<List<Jogo>>

    init {
        val dao = AppDatabase.getDatabase(application).jogoDao()
        repository = JogoRepository(dao)
        allJogos = repository.allJogos
    }

    fun insert(jogo: Jogo) = viewModelScope.launch {
        repository.insert(jogo)
    }

    fun delete(jogo: Jogo) = viewModelScope.launch {
        repository.delete(jogo)
    }
}