/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import factory.MathFactory;
import model.MathOperation;
import view.MathView;

public class MathController {
    private MathOperation mathOperation;
    private MathView mathView;

    public MathController(MathFactory mathFactory) {
        mathOperation = mathFactory.createMathOperation();
        mathView = new MathView();
    }

    public void performMathOperation(int a, int b) {
        int result = mathOperation.perform(a, b);
        mathView.displayResult(result);
    }
}
