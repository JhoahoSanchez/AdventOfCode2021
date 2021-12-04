
package Day3;


public class Day3Puzzle2 {
    
    public static String [] data1 = new String [1000];
    public static String [] data2 = new String [1000];
    
    public static int auxCount =0;
    
    
    public static int countNumbers(){
        int [] finalData = new int [2];
        for(int i=0; i<1000; i++){
 
            if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==1){
                finalData[0] = finalData[0]+1;
            }else{
                finalData[1] = finalData[1]+1;
            }
        }
        
        if(finalData[0]>finalData[1]){
            int j=0;
            for(int i =0; i<1000; i++){
                if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==1){
                    data1[j] = FilesDay3.data[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }else if(finalData[0]<finalData[1]){
            int j=0;
            for(int i =0; i<1000; i++){
                if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==0){
                    data1[j] = FilesDay3.data[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }else{
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }
    }
    
    public static int countNumbersAlpha( int position){
        int [] finalData = new int [2];

        
        for(int i=0; i<Day3Puzzle2.auxCount; i++){
 
            if(Character.getNumericValue(data1[i].charAt(position))==1){
                finalData[0] = finalData[0]+1;
                
            }else{
                finalData[1] = finalData[1]+1;
                
            }
        }

        if(finalData[0]>finalData[1]){
            int j=0;
            for(int i =0; i<finalData[0]; i++){
                if(Character.getNumericValue(data1[i].charAt(position))==1){
                    data1[j] = data1[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }else if(finalData[0]<finalData[1]){
            int j=0;
            for(int i =0; i<finalData[0]; i++){
                if(Character.getNumericValue(data1[i].charAt(position))==0){
                    data1[j] = data1[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }else{
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }
    }
    
    public static int countNumbersEvil(){
        int [] finalData = new int [2];
        for(int i=0; i<1000; i++){
 
            if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==1){
                finalData[0] = finalData[0]+1;
            }else{
                finalData[1] = finalData[1]+1;
            }
        }
        
        if(finalData[0]>finalData[1]){
            int j=0;
            for(int i =0; i<1000; i++){
                if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==0){
                    data2[j] = FilesDay3.data[i];
                    j++;
                }
            }
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }else if(finalData[0]<finalData[1]){
            int j=0;
            for(int i =0; i<1000; i++){
                if(Character.getNumericValue(FilesDay3.data[i].charAt(0))==1){
                    data2[j] = FilesDay3.data[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }else{
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }
    }
    
    public static int countNumbersAlphaEvil( int position){
        int [] finalData = new int [2];

        
        for(int i=0; i<Day3Puzzle2.auxCount; i++){
 
            if(Character.getNumericValue(data2[i].charAt(position))==1){
                finalData[0] = finalData[0]+1;
                
            }else{
                finalData[1] = finalData[1]+1;
                
            }
        }

        if(finalData[0]>finalData[1]){
            int j=0;
            for(int i =0; i<finalData[1]; i++){
                if(Character.getNumericValue(data2[i].charAt(position))==0){
                    data2[j] = data2[i];
                    j++;
                }
            }
            
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }else if(finalData[0]<finalData[1]){
            int j=0;
            for(int i =0; i<finalData[0]; i++){
                if(Character.getNumericValue(data2[i].charAt(position))==1){
                    data2[j] = data2[i];
                    j++;
                }
            }
            Day3Puzzle2.auxCount = finalData[0];
            return 1;
        }else{
            Day3Puzzle2.auxCount = finalData[1];
            return 0;
        }
    }
    
    
    
    public static void main(String [] args){
        
        FilesDay3.loadTXT("C:\\Users\\jhoaho\\Desktop\\Programacion Java\\Nuevos programas\\AdventOfCode2021\\src\\Day3\\Day3Text.txt");
        int [] auxiliar = new int [12];
        
        
        auxiliar[0] = Day3Puzzle2.countNumbers();
        String a=""+auxiliar[0];
        
        for(int i=1; i<12;i++){
            auxiliar[i] = Day3Puzzle2.countNumbersAlpha(i);
            a=a+auxiliar[i];
        }
        
        System.out.println("a: "+a);
        System.out.println("a2: "+Day3Puzzle2.data1[0]);
        
        
        int [] auxiliar2 = new int [12];
        
        
        auxiliar2[0] = Day3Puzzle2.countNumbersEvil();
        String b=""+auxiliar2[0];
        
        for(int i=1; i<12;i++){
            auxiliar2[i] = Day3Puzzle2.countNumbersAlphaEvil(i);
            b=b+auxiliar2[i];
        }
        System.out.println("b: "+b);
        System.out.println("b2: "+Day3Puzzle2.data2[0]);
        
        System.out.println("multiplication: "+(Integer.parseInt(a,2)*Integer.parseInt(Day3Puzzle2.data2[0],2)));
    }
}
