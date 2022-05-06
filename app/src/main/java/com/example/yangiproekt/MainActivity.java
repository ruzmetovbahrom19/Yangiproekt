package com.example.yangiproekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1;
    Button button1;
    Uri mImageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=findViewById(R.id.imageview1);
        button1=findViewById(R.id.button1);

        Picasso.get().load("https://wallbox.ru/resize/800x480/wallpapers/main/201547/914ea54b4a8d747.jpg").
                into(imageView1);

       // button1.setOnClickListener(v -> {
           //openFileChooser();
      //  });


   // }

//    private void openFileChooser() {
//        Intent intent=new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_PICK);
//        startActivityForResult(intent,1);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode,resultCode,data);
//        if (requestCode==1 && resultCode == RESULT_OK && data != null && data.getData()!= null){
//            mImageUri=data.getData();
//            Picasso.get().load(mImageUri).centerCrop().fit().into(imageView1);
//        }
    }
}