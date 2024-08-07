package com.singularitycoder.playbooks

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.singularitycoder.playbooks.databinding.ListItemDownloadBinding
import com.singularitycoder.playbooks.helpers.DUMMY_IMAGE_URLS
import com.singularitycoder.playbooks.helpers.deviceHeight
import com.singularitycoder.playbooks.helpers.deviceWidth
import com.singularitycoder.playbooks.helpers.onCustomLongClick
import com.singularitycoder.playbooks.helpers.onSafeClick
import com.singularitycoder.playbooks.helpers.toLowCase

class DownloadsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var downloadsList = emptyList<Book?>()
    private var itemClickListener: (book: Book?, position: Int) -> Unit = { _, _ -> }
    private var itemLongClickListener: (book: Book?, view: View?, position: Int?) -> Unit = { _, _, _ -> }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemBinding = ListItemDownloadBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ThisViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ThisViewHolder).setData(downloadsList[position])
    }

    override fun getItemCount(): Int = downloadsList.size

    override fun getItemViewType(position: Int): Int = position

    fun setOnItemClickListener(listener: (book: Book?, position: Int) -> Unit) {
        itemClickListener = listener
    }

    fun setOnItemLongClickListener(
        listener: (
            book: Book?,
            view: View?,
            position: Int?
        ) -> Unit
    ) {
        itemLongClickListener = listener
    }

    inner class ThisViewHolder(
        private val itemBinding: ListItemDownloadBinding,
    ) : RecyclerView.ViewHolder(itemBinding.root) {
        @SuppressLint("SetJavaScriptEnabled")
        fun setData(book: Book?) {
            itemBinding.apply {
                cardImage.layoutParams.height = deviceHeight() / 6
                cardImage.layoutParams.width = deviceWidth() / 4

                ivItemImage.load(DUMMY_IMAGE_URLS.first())

                tvSource.text = book?.size
                tvTitle.text = book?.title

                val fileExtension = book?.extension?.toLowCase()?.trim()

                root.onSafeClick {
                    itemClickListener.invoke(book, bindingAdapterPosition)
                }
                root.onCustomLongClick {
                    itemLongClickListener.invoke(book, it, bindingAdapterPosition)
                }
            }
        }
    }
}
