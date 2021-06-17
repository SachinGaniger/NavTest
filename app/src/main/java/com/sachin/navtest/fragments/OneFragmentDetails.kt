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
import com.sachin.navtest.databinding.FragmentOneDetailsBinding
import kotlinx.android.synthetic.main.activity_main.*

class OneFragmentDetails: Fragment() {

    lateinit var fragmentOneDetailsBinding: FragmentOneDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentOneDetailsBinding = FragmentOneDetailsBinding.inflate(inflater, container, false)

        return fragmentOneDetailsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)

        }

    }

