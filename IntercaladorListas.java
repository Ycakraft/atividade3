import java.util.LinkedList;

public class IntercaladorListas {
    
    public static LinkedList<Integer> intercalarListasOrdenadas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        
        int i = 0;
        int j = 0; 
        
        
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }
        
       
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        
        
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
     
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);
        
        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);
        lista2.add(10);
        
        
        LinkedList<Integer> resultado = intercalarListasOrdenadas(lista1, lista2);
        

System.out.println("Lista intercalada e ordenada:");
StringBuilder sb = new StringBuilder();
for (int num : resultado) {
    sb.append(num).append(" ");
}
System.out.println(sb.toString().trim());

        }
    }
