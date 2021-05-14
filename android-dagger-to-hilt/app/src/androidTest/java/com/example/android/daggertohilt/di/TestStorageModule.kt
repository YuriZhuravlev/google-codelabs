package com.example.android.daggertohilt.di

import com.example.android.daggertohilt.storage.FakeStorage
import com.example.android.daggertohilt.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class TestStorageModule {
    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}