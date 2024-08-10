package com.singularitycoder.playbooks.helpers.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.singularitycoder.playbooks.Book
import com.singularitycoder.playbooks.BookDao
import com.singularitycoder.playbooks.BookData
import com.singularitycoder.playbooks.BookDataDao

@Database(
    entities = [
        Book::class,
        BookData::class,
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    StringListConverter::class,
    IntListConverter::class
)
abstract class PlayBookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
    abstract fun bookDataDao(): BookDataDao
}

