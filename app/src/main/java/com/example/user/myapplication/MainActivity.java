package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /** initialize */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /** settings */
        final ArrayList<String> names = new ArrayList<String>();
        names.add("Alexandre");
        names.add("André");
        names.add("Arthur");
        names.add("Daniel");
        names.add("Eduardo");
        names.add("Guilherme");
        names.add("Lourenço");
        names.add("Marcos");
        names.add("Renam");
        names.add("Ueslei");

        final ArrayList<String> descriptions = new ArrayList<String>();
        descriptions.add("Pedreiro Peruâno");
        descriptions.add("In love");
        descriptions.add("Odeia o brasil");
        descriptions.add("Gigante");
        descriptions.add("Irreverente");
        descriptions.add("My friend");
        descriptions.add("Perdido na night");
        descriptions.add("Dono/Patrão");
        descriptions.add("Misterious man");
        descriptions.add("Safadão");

        final ArrayList<Integer> images = new ArrayList<Integer>();
        images.add(R.drawable.alexandre);
        images.add(R.drawable.andre);
        images.add(R.drawable.arthur);
        images.add(R.drawable.daniel);
        images.add(R.drawable.eduardo);
        images.add(R.drawable.guilherme);
        images.add(R.drawable.lourenco);
        images.add(R.drawable.marcos);
        images.add(R.drawable.renam);
        images.add(R.drawable.ueslei);


        /** instances */
        final ImageView image = (ImageView) findViewById(R.id.student_image);
        final TextView name = (TextView) findViewById(R.id.name);
        final TextView description = (TextView) findViewById(R.id.description);
        final Button button = (Button) findViewById(R.id.button);


        /** events */
        button.setOnClickListener(
            new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    /** random number */
                    Random random = new Random();
                    int shuffle = random.nextInt(names.size());

                    /** sets the image with the random position of array */
                    image.setImageResource(images.get(shuffle));

                    /** sets the name with the random position of array */
                    name.setText(names.get(shuffle));

                    /** sets the description with the random position of array */
                    description.setText(descriptions.get(shuffle));

                    /** check if arrayList still are populated */
                    if(names.size() == 1){

                        /** remove button from screen */
                        button.setVisibility(View.INVISIBLE);
                    }else{

                        /** remove sorted from arrayLists */
                        images.remove(shuffle);
                        names.remove(shuffle);
                        descriptions.remove(shuffle);
                    }

                }

            }
        );

    }
}
