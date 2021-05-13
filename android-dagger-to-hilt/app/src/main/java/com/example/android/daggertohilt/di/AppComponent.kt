package com.example.android.daggertohilt.di

import android.content.Context
import com.example.android.daggertohilt.login.LoginComponent
import com.example.android.daggertohilt.registration.RegistrationComponent
import com.example.android.daggertohilt.splash.SplashActivity
import com.example.android.daggertohilt.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun userManager(): UserManager

    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
    fun inject(activity: SplashActivity)
}