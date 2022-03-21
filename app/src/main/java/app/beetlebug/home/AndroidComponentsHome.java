package app.beetlebug.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import app.beetlebug.MainActivity;
import app.beetlebug.R;
import app.beetlebug.ctf.VulnerableActivityIntent;
import app.beetlebug.ctf.VulnerableBroadcastReceiver;
import app.beetlebug.ctf.VulnerableServiceActivity;


public class AndroidComponentsHome extends Fragment {

    Button mButton, mButton2, mButton3;
    TextView mCtfTitle;

    ImageView mBackButton;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_android_components, container, false);
        mButton = view.findViewById(R.id.button);
        mButton2 = view.findViewById(R.id.button2);
        mButton3 = view.findViewById(R.id.button3);
        mCtfTitle = view.findViewById(R.id.textViewComponentsTitle);
        mBackButton = view.findViewById(R.id.arrowLeft);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctf_intent = new Intent(getActivity(), MainActivity.class);
                startActivity(ctf_intent);
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctf_intent = new Intent(getActivity(), VulnerableActivityIntent.class);
                startActivity(ctf_intent);
            }
        });


        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctf_intent2 = new Intent(getActivity(), VulnerableBroadcastReceiver.class);
                startActivity(ctf_intent2);
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctf_intent3 = new Intent(getActivity(), VulnerableServiceActivity.class);
                startActivity(ctf_intent3);
            }
        });
        return view;
    }
}