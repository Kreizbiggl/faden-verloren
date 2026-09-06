package de.kreizbiggl.fadenverloren

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import de.kreizbiggl.fadenverloren.data.Faden
import de.kreizbiggl.fadenverloren.data.FadenDao
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FadenViewModel(private val dao: FadenDao) : ViewModel() {
    val faden: StateFlow<List<Faden>> = dao.observeAll()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    fun speichern(text: String) {
        val trimmed = text.trim()
        if (trimmed.isEmpty()) return
        viewModelScope.launch {
            dao.insert(Faden(text = trimmed))
        }
    }

    class Factory(private val dao: FadenDao) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(FadenViewModel::class.java)) {
                return FadenViewModel(dao) as T
            }
            throw IllegalArgumentException("Unknown ViewModel: ${modelClass.name}")
        }
    }
}
