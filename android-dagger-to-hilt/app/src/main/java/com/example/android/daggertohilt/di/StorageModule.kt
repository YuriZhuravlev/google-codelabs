package com.example.android.daggertohilt.di

import com.example.android.daggertohilt.storage.SharedPreferencesStorage
import com.example.android.daggertohilt.storage.Storage
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