package devandroid.ferreira.appbarbearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appbarbearia.databinding.ActivityCortes2TelaBinding
import devandroid.ferreira.appbarbearia.databinding.ActivityMainBinding

class Cortes2Tela : AppCompatActivity() {

    private lateinit var binding: ActivityCortes2TelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityCortes2TelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Voltartela2.setOnClickListener {
            val voltarTela2ParaTela1 = Intent(this,MainActivity:: class.java)
            startActivity(voltarTela2ParaTela1)
        }
    }
}