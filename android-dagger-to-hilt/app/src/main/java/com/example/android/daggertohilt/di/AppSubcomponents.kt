package com.example.android.daggertohilt.di

import com.example.android.daggertohilt.user.UserComponent
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module(subcomponents = [UserComponent::class])
class AppSubcomponents