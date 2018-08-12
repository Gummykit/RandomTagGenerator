package com.example.ronnie.randomgamertaggenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String[] adjectives={"attractive","bald","beautiful","chubby","clean","dazzling","drab","elegant","fancy","fit", "flabby","glamorous","gorgeous","handsome","long"
            ,"magnificent","muscular","plain","plump","quaint","scruffy","shapely","short","skinny","stocky","ugly","unkempt","unsightly","big"
            ,"colossal","fat","gigantic","great","huge","immense","large","little","mammoth","massive","microscopic","miniature","petite","puny"
            ,"scrawny","small","tall","teeny","tiny","wild","Sledge","Thatcher","Pulse","Ash","Hibana","Vigil","Ela","Jager","Rook","EZ"};
    String[] nouns={"child","gamer","panda","man","girll","operator","JOK3R","puppy","Dog","Animal","Dancer","Batman","Woman","Wolf","Main","EZ","efficionado"
                    ,"mouse","horse","weeb","noob","__","Toilet","boii","nibba","retard","dude","sniper","Thief","Agent","Freak","Tig3r","..","rascal",
                    "King","Fella","Bear","Russian","Eagle","Polygon","Engine","Onyx","Chicken","Whale","Duck"};

    TextView textView4,textView,textView5;
    Button button2;
    String adj,nou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4 = findViewById(R.id.textView4);
        textView = findViewById(R.id.textView);
        textView5 = findViewById(R.id.textView5);
        button2=findViewById(R.id.button2);
    }

    public void Randomgen(View v)
        {
            Random random=new Random();
            int currentIndex= random.nextInt(57);
            String adj=adjectives[currentIndex];
            int currentIndex1=random.nextInt(15);
            String nou=nouns[currentIndex1];
            textView4.setText(adj);
            textView.setText(nou);
            textView5.setText(adj+"_"+nou);
        }

}
