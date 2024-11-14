package com.example.mylogin

import android.media.Image
import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
public fun loginScreen() {

    var email by remember {
        mutableStateOf("")

    }

    var password  by remember {
        mutableStateOf("")

    }

    Column(
        Modifier.fillMaxSize().padding(100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        );
        Text(text = "Welcome back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Eamil address")

        })

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential","Email : $email Password : $password")
        }) {
            Text(text = "Login")

        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Forget Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "or sign in with")

        Spacer(modifier = Modifier.height(16.dp))

        Row (
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebok), // Ensure "facebook" is a valid drawable resource
                contentDescription = "Facebook Icon",
                modifier = Modifier.size(60.dp).clickable {
                    //Facebook cliked
                }
            )

            Image(
                painter = painterResource(id = R.drawable.google), // Ensure "facebook" is a valid drawable resource
                contentDescription = "Google Icon",
                modifier = Modifier.size(60.dp).clickable {
                    //google cliked
                }
            )

            Image(
                painter = painterResource(id = R.drawable.twitter), // Ensure "facebook" is a valid drawable resource
                contentDescription = "twitter Icon",
                modifier = Modifier.size(60.dp).clickable {
                    //twitter cliked
                }
            )
        }



    }





}



