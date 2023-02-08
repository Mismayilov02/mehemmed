package com.master.mehemmedisma;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;


public class CreateAccount extends Fragment {

Button loginBtn;
Spinner spinner;

  String []  language = new String[]{"Select","Azerbaycan" , "Turk" , ":ingilis" , "Alman" , "Fransiz"};



    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_account, container, false);


        loginBtn = view.findViewById(R.id.loginBtn);
        spinner = view.findViewById(R.id.spinner);


        Adapter adapter = new ArrayAdapter<String>(getContext() ,  android.R.layout.simple_list_item_1 ,  language);
        spinner.setAdapter((SpinnerAdapter) adapter);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_createAccount_to_loginFragment);
            }
        });

        return  view;
    }
}