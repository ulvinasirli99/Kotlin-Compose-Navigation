package dev.tool.jetpacknavigationcomponent.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import dev.tool.jetpacknavigationcomponent.screens.navigation.argument.DetailScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.argument.HomeScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.routing.SecondScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.routing.ThirdScreen

fun NavGraphBuilder.appGraph(navCtr: NavController) {
    navigation(
        startDestination = Screens.HomeScreenRoute.route,
        route = Screens.AppRoute.route
    ) {
        composable(route = Screens.HomeScreenRoute.route) {
            HomeScreen(navCtr)
        }
        composable(
            route = "${Screens.DetailScreenRoute.route}?name={name}&surName={surName}&age={age}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                    nullable = true
                },
                navArgument(name = "surName") {
                    type = NavType.StringType
                    nullable = true
                },
                navArgument(name = "age") {
                    type = NavType.IntType
                    defaultValue = 0
                },
            )
        ) { backStackEntry ->
            DetailScreen(
                name = backStackEntry.arguments?.getString("name"),
                surName = backStackEntry.arguments?.getString("surName"),
                age = backStackEntry.arguments?.getInt("age")
            )
        }
        composable(route = Screens.SecondScreenRoute.route) {
            SecondScreen(navCtr)
        }
        composable(route = Screens.ThirdScreenRoute.route) {
            ThirdScreen(navCtr)
        }
    }
}
