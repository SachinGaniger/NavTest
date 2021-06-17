package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentOneBinding
import com.sachin.navtest.databinding.FragmentThreeBinding

class ThreeFragment: Fragment(R.layout.fragment_three) {

    lateinit var fragmentThreeBinding: FragmentThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentThreeBinding = FragmentThreeBinding.inflate(inflater, container, false)

        return fragmentThreeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)

        fragmentThreeBinding.btNextThree.setOnClickListener {
            findNavController().navigate(R.id.action_threeFragment_to_threeFragmentList)
        }

    }

}