package com.example.build_profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

public class build_profile2 extends AppCompatActivity {
    private Button btnRegister;
    private TextView thingToDo;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.build_profile2);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid) ;
        setToggleEvent(mainGrid);

        btnRegister = (Button) findViewById(R.id.btnNext2);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(build_profile2.this, home.class);
                startActivity(intent);
            }
        });
    }

    private void setToggleEvent(GridLayout mainGrid) {
        for (int i=0; i< mainGrid.getChildCount();i++)
        {
            final CardView cardView = (CardView)mainGrid.getChildAt(i);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor()== -1){

                        cardView.setCardBackgroundColor(Color.parseColor("#32CD32"));
                        Toast.makeText(build_profile2.this, "Selected",Toast.LENGTH_SHORT ).show();
                    }
                    else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(build_profile2.this, "UnSelected",Toast.LENGTH_SHORT ).show();
                    }
                }
            });
        }



    }
}
