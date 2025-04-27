package com.vimal.loginscreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = "Login Logo",
            modifier = Modifier.size(240.dp, 240.dp)
        )
        Text(
            text = "Welcome",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )
        Text(
            text = "Login to your Account",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {
                Text(text = "Email Address")
            }
        )

        Spacer(
            modifier = Modifier.height(15.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(text = "Password")
            },
            visualTransformation = PasswordVisualTransformation(),
        )

        Spacer(
            modifier = Modifier.height(15.dp)
        )
        Button(
            onClick = {
                Log.i("Credentials", "Email: $email, Password: $password")
            }
        ) {
            Text(text = "Login")
        }

        Spacer(
            modifier = Modifier.height(15.dp)
        )
        Text(
            text = "Forgot Password?",
            modifier = Modifier.clickable {}
        )

        Spacer(
            modifier = Modifier.height(60.dp)
        )
        Text(
            text = "Or Login With"
        )
        Row (
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Login Logo",
                modifier = Modifier
                    .size(45.dp)
                    .clickable {
                        // Logo Clicked
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Login Logo",
                modifier = Modifier
                    .size(45.dp)
                    .clickable {
                        // Logo Clicked
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "Login Logo",
                modifier = Modifier
                    .size(45.dp)
                    .clickable {
                        // Logo Clicked
                    }
            )
        }
    }
}