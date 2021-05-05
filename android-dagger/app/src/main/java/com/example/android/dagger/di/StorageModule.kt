package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
//    @Provides
//    fun provideStorage(context: Context): Storage {
//        return SharedPreferencesStorage(context)
//    }
@Binds
abstract fun provideStorage(storage: SharedPreferencesStorage): Storage
}