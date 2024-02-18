package com.example;

import java.util.List;

public class Lion extends Animal {

    boolean hasMane;

    // объект predator — поле класса Lion
    private Predator predator;

    // Объект filine передаётся в конструтор. Он создан извне
    // объект попадает в переменную класса
    public Lion(Predator predator){
        this.predator = predator;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
    //метод не зависит от класса Feline
    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittensLion() {
        // объект интерфейса predator используют, чтобы узнать кол-во потомства
        return predator.getKittens();
    }


    //наследовал список у класса Animal
    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }

}
