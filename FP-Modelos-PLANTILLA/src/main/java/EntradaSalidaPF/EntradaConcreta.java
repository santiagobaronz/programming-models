package EntradaSalidaPF;

import java.util.Scanner;

public class EntradaConcreta extends EntradaAbstracta{

    @Override
    public int entrada() {
        
        Scanner sc = new Scanner(System.in);
        int entero = sc.nextInt();
        
        return entero;
        
    }
    
    
}
