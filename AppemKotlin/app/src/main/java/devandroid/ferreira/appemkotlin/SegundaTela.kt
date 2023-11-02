package devandroid.ferreira.appemkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appemkotlin.databinding.ActivityMainBinding
import devandroid.ferreira.appemkotlin.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltarTela1.setOnClickListener {
            val voltarTelaPrincipal = Intent (this,MainActivity::class.java)
            startActivity(voltarTelaPrincipal)
        }
    }
}