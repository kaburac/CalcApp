package jp.techacademy.chika.kaburagi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calresult.*
import kotlinx.android.synthetic.main.activity_main.*

class CalResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calresult)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val value3 = intent.getStringExtra("VALUE3")
        var result: Double

        result = when (value3) {
            "+" -> value1 + value2
            "-" -> value1 - value2
            "*" -> value1 * value2
            else -> value1 / value2
        }

        // 画面表示
        textView3.text = "$value1$value3$value2=$result"
    }
}