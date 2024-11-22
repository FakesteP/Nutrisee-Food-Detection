package com.capstone.nutrisee.login

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.capstone.nutrisee.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spannableText = SpannableString("Don't have an account? Sign Up")
        val signUpClick = object : ClickableSpan() {
            override fun onClick(widget: View) {
                startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            }
        }

        spannableText.setSpan(signUpClick, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvAlreadyHaveAccount.text = spannableText
        binding.tvAlreadyHaveAccount.movementMethod = LinkMovementMethod.getInstance()
    }
}
