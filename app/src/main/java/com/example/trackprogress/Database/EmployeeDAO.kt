package com.example.trackprogress.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface EmployeeDAO {
    @Insert
    suspend fun insert(employee: Employee)

    @Update
    suspend fun update(employee: Employee)

    @Delete
    suspend fun delete(employee: Employee)

    @Query("SELECT * FROM employee")
    suspend fun getEmployee(): Employee?
    @Query("SELECT * FROM employee WHERE userId= :empID")
    suspend fun getEmployeeByID(empID: Long): Employee?
}