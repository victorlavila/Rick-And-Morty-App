package com.leo.rickandmorty.home.presentation.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.leo.rickandmorty.R
import com.leo.rickandmorty.home.data.model.Result
import com.leo.rickandmorty.home.presentation.entity.ResultsToUi
import com.squareup.picasso.Picasso

class HomeAdapter(
    private val context: Context,
    private val resultInfo: List<ResultsToUi>
) : RecyclerView.Adapter<CharacterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.character_item,
            parent,
            false
        )
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val currentList = resultInfo.elementAt(position)
        Picasso.get().load(currentList.image).into(holder.characterImage)
        holder.characterName.text = currentList.name
        holder.characterOrigin.text = currentList.location.name
        holder.characterEpisode.text = currentList.status
    }

    override fun getItemCount() = resultInfo.size
}