package com.vimal.loginscreen

import android.widget.Toast
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
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
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Email Address")
            }
        )

        Spacer(
            modifier = Modifier.height(15.dp)
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Password")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )
        Button(
            onClick = {
                val applicationContext = null
                Toast.makeText(applicationContext, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "Login")
        }

        Spacer(
            modifier = Modifier.height(12.dp)
        )
        Text(
            text = "Forgot Password?",
            modifier = Modifier.clickable {}
        )

        Spacer(
            modifier = Modifier.height(50.dp)
        )
        Text(
            text = "Or Login With"
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Login Logo",
                modifier = Modifier.size(20.dp, 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Login Logo",
                modifier = Modifier.size(20.dp, 20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.x),
                contentDescription = "Login Logo",
                modifier = Modifier.size(20.dp, 20.dp)
            )
        }



    }
}