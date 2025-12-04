package com.gorai.PhysicsWallah

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gorai.PhysicsWallah.ui.theme.*

@Composable
fun LoginScreen() {
    var schoolId by remember { mutableStateOf("") }
    var studentId by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(QuizzyBlack)
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .offset(x = (-30).dp, y = 150.dp)
                .clip(CircleShape)
                .background(QuizzyPink.copy(alpha = 0.3f))
        )

        Box(
            modifier = Modifier
                .size(100.dp)
                .offset(x = 50.dp, y = 350.dp)
                .clip(CircleShape)
                .background(QuizzyWhite.copy(alpha = 0.1f))
        )

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(150.dp)
                .offset(x = 50.dp, y = 100.dp)
                .clip(CircleShape)
                .background(QuizzyMint.copy(alpha = 0.2f))
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .size(80.dp)
                .offset(x = (-20).dp, y = 20.dp)
                .clip(CircleShape)
                .background(QuizzyYellow.copy(alpha = 0.2f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(80.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(QuizzyPink)
                )

                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(QuizzyLightBlue)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(QuizzyMint)
            )

            Spacer(modifier = Modifier.height(48.dp))

            Text(
                text = "Welcome to\nQuizzy!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = QuizzyWhite,
                textAlign = TextAlign.Center,
                lineHeight = 40.sp
            )

            Spacer(modifier = Modifier.weight(1f))

            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(
                    topStart = 24.dp,
                    topEnd = 24.dp,
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                ),
                colors = CardDefaults.cardColors(containerColor = QuizzyWhite)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Let's Get you Signed in",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    OutlinedTextField(
                        value = schoolId,
                        onValueChange = { schoolId = it },
                        placeholder = { Text("School ID") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = QuizzyInputBg,
                            focusedContainerColor = QuizzyInputBg,
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Gray
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    OutlinedTextField(
                        value = studentId,
                        onValueChange = { studentId = it },
                        placeholder = { Text("Student ID") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedContainerColor = QuizzyInputBg,
                            focusedContainerColor = QuizzyInputBg,
                            unfocusedBorderColor = Color.Transparent,
                            focusedBorderColor = Color.Gray
                        )
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        shape = RoundedCornerShape(
                            topStart = 12.dp,
                            topEnd = 12.dp,
                            bottomStart = 28.dp,
                            bottomEnd = 28.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = QuizzyBlack
                        )
                    ) {
                        Text(
                            text = "Sign in",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    PhysicsWallahTheme {
        LoginScreen()
    }
}