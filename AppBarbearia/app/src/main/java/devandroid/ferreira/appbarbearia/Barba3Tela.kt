package devandroid.ferreira.appbarbearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appbarbearia.databinding.ActivityBarba3TelaBinding

class Barba3Tela : AppCompatActivity() {

    private lateinit var binding: ActivityBarba3TelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarba3TelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.VoltarTela3.setOnClickListener {
            val voltartela3paratela1 = Intent (this,MainActivity::class.java)
            startActivity(voltartela3paratela1) }
    }
}