package com.example;

import java.util.List;

public class Lion extends Animal {

    boolean hasMane;

    // объект predator — поле класса Lion
    private Feline feline;

    // Объект filine передаётся в конструтор. Он создан извне
    // объект попадает в переменную класса

    //объединил конструкторы
    public Lion(String sex, Feline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.feline = feline;
    }
    //метод не зависит от класса Feline
    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittensLion() {
        return feline.getKittens();
    }


    //наследовал список у класса Animal
    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }

}
