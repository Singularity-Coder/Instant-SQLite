package com.singularitycoder.playbooks.helpers

import com.singularitycoder.playbooks.BuildConfig
import com.singularitycoder.playbooks.MainFragment
import com.singularitycoder.playbooks.R

const val FILE_PROVIDER = "${BuildConfig.APPLICATION_ID}.fileprovider"

val globalLayoutAnimation = R.anim.layout_animation_fall_down
val globalSlideToBottomAnimation = R.anim.layout_animation_fall_down
val globalSlideToTopAnimation = R.anim.layout_animation_slide_from_bottom

object TtsConstants {
    const val MAX = 16
    const val MIN = 1
    const val DEFAULT = 5
}

object FragmentResultKey {
}

object FragmentResultBundleKey {
}

enum class NotificationAction {
    PREVIOUS_SENTENCE,
    NEXT_SENTENCE,
    PLAY_PAUSE,
    PREVIOUS_PAGE,
    NEXT_PAGE
}

object IntentKey {
    const val NOTIF_BTN_CLICK_BROADCAST = "NOTIF_BTN_CLICK_BROADCAST"
    const val NOTIF_BTN_CLICK_BROADCAST_2 = "NOTIF_BTN_CLICK_BROADCAST_2"
    const val MAIN_BROADCAST_FROM_SERVICE = "MAIN_BROADCAST_FROM_SERVICE"
}

object IntentExtraKey {
    const val MESSAGE = "MESSAGE"
    const val NOTIF_BTN_CLICK_TYPE = "NOTIF_BTN_CLICK_TYPE"
    const val NOTIF_BTN_CLICK_TYPE_2 = "NOTIF_BTN_CLICK_TYPE_2"
    const val BOOK_ID = "BOOK_ID"
    const val TTS_WORD_HIGHLIGHT_START = "TTS_WORD_HIGHLIGHT_START"
    const val TTS_WORD_HIGHLIGHT_END = "TTS_WORD_HIGHLIGHT_END"
    const val TTS_WORD_HIGHLIGHT_UTTERANCE_ID = "TTS_WORD_HIGHLIGHT_UTTERANCE_ID"
}

object IntentExtraValue {
    const val UNBIND = "UNBIND"
    const val FOREGROUND_SERVICE_READY = "UPDATE_PROGRESS"
    const val READING_COMPLETE = "READING_COMPLETE"
    const val TTS_READY = "TTS_READY"
    const val SERVICE_DESTROYED = "SERVICE_DESTROYED"
    const val TTS_PAUSED = "TTS_PAUSED"
    const val TTS_PLAYING = "TTS_PLAYING"
    const val TTS_WORD_HIGHLIGHT = "TTS_WORD_HIGHLIGHT"
//    const val NEXT_SENTENCE = "NEXT_SENTENCE"
//    const val PREVIOUS_SENTENCE = "PREVIOUS_SENTENCE"
//    const val NEXT_PAGE = "NEXT_PAGE"
//    const val PREVIOUS_PAGE = "PREVIOUS_PAGE"
}

object Db {
    const val PLAY_BOOKS = "db_play_books"
}

object DbTable {
    const val BOOK = "table_book"
    const val BOOK_DATA = "table_book_data"
}

object BroadcastKey {
}

object FragmentsTag {
    val MAIN: String = MainFragment::class.java.simpleName
}

object TtsTag {
    const val UID_SPEAK: String = "UID_SPEAK"
}

object BottomSheetTag {
}

object WorkerData {
    const val PDF_PATH = "WORKER_DATA_RSS_URL"
    const val KEY_PROGRESS = "KEY_PROGRESS"
}

object WorkerTag {
    const val PDF_TO_TEXT_CONVERTER = "PDF_TO_TEXT_CONVERTER"
}

enum class MimeType(val value: String) {
    EPUB(value = "application/epub+zip"),
    PDF(value = "application/pdf"),
    TEXT(value = "text/plain"),
    ANY(value = "*/*"),
    FONT(value = "application/x-font-ttf")
}