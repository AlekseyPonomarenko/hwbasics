package ru.ponomarenko.hwbasics.ui;

import ru.ponomarenko.hwbasics.model.CalculatorImpl;

public class CalculatorPresenter {

    private final CalculatorView view; //главная view
    private final CalculatorImpl calculator; //управляющий объект

    /**
     * Конструктор
     * @param view  в которую будет выводиться результат
     * @param calculator управляющий объект
     */
    public CalculatorPresenter(CalculatorView view, CalculatorImpl calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    /**
     * При нажати на кнопку "."
     */
    public void onDotPressed() {

        showResult();

    }

    /**
     * При нажатии на кнопку с числом
     */
    public void onDigitPressed() {
        showResult();
    }

    /**
     * При выборе оператора
     */
    public void onOperatorPressed() {
        showResult();
    }

    /**
     * Отразить результат
     */
    private void showResult(){

        view.showResult("Hello");

    }

}
