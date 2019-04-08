package com.atilsamancioglu.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("Atil"));

        username = "";


        makeMusicians();

        makeSimpsons();


    }

    public void makeSimpsons() {

        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());

    }


    public void makeMusicians() {

        //instance

        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);

    }




    public void testMethod() {

        username = "Lars";
        int x = 4 + 4;
        x = 9;
        System.out.println("value of x: " + x);
    }

    public int math(int a, int b){

        username = "Kirk";
        int x = 11;
        System.out.println("value of x in math: " + x);
        return a + b;
    }

    public String newMethod(String string) {

        username = "Rob";

        return string + " new Method";
    }


    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("on resume called");

    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");

    }
}
