package devandroid.ferreira.appemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appemkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.irTela2.setOnClickListener {
           val navegarSegundaTela = Intent ( this,SegundaTela::class.java)
            startActivity(navegarSegundaTela)
        }
    }
}