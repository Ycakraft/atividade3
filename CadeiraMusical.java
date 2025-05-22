import java.util.LinkedList;
import java.util.Queue;

public class CadeiraMusical {
    
    public static int vencedorCadeiraMusical(int n, int k) {
        
        Queue<Integer> participantes = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            participantes.add(i);
        }
        
        
        while (participantes.size() > 1) {
            
            for (int i = 1; i < k; i++) {
                participantes.add(participantes.remove());
            }
           
            participantes.remove();
        }
        
        
        return participantes.peek();
    }
    
    public static void main(String[] args) {
        
        int n = 7;  
        int k = 3; 
        
        int vencedor = vencedorCadeiraMusical(n, k);
        System.out.println("O vencedor é o participante número: " + vencedor);
    }
}
