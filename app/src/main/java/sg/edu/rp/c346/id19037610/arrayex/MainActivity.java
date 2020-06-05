package sg.edu.rp.c346.id19037610.arrayex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvContent);
        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        String out = "";

        if(fruits.length!=0){
            out+="Fruits";
            out+="\n=====";

            for(int i=0;i<fruits.length;i++){
                out+="\n"+fruits[i];
            }
        }
        tv.setText(out);
    }
}
