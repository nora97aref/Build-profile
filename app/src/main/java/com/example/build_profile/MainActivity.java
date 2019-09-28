package com.example.build_profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static androidx.cardview.widget.CardView.*;

public class MainActivity extends AppCompatActivity {
    private Button btnNext2;
    private TextView weather;
    GridLayout mainGrid;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);


        mainGrid = (GridLayout)findViewById(R.id.mainGrid) ;
        setToggleEvent(mainGrid);

       btnNext2 = (Button) findViewById(R.id.btnNext2);
       btnNext2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, build_profile2.class);
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
                    Toast.makeText(MainActivity.this, "Selected",Toast.LENGTH_SHORT ).show();
                }
                    else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "UnSelected",Toast.LENGTH_SHORT ).show();
                    }
            }
            });
    }



}

}
