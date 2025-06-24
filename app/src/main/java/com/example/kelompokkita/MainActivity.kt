package com.example.kelompokkita

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatDelegate // penting buat matiin dark mode
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kelompokkita.ui.theme.KelompokKitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ini supaya tampilan aplikasi selalu light mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        enableEdgeToEdge()
        setContent {
            KelompokKitaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        onBiodataClick = {
                            startActivity(Intent(this, BiodataActivity::class.java))
                        },
                        onRiwayatClick = {
                            startActivity(Intent(this, RiwayatPendidikanActivity::class.java))
                        },
                        onAktivitasClick = {
                            startActivity(Intent(this, AktivitasSehariHariActivity::class.java))
                        },
                        onBiodatafilzahClick = {
                            startActivity(Intent(this, BiodatafilzahActivity::class.java))
                        },
                        onRiwayatPendidikanFilzahClick = {
                            startActivity(Intent(this, RiwayatPendidikanFilzahActivity::class.java))
                        },
                        onAktivitasSehariHariFilzahClick = {
                            startActivity(Intent(this, AktivitasSehariHariFilzahActivity::class.java))
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    onBiodataClick: () -> Unit,
    onRiwayatClick: () -> Unit,
    onAktivitasClick: () -> Unit,
    onBiodatafilzahClick: () -> Unit,
    onRiwayatPendidikanFilzahClick: () -> Unit,
    onAktivitasSehariHariFilzahClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF5E1)) // background cream
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "halo!",
                fontSize = 24.sp,
                color = Color(0xFF4A4A4A)
            )
            Spacer(modifier = Modifier.height(24.dp))

            Button(onClick = onBiodataClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC1CC))) {
                Text(text = "Biodata Mutia")
            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = onRiwayatClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB5EAD7))) {
                Text(text = "Riwayat Pendidikan Mutia")
            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = onAktivitasClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD8B1))) {
                Text(text = "Aktivitas Sehari-hari Mutia")
            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = onBiodatafilzahClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC1CC))) {
                Text(text = "Biodata Filzah")
            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = onRiwayatPendidikanFilzahClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB5EAD7))) {
                Text(text = "Riwayat Pendidikan Filzah")
            }
            Spacer(modifier = Modifier.height(12.dp))

            Button(onClick = onAktivitasSehariHariFilzahClick, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD8B1))) {
                Text(text = "Aktivitas Sehari-hari Filzah")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    KelompokKitaTheme {
        MainScreen(
            onBiodataClick = {},
            onRiwayatClick = {},
            onAktivitasClick = {},
            onBiodatafilzahClick = {},
            onRiwayatPendidikanFilzahClick = {},
            onAktivitasSehariHariFilzahClick = {}
        )
    }
}
