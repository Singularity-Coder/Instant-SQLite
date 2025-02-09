package com.singularitycoder.playbooks.helpers

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

object PlayBookUtils {
    val gson: Gson = GsonBuilder().setLenient().create()
}

fun File.getBookId(): String = (this.nameWithoutExtension + "_" + this.extension).sanitize()
