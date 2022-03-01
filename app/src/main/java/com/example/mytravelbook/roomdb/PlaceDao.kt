package com.example.mytravelbook.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mytravelbook.model.Place

@Dao
interface PlaceDao {
    @Query(value = "SELECT * FROM Place")
    fun getAll(): List<Place>

    @Insert
    fun insert(place: Place)

    @Delete
    fun delete(place: Place)

}