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
import com.sachin.navtest.databinding.FragmentThreeListBinding

class ThreeFragmentList: Fragment() {

    lateinit var fragmentThreeBinding: FragmentThreeListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentThreeBinding = FragmentThreeListBinding.inflate(inflater, container, false)

        return fragmentThreeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)
        fragmentThreeBinding.btNextThreeList.setOnClickListener {
            findNavController().navigate(R.id.action_threeFragmentList_to_threeFragmentDetails)
        }

    }

}