package com.example.bicycle.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.bicycle.data.Bicycle
import com.example.bicycle.viewmodel.BicycleViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BicycleListScreen(
    viewModel: BicycleViewModel,
    onAddNewBike: () -> Unit,
    onEditBike: (String) -> Unit
) {
    // Observe the list of bicycles from the ViewModel
    val bicycles by viewModel.bicycles.collectAsStateWithLifecycle()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Bikes") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White
                )
            )
        },
        bottomBar = {
            Button(
                onClick = onAddNewBike,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
            ) {
                Text("New Bike", color = Color.White)
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 8.dp)
        ) {
            items(bicycles, key = { it.id }) { bicycle ->
                BicycleListItem(bicycle = bicycle) {
                    onEditBike(bicycle.id)
                }
            }
        }
    }
}

@Composable
fun BicycleListItem(bicycle: Bicycle, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = com.example.bicycle.R.drawable.bicycle),
                contentDescription = "Bicycle Icon",
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = bicycle.brand, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "${bicycle.model} (${bicycle.year})", color = Color.Gray)
            }
        }
    }
}