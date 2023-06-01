package com.jordev.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jordev.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)

    }
    override fun onClick(view: View) {
        if (view.id == R.id.button_calculate){
            calculate()
        }
    }

    private fun calculate(){

        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        val totalvalue = (distance * price) / autonomy
        //Formatar para o numero ficar com 2 casas decimais

        binding.textTotalValue.text  = "R$ ${"%.2f".format(totalvalue) }"

        // Toast notification
        //Toast.makeText(this, totalvalueStr, Toast.LENGTH_SHORT).show()
    }

}
