package ru.ponomarenko.hwbasics.ui;

import java.text.DecimalFormat;

import ru.ponomarenko.hwbasics.model.Calculator;
import ru.ponomarenko.hwbasics.model.CalculatorImpl;
import ru.ponomarenko.hwbasics.model.Operator;

public class CalculatorPresenter {

    private final DecimalFormat formater = new DecimalFormat("#.##");

    private final CalculatorView view;
    private final Calculator calculator;

    private double argOne;

    private Double argTwo;

    private Operator selectedOperator;


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


    }

    /**
     * При нажатии на кнопку с числом
     */
    public void onDigitPressed(int digit) {
        if (argTwo == null) {

            argOne = argOne * 10 + digit;

            showFormatted(argOne);
        } else {
            argTwo = argTwo * 10 + digit;

            showFormatted(argTwo);

        }
    }

    /**
     * При выборе оператора
     */
    public void onOperatorPressed(Operator operator) {
        if (selectedOperator != null) {

            argOne = calculator.perform(argOne, argTwo, selectedOperator);

            showFormatted(argOne);
        }

        argTwo = 0.0;

        selectedOperator = operator;
    }


    private void showFormatted(double value) {
        view.showResult(formater.format(value));
    }

}
