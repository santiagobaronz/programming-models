/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import model.MathOperation;
import operation.Sum;

public class SumFactory implements MathFactory {
    @Override
    public MathOperation createMathOperation() {
        return new Sum();
    }
}
