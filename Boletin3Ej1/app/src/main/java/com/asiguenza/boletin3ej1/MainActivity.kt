package com.asiguenza.boletin3ej1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asiguenza.boletin3ej1.databinding.ActivityMainBinding
import com.asiguenza.boletin3ej1.model.Lugar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply{
            setContentView(root)



            recycler.adapter = LugaresAdapater(lugares)
        }
    }

    private val lugares = (1..10).map {
        Lugar(
            "Lugar $it",
            "https://loremflickr.com/240/320/paris?lock=$it")
    }

}