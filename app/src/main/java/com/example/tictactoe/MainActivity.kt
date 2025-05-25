package com.example.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var volgendeBeurt = Logica.beurt.eenX

    private lateinit var binding: ActivityMainBinding
    private lateinit var logica: Logica
    private var gameOver = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initGame()
    }
    private fun initGame()
    {
        binding.gameStatus.text = ""
        logica = Logica()
    }

    fun resetButtons(view: View)
    {
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
        binding.gameStatus.text = ""
        logica = Logica()
        gameOver = false
    }
    fun btnClick(view: View)
    {
        if (view !is Button || gameOver)
            return

        voegToe(view)
    }
    @SuppressLint("SetTextI18n")
    fun voegToe(button: Button)
    {
        if (button.text.isEmpty()) {
            logica.SetBeurt(volgendeBeurt, button.tag.toString())
            if (logica.heeftSpelerGewonnen(volgendeBeurt)) {
                if (volgendeBeurt == Logica.beurt.eenX) {
                    binding.gameStatus.text = "SpelerX heeft gewonnen!"
                    button.text = "X"
                } else {
                    binding.gameStatus.text = "SpelerO heeft gewonnen!"
                    button.text = "O"
                }
                gameOver = true
                return
            }
            if (volgendeBeurt == Logica.beurt.eenX) {
                button.text = "X"
                volgendeBeurt = Logica.beurt.eenO
            } else {
                button.text = "O"
                volgendeBeurt = Logica.beurt.eenX
            }
        }
    }
}