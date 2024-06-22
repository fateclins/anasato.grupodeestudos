package com.example.grupodeestudosapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val cardItems: List<CardItem>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = cardItems[position]

        holder.textTitle.text = currentItem.title
        holder.textDate.text = "Data: ${currentItem.date}"
        holder.textTime.text = "Horário: ${currentItem.time}"

        holder.buttonAction.setOnClickListener {
            // Ação do botão
        }
    }

    override fun getItemCount(): Int {
        return cardItems.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
        val textDate: TextView = itemView.findViewById(R.id.textDate)
        val textTime: TextView = itemView.findViewById(R.id.textTime)
        val buttonAction: Button = itemView.findViewById(R.id.buttonAction)
    }
}
