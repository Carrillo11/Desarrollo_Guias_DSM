package com.example.guia3;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

  //  private MainViewModel mainViewModel;
    private TextView tvnum;
    private MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        tvnum = (TextView) findViewById(R.id.tvnum);
        tvnum.setText(String.valueOf(mainViewModel.i));
    }

        public void incrementar (View view) {
        if (mainViewModel.i <= 8) {
            mainViewModel.i++;
            tvnum.setText(String.valueOf(mainViewModel.i));
        } else if (mainViewModel.i > 8) {
            mainViewModel.i = 0;
            tvnum.setText(String.valueOf(mainViewModel.i));
        }
    }
    }



