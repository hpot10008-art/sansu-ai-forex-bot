package com.sansu.aiforexbot

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Sansu AI Forex Bot\n\nDemo Mode\nXAUUSD\n\nSignal: NO TRADE"
        text.textSize = 24f
        text.setPadding(40, 80, 40, 40)

        setContentView(text)
    }
}
