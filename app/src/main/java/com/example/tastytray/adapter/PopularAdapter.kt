package com.example.tastytray.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tastytray.databinding.PopularItemsBinding

class PopularAdapter(
    private val items: List<String>,
    private val price: List<String>,
    private val description: List<String>,
    private val image: List<Int>
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(
            PopularItemsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val price = price[position]
        val desc = description[position]
        val images = image[position]

        holder.bind(item,price,desc,images)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHolder(private val binding: PopularItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val imagesView = binding.FoodImage
        fun bind(item: String, price: String, desc: String, images: Int) {
            binding.foodName.text = item
            binding.foodPrice.text = price
            binding.foodDescription.text = desc
            imagesView.setImageResource((images))
        }

    }


}