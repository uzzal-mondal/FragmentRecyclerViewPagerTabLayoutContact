package com.example.fragmentwithrecycler.Contact;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentwithrecycler.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

     private Context context;
     private RecyclerView recyclerView;
     private List<ContactModel> contactModelList;

    // create constructor.
    public FragmentContact(){

    }

    //create a life cycle fragment


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerContact_fragment_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(context,contactModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contactModelList = new ArrayList<>();
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Dart","01980450700",R.drawable.dartlogo));
        contactModelList.add(new ContactModel("Fluter","01980450700",R.drawable.fluterlogo));
        contactModelList.add(new ContactModel("Java Script","01980450700",R.drawable.javascriptlogo));
        contactModelList.add(new ContactModel("Php","01980450700",R.drawable.phplogo));
        contactModelList.add(new ContactModel("Python","01980450700",R.drawable.pythonlogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));
        contactModelList.add(new ContactModel("Java","01980450700",R.drawable.javalogo));


    }
}
