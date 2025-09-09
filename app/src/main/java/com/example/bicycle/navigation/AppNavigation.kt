package com.example.bicycle.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bicycle.ui.theme.screens.BicycleFormScreen
import com.example.bicycle.ui.theme.screens.BicycleListScreen
import com.example.bicycle.viewmodel.BicycleViewModel

// Define the routes for our app to avoid using raw strings
object Routes {
    const val BICYCLE_LIST = "bicycleList"
    const val BICYCLE_FORM = "bicycleForm"
    const val BICYCLE_ID_ARG = "bicycleId" // Argument name for passing the ID
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    // We create a single instance of the ViewModel that will be shared across screens
    val bicycleViewModel: BicycleViewModel = viewModel()

    NavHost(navController = navController, startDestination = Routes.BICYCLE_LIST) {

        // Route for the Bicycle List Screen
        composable(Routes.BICYCLE_LIST) {
            BicycleListScreen(
                viewModel = bicycleViewModel,
                onAddNewBike = {
                    navController.navigate(Routes.BICYCLE_FORM)
                },
                onEditBike = { bikeId ->
                    navController.navigate("${Routes.BICYCLE_FORM}?${Routes.BICYCLE_ID_ARG}=$bikeId")
                }
            )
        }

        // Route for the Create/Update Form Screen
        composable(
            route = "${Routes.BICYCLE_FORM}?${Routes.BICYCLE_ID_ARG}={${Routes.BICYCLE_ID_ARG}}",
            arguments = listOf(navArgument(Routes.BICYCLE_ID_ARG) {
                type = NavType.StringType
                nullable = true // The ID is optional (for creating a new bike)
            })
        ) { backStackEntry ->
            val bicycleId = backStackEntry.arguments?.getString(Routes.BICYCLE_ID_ARG)
            BicycleFormScreen(
                viewModel = bicycleViewModel,
                bicycleId = bicycleId,
                onNavigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}