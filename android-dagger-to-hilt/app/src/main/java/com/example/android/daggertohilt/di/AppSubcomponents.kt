package com.example.android.daggertohilt.di

import com.example.android.daggertohilt.login.LoginComponent
import com.example.android.daggertohilt.registration.RegistrationComponent
import com.example.android.daggertohilt.user.UserComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class])
class AppSubcomponents