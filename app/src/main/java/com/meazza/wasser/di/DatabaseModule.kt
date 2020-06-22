package com.meazza.wasser.di

import android.content.Context
import androidx.room.Room
import com.meazza.wasser.data.db.WasserDB
import com.meazza.wasser.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesDbInstance(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            WasserDB::class.java,
            DATABASE_NAME
        ).fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun providesRunDAO(db: WasserDB) = db.getRunDAO()
}