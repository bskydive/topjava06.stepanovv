package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMealWithExceed {
    protected final LocalDateTime dateTime;

    protected final String description;

    protected final int calories;

    protected final boolean exceed;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }
}

//    Реализовать UserMealsUtil.getFilteredMealsWithExceeded:
//        -  должны возвращаться только записи между startTime и endTime
//        -  поле UserMealWithExceed.exceed должно показывать,
//        превышает ли сумма калорий за весь день параметра метода caloriesPerDay
//
//        Т.е UserMealWithExceed - это запись одной еды, но поле exceeded будет одинаково для всех записей за этот день.

