package com.gold.egypy.g2epi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final int X = 8;
    private static final  int Y = 8;
    private static final int SIZE_ARR = 8;
    Button button,buttonRestart;
    Display display;
    Cell cell;
    ImageView imageView;
    TextView textView;

    ConstraintLayout constraintLayout;
    int height;
    int width;
    int size;
    int sizeText;
    int center;
    private List<Cell> listCell;
    private List<Button> listButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        display = getWindowManager().getDefaultDisplay();
        height = display.getHeight();
        width = display.getWidth();
        size = width/8;
        sizeText = width;
        center = height/5;

        listCell = new ArrayList<Cell>();
        listButton = new ArrayList<Button>();

        constraintLayout = findViewById(R.id.constraintLayout);
        buttonRestart = findViewById(R.id.buttonRestart);
        createGame();

        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0 ; i <listCell.size();){
                    Cell cell =  listCell.get(i);
                    listCell.remove(cell);
                }

                for (int i = 0; i< listButton.size();){
                    Button button2 = listButton.get(i);
                    listButton.remove(button2);
                    constraintLayout.removeView(button2);
                }

                constraintLayout.removeView(imageView);


                createGame();
            }
        });


    }


    private void createGame(){


        char arr [][] = new char[Y][X];
        for (int i = 0; i< SIZE_ARR; i++){
            for (int j = 0; j < SIZE_ARR; j++){
                arr[i][j] = '0';
            }

        }

        Random random = new Random();
        ArrayList<Myclass> arrayList = new ArrayList<>();

        for (int i = 0; i< SIZE_ARR; i++){
            Myclass mc = getMyClass(arrayList);

            arr[mc.y][mc.x] = '*';
            arrayList.add(mc);


        }

        for (int i = 0; i < arrayList.size(); i++){
            Myclass p = arrayList.get(i);
            int x = p.getX();
            int y = p.getY();


            for (int d = 0; d< SIZE_ARR; d++) {
                for (int j = 0; j < SIZE_ARR; j++) {
                    if (arr[d][j] != '*') {

                        if (j - 1 >= 0 && j - 1 < arr.length) {
                            if (d - 1 >= 0 && d - 1 < arr.length) {
                                if (arr[d - 1][j - 1] == '*') {
                                    char c = arr[d][j];
                                    int n = Integer.parseInt(c + "");
                                    n++;
                                    arr[d][j] = (n + "").charAt(0);
                                }
                            }
                        }


                        if (j >= 0 && j < arr.length) {
                            if (d - 1 >= 0 && d - 1 < arr.length) {
                                if (arr[d - 1][j] == '*') {
                                    char c = arr[d][j];
                                    int n = Integer.parseInt(c + "");
                                    n++;
                                    arr[d][j] = (n + "").charAt(0);
                                }
                            }

                            if (j + 1 >= 0 && j + 1 < arr.length) {
                                if (d - 1 >= 0 && d - 1 < arr.length) {
                                    if (arr[d - 1][j + 1] == '*') {
                                        char c = arr[d][j];
                                        int n = Integer.parseInt(c + "");
                                        n++;
                                        arr[d][j] = (n + "").charAt(0);
                                    }
                                }

                                if (j + 1 >= 0 && j + 1 < arr.length) {
                                    if (d >= 0 && d < arr.length) {
                                        if (arr[d][j + 1] == '*') {
                                            char c = arr[d][j];
                                            int n = Integer.parseInt(c + "");
                                            n++;
                                            arr[d][j] = (n + "").charAt(0);
                                        }
                                    }

                                    if (j + 1 >= 0 && j + 1 < arr.length) {
                                        if (d + 1 >= 0 && d + 1 < arr.length) {
                                            if (arr[d + 1][j + 1] == '*') {
                                                char c = arr[d][j];
                                                int n = Integer.parseInt(c + "");
                                                n++;
                                                arr[d][j] = (n + "").charAt(0);
                                            }
                                        }


                                        if (j >= 0 && j < arr.length) {
                                            if (d + 1 >= 0 && d + 1 < arr.length) {
                                                if (arr[d + 1][j] == '*') {
                                                    char c = arr[d][j];
                                                    int n = Integer.parseInt(c + "");
                                                    n++;
                                                    arr[d][j] = (n + "").charAt(0);
                                                }
                                            }
                                        }


                                        if (j - 1 >= 0 && j - 1 < arr.length) {
                                            if (d + 1 >= 0 && d + 1 < arr.length) {
                                                if (arr[d + 1][j - 1] == '*') {
                                                    char c = arr[d][j];
                                                    int n = Integer.parseInt(c + "");
                                                    n++;
                                                    arr[d][j] = (n + "").charAt(0);
                                                }
                                            }
                                        }



                                        if (j - 1 >= 0 && j - 1 < arr.length) {
                                            if (d >= 0 && d < arr.length) {
                                                if (arr[d][j - 1] == '*') {
                                                    char c = arr[d][j];
                                                    int n = Integer.parseInt(c + "");
                                                    n++;
                                                    arr[d][j] = (n + "").charAt(0);
                                                }
                                            }
                                        }


                                    }
                                }

                            }
                        }
                    }
                }
            }

        }



        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                char c = arr[i][j];

                if (c != '*'){
                    if (c != '0'){
                        int k = Integer.parseInt(c + "");
                        k = 9 - k;
                        arr[i][j] = (k + "").charAt(0);
                    }
                }

            }
        }




        for (int i = 0; i< SIZE_ARR; i++){
            for (int j = 0; j < SIZE_ARR; j++){
                button = new Button(MainActivity.this);
                ConstraintLayout.LayoutParams buttonViewLayoutParams =
                        new ConstraintLayout.LayoutParams(size,size);
                button.setLayoutParams(buttonViewLayoutParams);
                constraintLayout.addView(button,0,buttonViewLayoutParams);
                button.setY(i*size+center);
                button.setX(j*size);
                button.setBackgroundResource(R.drawable.ic_slot_3);
                button.setTextColor(getApplication().getResources().getColor(R.color.white));
                button.setTextSize(22);
                char c= arr[i][j];
                cell = new Cell(button,c,j,i);
                listCell.add(cell);
                listButton.add(button);
            }
        }


        for (int i = 0; i< listCell.size();i++){

            cell = listCell.get(i);
            char e = cell.getC();
            Button button1 = cell.getButton();
            cell.getButton().setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    ((Button)view).setText("" + e);

                    button1.setClickable(false);

                    if (e == '*'){

                        textView = new TextView(MainActivity.this);
                        textView.setText("Game over");
                        textView.setTextSize(40);
                        textView.setTextColor(getApplication().getResources().getColor(R.color.white));
                        ConstraintLayout.LayoutParams textViewLayoutParams =
                                new ConstraintLayout.LayoutParams(sizeText, sizeText);

                        textView.setLayoutParams(textViewLayoutParams);
                        constraintLayout.addView(textView);
                        textView.setX(width/2-sizeText/4);
                        textView.setY(+40);
                        button1.setBackgroundResource(R.drawable.ic_slot_1);
                        for (int i = 0; i< listButton.size(); i++) {
                            Button button2 = listButton.get(i);
                            button2.setClickable(false);

                        }

                    }else {
                        button1.setBackgroundResource(R.drawable.ic_slot_2);
                    }
                }
            });
        }


    }


    private static Myclass getMyClass(ArrayList<Myclass> arrayList) {
        Random random = new Random();

        int x = random.nextInt(SIZE_ARR);
        int y = random.nextInt(SIZE_ARR);

        for (int i = 0; i < arrayList.size(); i++) {
            Myclass p = arrayList.get(i);
            if (p.getX() == x && p.getY() == y){
                return getMyClass(arrayList);
            }
        }

        Myclass mc = new Myclass();
        mc.x = x;
        mc.y = y;


        return mc;
    }


    public static class  Myclass{
        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}