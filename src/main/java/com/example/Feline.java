package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {


    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    //наследовали и переопределилт метод у класса Animal
    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    // метод выдыет количество потомства, имплементирован у интерфейса Predator
    @Override
    public int getKittens() {

        return getKittens(1);
    }

    public int getKittens(int kittensCount) {

        return kittensCount;
    }

}
