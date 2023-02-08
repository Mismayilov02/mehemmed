package com.master.mehemmedisma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserAdapter extends ArrayAdapter<String> {

    Context context;
    String[] userList = new String[]{};

    UserAdapter(Context context , String[] userList){
        super(context , R.layout.list_design , userList);

        this.context = context;
        this.userList = userList;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         View view  = LayoutInflater.from(context).inflate(R.layout.list_design , null);

        TextView userName = view.findViewById(R.id.designUserName);

        userName.setText( userList[position] );

        return view;
    }
}
