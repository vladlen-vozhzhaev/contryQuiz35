package com.example.counteryquiz35;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    // 10 вопросов
    Question[] questions = {
            new Question(R.drawable.ad, R.string.ad),
            new Question(R.drawable.at, R.string.at),
            new Question(R.drawable.ae, R.string.ae),
            new Question(R.drawable.az, R.string.az),
            new Question(R.drawable.al, R.string.al),
            new Question(R.drawable.dz, R.string.dz),
            new Question(R.drawable.br, R.string.br),
            new Question(R.drawable.ru, R.string.ru),
            new Question(R.drawable.bt, R.string.bt),
            new Question(R.drawable.va, R.string.va)
    };
    /*Для того, чтобы вопросы перемешались вызовем метод .shuffle(),
    * но, данный метод можно вызывать только у коллекций, поэтому
    * превращаем массив в коллекцию*/
    List<Question> questionList = Arrays.asList(questions); // Превращаем массив в коллекцию
    int questionIndex = 0; // Индекс текущего вопроса
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        Collections.shuffle(questionList); // Перемешиваем элементы коллекции в случайном порядке
        questionList.toArray(questions); // превращаем обратно в массив
        imageView.setImageResource(questions[questionIndex].getImageResId());
        ArrayList<Button> answerButtons = new ArrayList<>();
        answerButtons.add(button1);
        answerButtons.add(button2);
        answerButtons.add(button3);
        answerButtons.add(button4);
        renderQuestion(answerButtons);
    }

    public void renderQuestion(ArrayList<Button> answerButtons){
        Collections.shuffle(answerButtons);
        for (int i = 0; i < answerButtons.size(); i++) {
            if(i == answerButtons.size()-1){
                answerButtons.get(i).setText(questions[questionIndex].getCorrectAnswer());
                answerButtons.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }else{
                answerButtons.get(i).setText(questions[random.nextInt(questions.length-1)].getCorrectAnswer());
            }
        }
    }
}