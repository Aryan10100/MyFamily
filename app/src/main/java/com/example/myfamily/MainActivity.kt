package com.example.myfamily

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfamily.R.id.bottom_nav
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.mainactivity)

        Toast.makeText(this, "Welcome!!", Toast.LENGTH_SHORT).show()

                                                                             //setting the onClickListener for the Bottom Navigation Bar
        val BottomBar = findViewById<BottomNavigationView>(R.id.bottom_nav)
        BottomBar.setOnItemSelectedListener() { menuItem->

          if (menuItem.itemId==R.id.nav_guard){                             ///if statement confirms that onclicking on guard button only it opens the GuardFragment
                                                                            ///id of bottom nav item is from res->menu->bottom_bar_items

              inflateFragment()               //we can use inflateFragment(GuardFragment.newInstance())                               //function to inflate the fragments

          }else if(menuItem.itemId==R.id.nav_home){

              inflateFragmentHome()          //we can use inflateFragment(HomeScreenFragment.newInstance())

          }




            true                                       ///tells the item which we have clicked is to be selected or not
        }


    }

    private fun inflateFragmentHome() {          //inflateFragment(newInstance : Fragment)
        val transaction = supportFragmentManager.beginTransaction()           ///represents how function transaction AKA click krne pe HomeScreenfragment hi open ho
        transaction.replace(R.id.container,HomeScreenFragment.newInstance())  //And rewrite it as  transaction.replace(R.id.container,newInstance())
        transaction.commit()

    }

    private fun inflateFragment() {   ///inflation function
       val transaction = supportFragmentManager.beginTransaction()              ///represents how function transaction AKA click krne pe guarfragment hi open ho
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()
    }
}