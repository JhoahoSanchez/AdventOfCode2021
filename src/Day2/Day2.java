package Day2;

public class Day2 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int aux = 0;

        FilesForStrings.loadTXT("C:\\Users\\jhoaho\\Desktop\\Programacion Java\\Nuevos programas\\AdventOfCode2021\\src\\Day2\\Day2.txt");

        for (int i = 0; i < 1000; i++) {
            String[] parts = FilesForStrings.data[i].split(" ");

            if (parts[0].equals("forward")) {
                aux = Integer.parseInt(parts[1]);
                x = x + aux;

            } else if (parts[0].equals("down")) {
                aux = Integer.parseInt(parts[1]);
                y = y + aux;
            } else if (parts[0].equals("up")) {
                aux = Integer.parseInt(parts[1]);
                y = y - aux;
            }
        }

        System.out.println("Multiplicacion x*y : " + (x * y));

    }
}
