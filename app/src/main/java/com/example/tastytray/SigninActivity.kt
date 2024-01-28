package com.example.tastytray

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tastytray.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {

     private  val binding:ActivitySigninBinding by lazy {
         ActivitySigninBinding.inflate(layoutInflater)
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alreadyHaveAccountBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }



    }

}