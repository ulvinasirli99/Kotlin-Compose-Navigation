package dev.tool.jetpacknavigationcomponent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.tool.jetpacknavigationcomponent.screens.navigation.argument.DetailScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.argument.HomeScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.ForgetPassScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.LoginScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.RegisterScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.routing.SecondScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.routing.ThirdScreen

@Composable
fun NavGraph() {
    val navCtr = rememberNavController()

    NavHost(navController = navCtr, startDestination = Screens.AuthRoute.route) {

        authGraph(navCtr)

        appGraph(navCtr)

    }
}