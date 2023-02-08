package com.master.mehemmedisma;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class LoginFragment extends Fragment {

    Button createBtn;
    ListView listView;
    String[] list = new String[]{"Mehemmed" , "Ali" , "Veli" , "Ehmed" , "Framenr" , "Nurane"};

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);

        createBtn = view.findViewById(R.id.createAccountBtn);
        listView = view.findViewById(R.id.listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext() , list[i] , Toast.LENGTH_LONG).show();
            }
        });

        UserAdapter userAdapter = new UserAdapter(getContext() , list );
        listView.setAdapter(userAdapter);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_createAccount);
            }
        });

        return  view;
    }
}