package com.example.myfamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeScreenFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {       //view is created successfully
        super.onViewCreated(view, savedInstanceState)
    //we have created a dataclass(MemberModel) file which is used to hold the datamenmber of the following code

     val listMember = listOf<MemberModel>(
         MemberModel("Aryan","Hno. 217 A SBI Bank Road ,Kichha,Uttrakhand","22km","40%","Wifi"),
         MemberModel("Priya","Rudrpur,UttraKhand","12km","70%","4G"),
         MemberModel("Sameer","Kichha,UttraKhand","100Km","90%","WIFI"),
         MemberModel("Rajesh","Haldwani","100Km","90%","WIFI"),
         MemberModel("Vaani","Delhi","100Km","90%","WIFI"),
         MemberModel("John Doe"," 1234 Oak Lane, Springfield, IL 62704","10Km","93%","4G"),
         MemberModel("Jane Smith","5678 Pine Street, Madison, WI 53704","1000Km","19%","WIFI"),
         MemberModel("Emily Davis","8765 Birch Boulevard, Denver, CO 80204","20Km","20%","WIFI"),
         MemberModel("William Brown","William Brown","120Km","90%","WIFI"),
         MemberModel("Olivia Wilson","5432 Elm Road, Nashville, TN 37204","1330Km","50%","4G"),
         MemberModel("James Anderson","6789 Walnut Drive, Seattle, WA 98104","106Km","99%","4G"),
         MemberModel(" Sophia White","3210 Willow Lane, Phoenix, AZ 85004","100Km","89%","WIFI"),

     )
        val adapter =MemberAdapter(listMember)

        val recycler =requireView().findViewById<RecyclerView>(R.id.RecyclerView)     //we use requiredView because we don't have any context and providing View(findViewbyId) works differenty for fragments
        recycler.layoutManager =LinearLayoutManager(requireContext())                 //defining a layout manager
        recycler.adapter=adapter                                                      //defining the adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeScreenFragment()
    }
}