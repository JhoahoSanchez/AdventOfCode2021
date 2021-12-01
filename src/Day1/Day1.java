
package Day1;

public class Day1 {
    
    public static void main(String [] args) {
        
        
        Files.loadTXT("C:\\Users\\jhoaho\\Desktop\\Programacion Java\\Nuevos programas\\AdventOfCode2021\\src\\Day1\\Day1.txt");
        int auxiliar=0;
        
        for(int i=1; i<Files.aux; i++){
            if(Files.data[i]>Files.data[i-1]){
                auxiliar=auxiliar+1;
            }
        }
            
        System.out.println("Times increased: " + auxiliar);
    }

}
