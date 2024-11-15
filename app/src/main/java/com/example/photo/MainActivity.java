package com.example.photo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.photo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
        Button CameraButton = binding.button1;
        Button GalleryButton = binding.button2;

        CameraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCamera();
            }
        });
        GalleryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGallery();
            }
        });
    }
    private void openCamera(){
        if()
    }
    private void openGallery(){

    }


}