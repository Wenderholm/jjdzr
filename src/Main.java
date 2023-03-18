import java.io.*;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("dodano test");
        Dog dog = new Dog("burek");
        System.out.println(dog.getName());

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int number = numbers[2];
        System.out.println(number);
        try {
            int number15 = numbers[15];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tablica nie posiada takiego dużego indeksu");
        }

        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("podaj liczbę całkowita");
//            try {
//                scanner.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("podana liczba nie jest całkowita. Spróbuj poniwnie");
//                scanner.nextLine();
//            }
//        }

// odczytywanie z pliku
        InputStream inputStream = new FileInputStream("tekst.txt");
        StringBuilder resultStringBuilder = new StringBuilder();
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputStream));


//  zapisywanie do pliku
        String file1 = scanner.nextLine();
        String text = scanner.nextLine();
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file1));
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}