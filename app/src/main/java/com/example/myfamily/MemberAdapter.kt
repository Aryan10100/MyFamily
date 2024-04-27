package com.example.myfamily

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MemberAdapter(private val listMember: List<MemberModel>) :RecyclerView.Adapter<MemberAdapter.ViewHolder>(){
    class ViewHolder(val item: View):RecyclerView.ViewHolder(item) {                                  //To hold the item which are changing we use view holder to hold the view
                                                                                                     //within it we are going to declare the all type views which are g
        val Userimage =item.findViewById<ImageView>(R.id.contactView)
        val call  = item.findViewById<ImageView>(R.id.ivcall)
        val locationPin =item.findViewById<ImageView>(R.id.locationicon)
        val Battery =item.findViewById<ImageView>(R.id.ivBattery)
        val Distance =item.findViewById<ImageView>(R.id.ivdistanceo)
        val signal = item.findViewById<ImageView>(R.id.ivwifi)
        //TextViews
        val Name =item.findViewById<TextView>(R.id.tvName)
        val location = item.findViewById<TextView>(R.id.locationTV)
        val batterypercent=item.findViewById<TextView>(R.id.tvBattery)
        val Distancetv=item.findViewById<TextView>(R.id.tvdistance)
        val signaltv=item.findViewById<TextView>(R.id.tvwifi)
    }
    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {
        val inflater =LayoutInflater.from(parent.context)                                            //create a layout Inflater
        val item = inflater.inflate(R.layout.item_member,parent,false)                   //inflate the layout val item = inflater.inflate(give_id_of_where_we_have_created_View,parent,false)
        return ViewHolder(item)                                                                      //returning ViewHolder
    }

    override fun onBindViewHolder(holder: MemberAdapter.ViewHolder, position: Int) {
        val item =listMember[position]                                                               //this set the data
        holder.Name.text=item.name
        holder.location.text=item.location                                                          //using this we get the data
        holder.Distancetv.text=item.distance                                                         //holder.Distancetv.text=item.distance
        holder.batterypercent.text=item.batterypercentage                                            //           |                   |
                                                                                                 //{ as declared in View Holder}        {as declared in MemberModular.kt}
         holder.signaltv.text=item.signal


    }

    override fun getItemCount(): Int {
         return listMember.size                                                                      //return  the size of listMember
    }
}