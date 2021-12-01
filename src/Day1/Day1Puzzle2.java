package Day1;

public class Day1Puzzle2 {

    public static void main(String[] args) {

        Files.loadTXT("C:\\Users\\jhoaho\\Desktop\\Programacion Java\\Nuevos programas\\AdventOfCode2021\\src\\Day1\\Day1.txt");
        int auxiliar = 0;
        int[] newArray = new int[1998];

        for (int i = 0; i < 1998; i++) {

            newArray[i] = Files.data[i] + Files.data[i + 1] + Files.data[i + 2];
        }

        for (int i = 1; i < newArray.length; i++) {

            if (newArray[i] > newArray[i - 1]) {
                auxiliar = auxiliar + 1;
            }
        }
        System.out.println("Times increased: " + auxiliar);
    }

}
