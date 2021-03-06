package com.example.cmpe277

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ParkListAdapter: RecyclerView.Adapter<ParkListAdapter.ViewHolder>(){
    private val parklists = arrayOf("#1 - Death Valley National Park","#2 - Yosemite National Park","#3 - Sequoia and Kings Canyon National Park",
            "#4 - Redwood National and State Park","#5 - Joshua Tree National Park","#6 - Lassen Volcanic National Park",
           "#7 - Pinnacles National Park", "#8 - Point Reyes National Seashore")

    private val reviewlist = arrayOf("4.9/5","4.8/5", "4.8/5","4.8/5","4.8/5","4.7/5","4.7/5","4.5/5")

    private val imageslist= intArrayOf(R.drawable.deathvalley, R.drawable.yosemite,R.drawable.sequoia,R.drawable.redwood,
            R.drawable.joshua,R.drawable.lassen, R.drawable.pinnacles, R.drawable.point_reyes )


    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var review: TextView

        init {
            image = itemView.findViewById(R.id.park_image)
            title = itemView.findViewById(R.id.parkname)
            review = itemView.findViewById(R.id.park_review)
        }
    }

    //    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//      holder.title.text= parklists[position]
//        holder.review.text=  reviewlist[position]
//        holder.image.setImageResource(imageslist[position])
//       // holder.itemView.setOnClickListener { v: View ->  }
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val oneview: View = LayoutInflater.from(parent.context).inflate(R.layout.parkcardview ,parent,false)
        return ViewHolder(oneview)
    }

    override fun getItemCount(): Int {
        return parklists.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text= parklists[position]
        holder.review.text=  reviewlist[position]
        holder.image.setImageResource(imageslist[position])
    }


}