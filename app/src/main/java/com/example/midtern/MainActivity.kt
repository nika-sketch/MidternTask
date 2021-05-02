package com.example.midtern

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View) {
        val amount = amountEditText.text
        val nameSurname = nameEditText.text
        val lastFourDigit = CardNumberEditText.text
        val cvvCode = CvvCodeEditText.text

        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra(SecondActivity.AMOUNT, amount)
        intent.putExtra(SecondActivity.NAMESURNAME, nameSurname)
        intent.putExtra(SecondActivity.CARDNUMBER, lastFourDigit)
        intent.putExtra(SecondActivity.CVVCODE, cvvCode)

        startActivity(intent)
    }
}