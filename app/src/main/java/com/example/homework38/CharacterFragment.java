package com.example.homework38;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework38.databinding.FragmentCharacterBinding;

import java.util.ArrayList;

public class CharacterFragment extends Fragment {
    private FragmentCharacterBinding binding;
    private CharacterAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Character> list = new ArrayList<>();
    private NavController controller;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new CharacterAdapter();
        NavHostFragment hostFragment = (NavHostFragment) requireActivity().getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_activity_main);
        controller = hostFragment.getNavController();
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        itemClick();
        createList();
    }

    private void createList() {
        list= new ArrayList<>();
        list.add(new Character(R.drawable._image_ , "Alive", "Rick Sanchez"));
        list.add(new Character(R.drawable._image_ , "Alive", "Rick Sanchez"));
        list.add(new Character(R.drawable._image_ , "Alive", "Rick Sanchez"));
        list.add(new Character(R.drawable._image_ , "Alive", "Rick Sanchez"));
        list.add(new Character(R.drawable._image_ , "Alive", "Rick Sanchez"));
        list.add(new Character(R.drawable.ic_launcher_background , "Alive", "Rick "));
    }

    private void itemClick() {
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(int position) {
                controller.navigate(R.id.characterDetailFragment);
            }
        });
    }
}