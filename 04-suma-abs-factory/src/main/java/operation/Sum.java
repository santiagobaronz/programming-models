/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operation;
import model.MathOperation;

public class Sum implements MathOperation {
    @Override
    public int perform(int a, int b) {
        return a + b;
    }
}