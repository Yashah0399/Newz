package com.yashah.newz.News

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.yashah.newz.R
import com.yashah.newz.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentNewsBinding>(inflater, R.layout.fragment_news, container, false)
        binding.message.setOnClickListener{ view: View ->
            Navigation.findNavController(view).navigate(R.id.action_newsFragment_to_newsDetailsFragment)
        }
        return binding.root
    }
}