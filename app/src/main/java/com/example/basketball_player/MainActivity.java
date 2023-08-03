package com.example.basketball_player;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Майкл Джордан", "«Чикаго Буллз» и «Вашингтон Уизардс»",
                R.drawable.jordan, "33.4 очка в среднем за матч"));
        animals.add( new Animal("Леброн Джеймс", "«Лос-Анджелес Лейкерс»",
                R.drawable.lebron, "29,8 очка в среднем за матч"));
        animals.add( new Animal("Карим Абдул-Джаббар", "«Милуоки Бакс» и «Лос-Анджелес Лейкерс»",
                R.drawable.carim, "24,6 очков в среднем за матч"));
        animals.add( new Animal("Мэджик Джонсон", "«Лос-Анджелес Лейкерс»",
                R.drawable.magik, "19,5 очков в среднем за матч"));
        animals.add( new Animal("Коби Брайант", "«Лос-Анджелес Лейкерс»",
                R.drawable.braynt, "25 очков в среднем за матч"));
        animals.add( new Animal("Шакил О'Нил", " «Орландо Мэджик» \n" + "«Лос-Анджелес Лейкерс»\n" + "«Майами Хит»\n" + "«Финикс Санз»\n" + "«Кливленд Кавальерс»\n" + "«Бостон Селтикс»",
                R.drawable.shakil, "23,7 очков в среднем за матч"));
        animals.add( new Animal("Стефан Кари", "«Голден Стэйт Уорриорз»",
                R.drawable.karri, "31,2 очков в среднем за матч \n \n"));
    }
}