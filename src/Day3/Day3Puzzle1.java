
package Day3;

public class Day3Puzzle1 {
    
    
    public static int countNumbers(int position){
        int [] finalData = new int [2];
         for(int i=0; i<1000; i++){
 
            if(Character.getNumericValue(FilesDay3.data[i].charAt(position))==1){
                finalData[0] = finalData[0]+1;
            }else{
                finalData[1] = finalData[1]+1;
            }
        }
        
        if(finalData[0]>finalData[1]){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static String callCountNumbers(){
        String j="";
        for(int i=0; i<12;i++){
            j=j+countNumbers(i);
        }
        return j;
    }
    
    public static int countNumbers2(int position){
        int [] finalData = new int [2];
         for(int i=0; i<1000; i++){
 
            if(Character.getNumericValue(FilesDay3.data[i].charAt(position))==1){
                finalData[0] = finalData[0]+1;
            }else{
                finalData[1] = finalData[1]+1;
            }
        }
        
        if(finalData[0]<finalData[1]){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static String callCountNumbers2(){
        String j="";
        for(int i=0; i<12;i++){
            j=j+countNumbers2(i);
        }
        return j;
    }
    
    public static void main(String [] args){
        
        FilesDay3.loadTXT("C:\\Users\\jhoaho\\Desktop\\Programacion Java\\Nuevos programas\\AdventOfCode2021\\src\\Day3\\Day3Text.txt");
        
        int i = Integer.parseInt(Day3Puzzle1.callCountNumbers(),2);
        int y = Integer.parseInt(Day3Puzzle1.callCountNumbers2(),2);
        
        System.out.println("Multiplication: "+(i*y));
    }
}

