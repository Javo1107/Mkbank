package com.example.mkbank.app.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mkbank.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        root.btn_login.setOnClickListener {
                view:View->
            Navigation.findNavController(view).navigate(R.id.action_nav_home_to_signInFragment)
        }

        root.btn_reg.setOnClickListener { view:View->
            Navigation.findNavController(view).navigate(R.id.action_nav_home_to_signUpFragment)
        }

//        root.nav_icon_imageview.setOnClickListener {
//            drawer_layout.openDrawer(GravityCompat.START)
//        }
        return root
    }
}