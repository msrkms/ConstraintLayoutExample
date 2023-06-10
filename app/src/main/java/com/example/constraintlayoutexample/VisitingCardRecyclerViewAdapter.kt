package com.example.constraintlayoutexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.constraintlayoutexample.databinding.VisitingCardItemBinding

class VisitingCardRecyclerViewAdapter(private  val  personList:List<Person>) : RecyclerView.Adapter<VisitingCardRecyclerViewAdapter.VisitingCardViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VisitingCardViewHolder {
        val binding = VisitingCardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VisitingCardViewHolder(binding)

    }

    override fun onBindViewHolder(
        holder: VisitingCardViewHolder,
        position: Int
    ) {
        val person=personList[position]
        holder.bind(person)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    class VisitingCardViewHolder(private val binding: VisitingCardItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(person: Person){
            binding.apply {
                binding.person=person
            }
        }
    }


}