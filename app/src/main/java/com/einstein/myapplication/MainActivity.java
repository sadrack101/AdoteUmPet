package com.einstein.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.botao_cadastrar = findViewById(R.id.botao_cadastrar);
        this.mViewHolder.botao_cadastrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.botao_cadastrar) {
            Intent intent = new Intent(this, TelaCadastro.class);
            startActivity(intent);
        }
    }

    public static class ViewHolder {
        Button botao_cadastrar;
    }
}