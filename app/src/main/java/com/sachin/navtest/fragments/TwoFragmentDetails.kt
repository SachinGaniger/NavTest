package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentThreeBinding
import com.sachin.navtest.databinding.FragmentTwoBinding
import com.sachin.navtest.databinding.FragmentTwoDetailsBinding

class TwoFragmentDetails: Fragment() {

    lateinit var fragmentTwoBinding: FragmentTwoDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentTwoBinding = FragmentTwoDetailsBinding.inflate(inflater, container, false)

        return fragmentTwoBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)

    }

}