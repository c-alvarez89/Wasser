package com.meazza.wasser.data.db.entity

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.meazza.wasser.util.Constants.TABLE_NAME_RUNNING

@Entity(tableName = TABLE_NAME_RUNNING)
data class Run(
    @ColumnInfo(name = "image")
    var image: Bitmap? = null,

    @ColumnInfo(name = "time_stamp")
    var timestamp: Long = 0L,

    @ColumnInfo(name = "average_speed_in_kmh")
    var averageSpeedInKmH: Float = 0f,

    @ColumnInfo(name = "distance_in_meters")
    var distanceInMeters: Float = 0f,

    @ColumnInfo(name = "time_in_millis")
    val timeInMillis: Long = 0L,

    @ColumnInfo(name = "calories_burned")
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}