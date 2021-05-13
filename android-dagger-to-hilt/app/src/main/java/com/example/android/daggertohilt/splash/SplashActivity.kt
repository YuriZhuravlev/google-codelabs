package com.example.android.daggertohilt.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.daggertohilt.MyApplication
import com.example.android.daggertohilt.login.LoginActivity
import com.example.android.daggertohilt.main.MainActivity
import com.example.android.daggertohilt.registration.RegistrationActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {
    @Inject
    lateinit var splashViewModel: SplashViewModel

    /**
     * If the User is not registered, RegistrationActivity will be launched,
     * If the User is not logged in, LoginActivity will be launched,
     * If this User is logged in, MainActivity will be launched.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        with(splashViewModel.userManager) {
            if (!this.isUserLoggedIn()) {
                if (!this.isUserRegistered()) {
                    startActivity(Intent(this@SplashActivity, RegistrationActivity::class.java))
                    finish()
                } else {
                    startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                    finish()
                }
            } else {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
        }

    }
}