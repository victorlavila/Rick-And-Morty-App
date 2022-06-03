package com.leo.rickandmorty.home.presentation.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.leo.rickandmorty.databinding.FragmentHomeBinding
import com.leo.rickandmorty.home.presentation.entity.ResultsToUi
import com.leo.rickandmorty.home.presentation.viewModel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModel()
    private val results = mutableListOf<ResultsToUi>()

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAdapter()
        setupView()
    }

    private fun setAdapter() {
        adapter = HomeAdapter(requireContext(), results)
        with(binding) {
            homeList.adapter = adapter
            homeList.layoutManager = GridLayoutManager(requireContext(), 2)
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setupView() {
        viewModel.characterList.observe(viewLifecycleOwner) { characters ->
            characters.let {
                results.addAll(characters)
            }
            adapter.notifyDataSetChanged()

        }
        viewModel.loading.observe(viewLifecycleOwner) {
            if (!it) {
                binding.loading.visibility = GONE
            } else {
                binding.loading.visibility = VISIBLE
            }
        }
    }
}