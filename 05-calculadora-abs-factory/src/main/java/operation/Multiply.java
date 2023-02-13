/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operation;
import model.MathOperation;

public class Multiply implements MathOperation {
    @Override
    public float perform(float a, float b) {
        return a * b;
    }
}