import java.util.ArrayList;
import java.util.List;

public class ServidoresSobrecarregados {
    
    public static int diasParaEstabilidade(List<Integer> cargas) {
        int dias = 0;
        boolean servidoresRemovidos;
        
        do {
            servidoresRemovidos = false;
            List<Integer> indicesParaRemover = new ArrayList<>();
            
           
            for (int i = 1; i < cargas.size(); i++) {
                if (cargas.get(i) > cargas.get(i-1)) {
                    indicesParaRemover.add(i);
                }
            }
            
            
            if (!indicesParaRemover.isEmpty()) {
                servidoresRemovidos = true;
                dias++;
                
                
                indicesParaRemover.sort((a, b) -> b - a);
                
                for (int index : indicesParaRemover) {
                    cargas.remove(index);
                }
            }
            
        } while (servidoresRemovidos);
        
        return dias;
    }
    
    public static void main(String[] args) {
        
        List<Integer> cargas = new ArrayList<>();
        cargas.add(30);
        cargas.add(25);
        cargas.add(40);
        cargas.add(20);
        cargas.add(35);
        cargas.add(50);
        cargas.add(45);
        
        System.out.println("Dias para a estabilidade: " + diasParaEstabilidade(cargas)); 
    }
}