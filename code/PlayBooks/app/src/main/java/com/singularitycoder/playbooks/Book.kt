package com.singularitycoder.playbooks

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.singularitycoder.playbooks.helpers.DbTable
import kotlinx.parcelize.Parcelize

@Entity(tableName = DbTable.BOOK)
@Parcelize
data class Book(
    @PrimaryKey var id: String,
    var path: String? = "",
    var title: String = "",
    var time: Long? = 0L,
    var size: String? = "",
    var link: String? = "",
    var extension: String? = "",
    var isDirectory: Boolean = false,
    var pageCount: Int = 0,
    var completedPageNum: Int = 0
) : Parcelable