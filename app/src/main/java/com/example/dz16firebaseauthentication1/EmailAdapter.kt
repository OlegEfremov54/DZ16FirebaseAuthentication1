package com.example.dz16firebaseauthentication1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val context: Context) : RecyclerView.Adapter<EmailAdapter.NoteViewHolder>(){

    val emails = mutableListOf<Email>()

    fun updateList(newList: List<Email>) {
        emails.clear()
        emails.addAll(newList)
        notifyDataSetChanged()
    }

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTV : TextView = itemView.findViewById(R.id.title_tv)
        private val contentTV: TextView = itemView.findViewById(R.id.content_tv)

        fun bind(email: Email) {
            titleTV.text = email.title
            contentTV.text = email.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val viewHolder = NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.item_email, parent, false))
        return viewHolder
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val currentEmail = emails[position]
        holder.bind(currentEmail)
    }

    override fun getItemCount(): Int {
        return emails.size
    }
}