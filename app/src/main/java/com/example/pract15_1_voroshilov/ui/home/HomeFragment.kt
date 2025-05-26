package com.example.pract15_1_voroshilov.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.pract15_1_voroshilov.R
import com.example.pract15_1_voroshilov.databinding.FragmentHomeBinding
import recadapters.FeelRecycler
import recadapters.MyFeel
import recadapters.MyState
import recadapters.StateRecycler

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val feel_recycler:RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list)

        val state_recycler:RecyclerView = root.findViewById(R.id.state_rec)
        state_recycler.adapter = StateRecycler(requireContext(), MyState().stateList)

        return root
    }
}