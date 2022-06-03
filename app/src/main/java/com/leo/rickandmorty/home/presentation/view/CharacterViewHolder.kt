package com.leo.rickandmorty.home.presentation.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.leo.rickandmorty.R

class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val characterImage: ImageView by lazy { itemView.findViewById(R.id.imageCharacter) }
    val characterName: TextView by lazy { itemView.findViewById(R.id.name) }
    val characterOrigin: TextView by lazy { itemView.findViewById(R.id.origin) }
    val characterEpisode: TextView by lazy { itemView.findViewById(R.id.status) }
}