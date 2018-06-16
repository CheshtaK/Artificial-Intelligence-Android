package com.example.cheshta.textrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button btnTextRecognition, btnFaceDetection, btnFaceIdentification, btnImageAnalyzing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnTextRecognition = findViewById(R.id.btnTextRecognition);
        btnFaceDetection = findViewById(R.id.btnFaceDetection);
        btnFaceIdentification = findViewById(R.id.btnFaceIdentification);
        btnImageAnalyzing = findViewById(R.id.btnImageAnalyzing);

        btnTextRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, TextRecognitionActivity.class);
                startActivity(intent);
            }
        });

        btnFaceDetection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, FaceDetectionActivity.class);
                startActivity(intent);
            }
        });
    }
}
