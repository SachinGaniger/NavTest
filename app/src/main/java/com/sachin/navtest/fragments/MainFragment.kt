package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment(R.layout.fragment_main) {

    lateinit var fragmentMainBinding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)

        return fragmentMainBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = requireActivity().findNavController(R.id.mainNavigationHostFragment)

        fragmentMainBinding.bottomNavigationView.setupWithNavController(navController)

    }
}