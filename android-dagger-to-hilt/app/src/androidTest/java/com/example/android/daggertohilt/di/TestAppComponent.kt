package com.example.android.daggertohilt.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubcomponents::class])
interface TestAppComponent : AppComponent