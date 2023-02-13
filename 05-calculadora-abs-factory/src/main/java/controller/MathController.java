/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import factory.MathFactory;
import model.MathOperation;
import view.MathView;

public class MathController {
    private MathFactory mathFactory;
    private MathView mathView;

    public MathController(MathFactory mathFactory) {
        this.mathFactory = mathFactory;
        this.mathView = new MathView();
    }

    public void performMathOperation(float a, float b) {
        MathOperation mathOperation = mathFactory.createMathOperation();
        float result = mathOperation.perform(a, b);
        mathView.showResult(result);
    }
}