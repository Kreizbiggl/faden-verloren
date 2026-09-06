package de.kreizbiggl.fadenverloren.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FadenDao {
    @Query("SELECT * FROM faden ORDER BY createdAt DESC")
    fun observeAll(): Flow<List<Faden>>

    @Insert
    suspend fun insert(faden: Faden)
}
