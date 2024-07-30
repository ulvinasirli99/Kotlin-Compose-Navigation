package dev.tool.jetpacknavigationcomponent.navigation

sealed class Screens(val route: String) {
    data object LoginScreenRoute : Screens(route = "LoginScreen")
    data object RegisterScreenRoute : Screens(route = "RegisterScreen")
    data object ForgotScreenRoute : Screens(route = "ForgotScreen")
    data object HomeScreenRoute : Screens(route = "HomeScreen")
    data object DetailScreenRoute : Screens(route = "DetailScreen")
    data object SecondScreenRoute : Screens(route = "SecondScreen")
    data object ThirdScreenRoute : Screens(route = "ThirdScreen")
    data object AuthRoute : Screens(route = "Auth")
    data object AppRoute : Screens(route = "App")
}