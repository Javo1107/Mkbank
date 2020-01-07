package com.example.mkbank.app.foreignExchange

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mkbank.R

class ForeignExchangeFragment : Fragment() {

    private lateinit var foreignExchangeViewModel: ForeignExchangeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        foreignExchangeViewModel =
            ViewModelProviders.of(this).get(ForeignExchangeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_foreign_exchange, container, false)
        val textView: TextView = root.findViewById(R.id.text_foreign_exchange)
        foreignExchangeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}