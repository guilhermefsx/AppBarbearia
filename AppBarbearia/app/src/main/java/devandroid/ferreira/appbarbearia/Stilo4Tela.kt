package devandroid.ferreira.appbarbearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appbarbearia.databinding.ActivityStilo4TelaBinding

class Stilo4Tela : AppCompatActivity() {

    private lateinit var binding: ActivityStilo4TelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStilo4TelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltartela4.setOnClickListener {
            val voltartela4paratela1 = Intent (this,MainActivity::class.java)
            startActivity(voltartela4paratela1)
        }
    }
}