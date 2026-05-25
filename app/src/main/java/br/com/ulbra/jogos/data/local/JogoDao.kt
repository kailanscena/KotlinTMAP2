package br.com.ulbra.jogos.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import br.com.ulbra.jogos.model.Jogo

@Dao
interface JogoDao {
    @Query("SELECT * FROM jogos ORDER BY id DESC")
    fun getAll(): LiveData<List<Jogo>>

    @Insert
    suspend fun insert(jogo: Jogo)

    @Delete
    suspend fun delete(jogo: Jogo)

    @Query("DELETE FROM jogos")
    suspend fun deleteAll()
}