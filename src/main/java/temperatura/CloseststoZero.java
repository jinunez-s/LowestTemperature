
package temperatura;

public class CloseststoZero {
    public static void main(String[] args) {
        
        //arreglo
        int[] arreglo = {15,10,-7,-14,4,-1,3,2,20,11,1};
        
        int abs;
        int valor_referencia = Integer.MAX_VALUE;
        int valor_minimo = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            abs = Math.abs(arreglo[i]);
            if(abs < valor_referencia){
                valor_minimo = i;
                valor_referencia = abs;
            }            
        }
        if(arreglo[valor_minimo] >= 0 ){
            System.out.println("Valor menor es = " + arreglo[valor_minimo]);
            
        }else if(arreglo [valor_minimo] < 0){
            int vabs = Math.abs(arreglo[valor_minimo]);
            for (int i = 0; i < arreglo.length; i++) {
                if(vabs == arreglo[i]){
                    System.out.println("Valor menor es = " + arreglo[i]);
                }
            }
            
        }else{
            System.out.println("Valor menor es = " + arreglo[valor_minimo]);
            
        }
        
    }
}
