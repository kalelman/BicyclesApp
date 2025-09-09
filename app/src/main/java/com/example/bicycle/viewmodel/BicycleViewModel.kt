package com.example.bicycle.viewmodel

import androidx.lifecycle.ViewModel
import com.example.bicycle.data.Bicycle
import com.example.bicycle.data.mockBicycles
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BicycleViewModel : ViewModel() {

    // Private mutable state flow to hold the list of bicycles
    private val _bicycles = MutableStateFlow<List<Bicycle>>(emptyList())
    // Public immutable state flow for the UI to observe
    val bicycles: StateFlow<List<Bicycle>> = _bicycles.asStateFlow()

    init {
        // Load the initial mock data when the ViewModel is created
        _bicycles.value = mockBicycles
    }

    /**
     * Finds a bicycle in the list by its unique ID.
     */
    fun getBicycleById(id: String?): Bicycle? {
        return _bicycles.value.find { it.id == id }
    }

    /**
     * Adds a new bicycle to the list.
     */
    fun addBicycle(brand: String, model: String, year: Int) {
        val newBicycle = Bicycle(brand = brand, model = model, year = year)
        _bicycles.update { currentList ->
            // Add the new bicycle to the beginning of the list
            listOf(newBicycle) + currentList
        }
    }

    /**
     * Updates an existing bicycle in the list.
     */
    fun updateBicycle(id: String, brand: String, model: String, year: Int) {
        _bicycles.update { currentList ->
            currentList.map { bicycle ->
                if (bicycle.id == id) {
                    // Return the updated bicycle
                    bicycle.copy(brand = brand, model = model, year = year)
                } else {
                    // Return the original bicycle
                    bicycle
                }
            }
        }
    }
}