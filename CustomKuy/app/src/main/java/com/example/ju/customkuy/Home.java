package com.example.ju.customkuy;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    private static final int PICK_IMAGE_REQUEST=1;
    private Button btn_upload;
    private EditText masukan_nama;
    private ImageView lihat;
    private ProgressBar progres;

    private Uri imageUri;


    public Home() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);
        Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
        EditText masukan_nama = (EditText) view.findViewById(R.id.maukan_nama);
        ImageView lihat = (ImageView) view.findViewById(R.id.lihat);

        btn_upload.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openFileChooser();
            }
        });

        EditText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        ImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });




        return view;
    }



    private void openFileChooser(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data ! == null && data.getData()! = null){

            imageUri = data.getData();

            Picasso.with(this).load(imageUri).into((Target) imageUri);

        }
    }
}
