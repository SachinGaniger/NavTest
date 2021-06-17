package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentOneBinding
import com.sachin.navtest.databinding.FragmentThreeBinding
import com.sachin.navtest.databinding.FragmentThreeDetailsBinding

class ThreeFragmentDetails: Fragment() {

    lateinit var fragmentThreeBinding: FragmentThreeDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentThreeBinding = FragmentThreeDetailsBinding.inflate(inflater, container, false)

        return fragmentThreeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)

    }

}