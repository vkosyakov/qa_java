package com.example;

import java.util.List;

// общий интерфейс Predator, который будут имплементировать Feline
public interface Predator {

    List<String> eatMeat() throws Exception;
     int getKittens();


}
