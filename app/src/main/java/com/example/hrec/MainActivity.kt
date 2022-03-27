package com.example.hrec

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.hrec.presentation.SetupNavGraph
import com.example.hrec.presentation.forgotPassword.ForgotPassword
import com.example.hrec.presentation.forgotPassword.ForgotPasswordNew
import com.example.hrec.presentation.profile.Profile
import com.example.hrec.presentation.signIn.SignIn

import com.example.hrec.presentation.ui.theme.HRecTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HRecTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = stringResource(id = R.string.tv_emailCheck, "lol"), style = MaterialTheme.typography.h1)
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    HRecTheme {
//        Greeting("Android")
//    }
//}
