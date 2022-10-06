package com.example.hw38

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw38.databinding.ItemCarBinding

class CarsAdapter(
    val carList: ArrayList<Car>,
    val onclick: (position: Int) -> Unit
): RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        return CarsViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = carList.size
    inner class CarsViewHolder(private val binding: ItemCarBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val item = carList[adapterPosition]
            binding.tvName.text = item.name
            binding.ivCar.loadImage(item.image)

            itemView.setOnClickListener {
                onclick(adapterPosition)
            }
        }
    }
}