package com.example.ioasystest.feature.home.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ioasystest.R
import com.example.ioasystest.common.extensions.changeStatusBarColor
import com.example.ioasystest.common.extensions.setGone
import com.example.ioasystest.common.extensions.setVisible
import com.example.ioasystest.databinding.FragmentHomeBinding
import android.app.Activity
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.FragmentActivity


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        handleComponetVisibility()

    }

    private fun handleComponetVisibility() {
        with(binding) {
            searchIcon.setOnClickListener {
                initialToolbar.setGone()
                searchToolbar.setVisible()
                instructionsText.setGone()
            }

            closeSearchBar.setOnClickListener {
                searchToolbar.setGone()
                initialToolbar.setVisible()
                instructionsText.setVisible()
                
            }
        }
    }

    private fun setupView() {
        changeStatusBarColor(R.color.dark_rose)
    }

}