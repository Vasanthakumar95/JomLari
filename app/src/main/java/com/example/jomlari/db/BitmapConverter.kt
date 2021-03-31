package com.example.jomlari.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class BitmapConverter {

    @TypeConverter
    fun fromBitmap(bmap: Bitmap): ByteArray
    {
        val outputStream = ByteArrayOutputStream()
        bmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    @TypeConverter
    fun toBitmap(byte: ByteArray): Bitmap
    {
        return BitmapFactory.decodeByteArray(byte, 0, byte.size)
    }

}