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


        /** class */
        class Person{

            private String name;
            private String description;
            private Integer image;

            private Person(String name, String description, Integer image){
                this.name = name;
                this.description = description;
                this.image = image;
            }

            public String getName(){
                return this.name;
            }

            public String getDescription(){
                return this.description;
            }

            public Integer getImage(){
                return this.image;
            }

        }


        /** settings */
        final ArrayList<Person> group = new ArrayList<>();
        group.add(new Person("Alexandre","Pedreiro Peruâno", R.drawable.alexandre));
        group.add(new Person("André","In love", R.drawable.andre));
        group.add(new Person("Arthur","Odeia o brasil", R.drawable.arthur));
        group.add(new Person("Daniel","Gigante", R.drawable.daniel));
        group.add(new Person("Eduardo","Irreverente", R.drawable.eduardo));
        group.add(new Person("Guilherme","My Friend", R.drawable.guilherme));
        group.add(new Person("Lourenço","Perdido na night", R.drawable.lourenco));
        group.add(new Person("Marcos","Dono/Patrão", R.drawable.marcos));
        group.add(new Person("Renam","Um cara legal", R.drawable.renam));
        group.add(new Person("Ueslei","Safadão", R.drawable.ueslei));


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
                    int shuffle = random.nextInt(group.size());

                    /** instance */
                    Person sorted = group.get(shuffle);

                    /** setting stuffs */
                    image.setImageResource(sorted.getImage());
                    name.setText(sorted.getName());
                    description.setText(sorted.getDescription());

                    /** check if arrayList still are populated */
                    if(group.size() == 1){

                        /** remove button from screen */
                        button.setVisibility(View.INVISIBLE);
                    }else{

                        /** remove sorted from arrayLists */
                        group.remove(shuffle);

                    }

                }

            }
        );

    }
}
