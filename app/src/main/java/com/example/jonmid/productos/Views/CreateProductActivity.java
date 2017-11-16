package com.example.jonmid.productos.Views;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jonmid.productos.R;

public class CreateProductActivity extends AppCompatActivity {

    TextInputEditText textInputEditTextName;
    TextInputEditText textInputEditTextDescription;
    TextInputEditText textInputEditTextPrice;
    TextInputEditText textInputEditTextImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_product);

        textInputEditTextName = (TextInputEditText) findViewById(R.id.id_tiet_new_name);
        textInputEditTextDescription = (TextInputEditText) findViewById(R.id.id_tiet_new_description);
        textInputEditTextPrice = (TextInputEditText) findViewById(R.id.id_tiet_new_price);
        textInputEditTextImage = (TextInputEditText) findViewById(R.id.id_tiet_new_image);
    }

    public void createProduct(View view){
        //
    }
}
