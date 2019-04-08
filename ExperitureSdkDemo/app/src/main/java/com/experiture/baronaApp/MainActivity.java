package com.experiture.baronaApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.experiture.expimagedownloader.ImageParser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editImageUrl;
    private ImageView imageNature;
    private Button btnLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editImageUrl = findViewById(R.id.editImageUrl);
        imageNature = findViewById(R.id.imageNature);
        btnLoad = findViewById(R.id.btnLoad);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLoad:
                String imageUrl = editImageUrl.getText().toString().trim();
                //Load Image
                ImageParser.getInstance()
                        .loadMyImage(imageUrl, imageNature);
                break;
        }
    }
}
