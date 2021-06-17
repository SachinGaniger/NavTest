package com.sachin.navtest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.sachin.navtest.R
import com.sachin.navtest.databinding.FragmentLoginBinding
import com.sachin.navtest.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class LoginFragment: Fragment(R.layout.fragment_login) {

    lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController = NavHostFragment.findNavController(this)

        fragmentLoginBinding.btLogin.setOnClickListener {
            navHostFragment.findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }

    }

}