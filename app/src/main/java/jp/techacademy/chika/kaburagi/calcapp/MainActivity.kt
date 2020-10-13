package jp.techacademy.chika.kaburagi.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val num1 = editTextNumberDecimal.text.toString()
        val num2 = editTextNumberDecimal2.text.toString()
        if (num1.isNotEmpty() && num2.isNotEmpty()) {
            val intent = Intent(this, CalResultActivity::class.java)
            val b = v as Button
            val buttonText: String = b.text.toString()
            intent.putExtra("VALUE1", editTextNumberDecimal.text.toString().toDouble())
            intent.putExtra("VALUE2", editTextNumberDecimal2.text.toString().toDouble())
            intent.putExtra("VALUE3", buttonText)
            startActivity(intent)

        } else {
                Snackbar.make(v, "数値を入力してください。", Snackbar.LENGTH_INDEFINITE)
                    .setAction("入力する"){
                    //    Log.d("UI_PARTS", "Snackbarをタップした")
                    }.show()
            }
        }

}