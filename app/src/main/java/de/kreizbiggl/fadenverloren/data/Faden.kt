package de.kreizbiggl.fadenverloren.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "faden")
data class Faden(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val text: String,
    val createdAt: Long = System.currentTimeMillis()
)
