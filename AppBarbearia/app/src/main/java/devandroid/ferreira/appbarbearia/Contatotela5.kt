package devandroid.ferreira.appbarbearia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import devandroid.ferreira.appbarbearia.databinding.ActivityContatotela5Binding

class Contatotela5 : AppCompatActivity() {

    private lateinit var binding: ActivityContatotela5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatotela5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltartela5.setOnClickListener {
            val voltarTela5paratela1 = Intent (this, MainActivity::class.java)
            startActivity(voltarTela5paratela1)
        }
    }
}