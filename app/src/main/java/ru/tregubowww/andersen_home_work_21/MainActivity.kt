package ru.tregubowww.andersen_home_work_21

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var showCount: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View?) {
        val toast: Toast = Toast.makeText(
            this, R.string.hello_toast,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    fun countUp(view: View?) {
        count++
        showCount.text = count.toString()
    }
}