package dev.tool.jetpacknavigationcomponent.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.ForgetPassScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.LoginScreen
import dev.tool.jetpacknavigationcomponent.screens.navigation.nested.RegisterScreen

fun NavGraphBuilder.authGraph(navCtr: NavController){
    navigation(
        startDestination = Screens.LoginScreenRoute.route,
        route = Screens.AuthRoute.route
    ) {
        composable(route = Screens.LoginScreenRoute.route) {
            LoginScreen(navCtr)
        }
        composable(route = Screens.RegisterScreenRoute.route) {
            RegisterScreen(navCtr)
        }
        composable(route = Screens.ForgotScreenRoute.route) {
            ForgetPassScreen(navCtr)
        }
    }
}