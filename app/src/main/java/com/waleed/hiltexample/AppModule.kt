package com.waleed.hiltexample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {



    @Provides
    @Singleton
//    @ViewModelScoped
    @Named("NameWithContext")
    fun getStringNameWithContext(@ApplicationContext context: Context): String {
        return ( context.getString(R.string.app_name) )
    }

    @Provides
    @Singleton
    fun getStringName(): String {
        return "String Name"
    }

    @Provides
    @Singleton
    @Named("SecondName")
    fun getStringSecondName(): String {
        return "String Name"
    }

}