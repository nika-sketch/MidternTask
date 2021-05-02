package com.example.midtern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val NAMESURNAME = "John Doe"
        const val AMOUNT = "300"
        const val CARDNUMBER = "1234567891234567"
        const val CVVCODE = "333"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var namesurname = intent.getStringExtra(NAMESURNAME)
        var amount = intent.getStringExtra(AMOUNT)
        var cardNum = intent.getStringExtra(CARDNUMBER.substring(12, 15))
        var cvvCode = intent.getStringExtra(CVVCODE)

        if (amount.isDigitsOnly() && amount.length == 16) {
            amountId.text = amount
        }
        if (!namesurname.isDigitsOnly()) {
            nameSurnameId.text = namesurname
        }

        lastFourDigitId.text = cardNum

        if (cvvCode.isDigitsOnly() && cvvCode.length == 3) {
            CvvCodeId.text = cvvCode
        }
    }
}