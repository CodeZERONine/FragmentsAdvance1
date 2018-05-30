package org.akshanshgusain.fragmentsadvance;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment3 extends Fragment {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment3_layout,container,false);
        btn1=(Button)view.findViewById(R.id.button1);
        btn2=(Button)view.findViewById(R.id.button2);
        btn3=(Button)view.findViewById(R.id.button3);
        btn4=(Button)view.findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call new fragment
                ( (MainActivity)getActivity()).setViewPager(0);
                Toast.makeText(getActivity(), "Calling fragment1", Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call new fragment  ( (MainActivity)getActivity()).setViewPager(0);
                ( (MainActivity)getActivity()).setViewPager(1);
                Toast.makeText(getActivity(), "Calling fragment2", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call new fragment
                ( (MainActivity)getActivity()).setViewPager(2);
                Toast.makeText(getActivity(), "Calling fragment3", Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  startActivity(new Intent(getActivity(),SecondActivity.class));
            }
        });

        return view;
    }
}
