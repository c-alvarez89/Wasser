package com.meazza.wasser.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.meazza.wasser.data.db.dao.RunDAO
import com.meazza.wasser.data.db.entity.Run
import com.meazza.wasser.util.Constants.DATABASE_VERSION

@Database(
    entities = [Run::class],
    version = DATABASE_VERSION
)
@TypeConverters(Converters::class)
abstract class WasserDB : RoomDatabase() {

    abstract fun getRunDAO(): RunDAO
}