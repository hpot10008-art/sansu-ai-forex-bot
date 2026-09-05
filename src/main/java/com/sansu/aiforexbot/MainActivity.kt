package com.sansu.aiforexbot

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)

        val title = TextView(this)
        title.text = "Sansu AI Forex Bot"
        title.textSize = 28f
        title.setTextColor(Color.BLACK)

        val mode = TextView(this)
        mode.text = "Demo Mode\nXAUUSD\n\nSignal: NO TRADE\nEntry: --\nStop Loss: --\nTake Profit: --\nRisk: 1%"
        mode.textSize = 20f
        mode.gravity = Gravity.CENTER
        mode.setPadding(0, 40, 0, 0)

        layout.addView(title)
        layout.addView(mode)

        setContentView(layout)
    }
}
