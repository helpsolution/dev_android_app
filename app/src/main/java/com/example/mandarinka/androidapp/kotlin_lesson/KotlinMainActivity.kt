package com.example.mandarinka.androidapp.kotlin_lesson

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import com.example.mandarinka.androidapp.R
import kotlinx.android.synthetic.main.activity_kotlin_lesson.*

class KotlinMainActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MESSAGE: String = "EXTRA_MESSAGE_VALUE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin_lesson)
    }

    fun sendMessage(view: View) {
        // Создаем объект Intent для вызова новой Activity
        val intent = Intent(this, DisplayMessageActivity::class.java)

        // Получаем текстовое поле в текущей Activity
        val editText: EditText = this.edit_message
        val message: String = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)

        //запуск activity
        startActivity(intent)
    }
}