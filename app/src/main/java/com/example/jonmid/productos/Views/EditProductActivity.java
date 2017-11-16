package com.example.jonmid.productos.Views;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jonmid.productos.R;

public class EditProductActivity extends AppCompatActivity {

    TextView textViewId;
    TextInputEditText textInputEditTextName;
    TextInputEditText textInputEditTextDescription;
    TextInputEditText textInputEditTextPrice;
    TextInputEditText textInputEditTextImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_product);

        textViewId = (TextView) findViewById(R.id.id_tv_edit_idproduc);
        textInputEditTextName = (TextInputEditText) findViewById(R.id.id_tiet_edit_name);
        textInputEditTextDescription = (TextInputEditText) findViewById(R.id.id_tiet_edit_description);
        textInputEditTextPrice = (TextInputEditText) findViewById(R.id.id_tiet_edit_price);
        textInputEditTextImage = (TextInputEditText) findViewById(R.id.id_tiet_edit_image);
    }

    public void editProduct(View view){
        //
    }
}
