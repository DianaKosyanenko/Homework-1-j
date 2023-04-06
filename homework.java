import java.util.Scanner;

/**
 * homework
 */
public class homework {
        


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int i = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Facrorial(i));
        scanner.close();
    }

    public static int Facrorial(int a) {
        return (a * (a + 1)) / 2;
        
   
        }
        
    }
