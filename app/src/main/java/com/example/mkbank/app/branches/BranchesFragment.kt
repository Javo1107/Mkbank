package com.example.mkbank.app.branches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mkbank.R

class BranchesFragment : Fragment() {

    private lateinit var branchesViewModel: BranchesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        branchesViewModel =
            ViewModelProviders.of(this).get(BranchesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_branches, container, false)
        val textView: TextView = root.findViewById(R.id.text_branches)
        branchesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}