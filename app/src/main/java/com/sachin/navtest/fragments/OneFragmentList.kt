package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentLoginBinding
import com.sachin.navtest.databinding.FragmentOneBinding
import com.sachin.navtest.databinding.FragmentOneListBinding
import kotlinx.android.synthetic.main.activity_main.*

class OneFragmentList: Fragment() {

    lateinit var fragmentOneBinding: FragmentOneListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentOneBinding = FragmentOneListBinding.inflate(inflater, container, false)

        return fragmentOneBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)
        fragmentOneBinding.btNextOneList.setOnClickListener {
            findNavController().navigate(R.id.action_oneFragmentList_to_oneFragmentDetails)
        }

        }

    }

