package com.example.perpetual;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CFragment extends Fragment {

    private EditText search_box;
    private ListView searchResultsListView;
    private List<String> allItems;
    ArrayAdapter<String> adapter;
    private SearchView searchView;
    private RecyclerView recyclerView;
    private HashMap<String, Class> itemPageMapping;


    public CFragment() {
        // Required empty public constructor

    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_c,container,false);
        search_box = view.findViewById(R.id.search_box);
        searchResultsListView=view.findViewById(R.id.searchResultsListView);
        allItems=new ArrayList<>();
        allItems.add("HODINKEE");
        allItems.add("aBlogtoWatch");
        allItems.add("Man of Many – The Wind Up");
        allItems.add(" Worn and Wound");


        itemPageMapping = new HashMap<>();
        itemPageMapping.put("HODINKEE", first_watch.class);
        itemPageMapping.put("aBlogtoWatch", second_watch.class);
        itemPageMapping.put("Man of Many – The Wind Up", third_watch.class);
        itemPageMapping.put(" Worn and Wound",fourth_watch.class);

        final ArrayAdapter<String> adapter=new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1,allItems);
        searchResultsListView.setAdapter(adapter);
        searchResultsListView.setOnItemClickListener((parent, view1, position, id) -> {
            String selectedItem = adapter.getItem(position);

            if (selectedItem != null && itemPageMapping.containsKey(selectedItem)) {
                Class targetActivity = itemPageMapping.get(selectedItem);
                // Create an Intent and pass data to the next activity
                Intent intent = new Intent(requireContext(), first_watch.class);
                // intent.putExtra("selectedItem", selectedItem); // Pass the selected item's value
                startActivity(intent);
            }
        });

        search_box.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return view;
    }
    private void performSearch(String query){

    }
    private void updateSearchResults(String newText){
    }
}