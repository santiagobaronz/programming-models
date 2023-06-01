package EntradaSalidaPF;

import java.util.Scanner;

public class EntradaConcreta extends EntradaAbstracta{

    @Override
    public int entrada() {
        
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        
        return num_1;
        
    }
    
    
}
