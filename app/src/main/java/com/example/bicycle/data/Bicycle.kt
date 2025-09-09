package com.example.bicycle.data

import java.util.UUID

data class Bicycle(
    val id: String = UUID.randomUUID().toString(), // Unique ID for each bicycle
    val brand: String,
    val model: String,
    val year: Int
)

// The initial mock data list, as provided.
val mockBicycles = listOf(
    Bicycle(brand = "Trek", model = "Marlin 7", year = 2021),
    Bicycle(brand = "Specialized", model = "Stumpjumper", year = 2019),
    Bicycle(brand = "Giant", model = "TCR Advanced", year = 2020),
    Bicycle(brand = "Cannondale", model = "Scalpel", year = 2018),
    Bicycle(brand = "Santa Cruz", model = "Hightower", year = 2022),
    Bicycle(brand = "Pivot", model = "Mach 5.5", year = 2017),
    Bicycle(brand = "Scott", model = "Spark RC", year = 2023),
    Bicycle(brand = "Bianchi", model = "Impulso", year = 2016),
    Bicycle(brand = "Orbea", model = "Orca", year = 2024),
    Bicycle(brand = "Kona", model = "Process 153", year = 2015),
    Bicycle(brand = "Marin", model = "Rift Zone", year = 2014),
    Bicycle(brand = "Yeti", model = "SB130", year = 2021),
    Bicycle(brand = "Norco", model = "Sight", year = 2019),
    Bicycle(brand = "Felt", model = "FR Advanced", year = 2013),
    Bicycle(brand = "Cube", model = "Reaction", year = 2018),
    Bicycle(brand = "GT", model = "Aggressor", year = 2012),
    Bicycle(brand = "Fuji", model = "Transonic", year = 2020),
    Bicycle(brand = "Rocky Mountain", model = "Growler 20", year = 2019),
    Bicycle(brand = "Merida", model = "Big.Nine", year = 2016),
    Bicycle(brand = "Colnago", model = "C64", year = 2025)
)
