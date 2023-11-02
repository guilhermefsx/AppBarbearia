package devandroid.ferreira.appbarbearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appbarbearia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Cortes.setOnClickListener {
            val navegarCortes = Intent (this,Cortes2Tela::class.java)
            startActivity(navegarCortes)
        }
    }
}