import java.util.Scanner;

public class calculator {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double num1 = scanner.nextDouble();
        System.out.println("Введите знак");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        double num2 = scanner.nextDouble();
        if (operation == '+'){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (operation == '/'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 / num2));
        }
        else if (operation == '*'){
            System.out.println(num1 + " - " + num2 + " = " + (num1 * num2));
        }
        else{
                System.out.println("Error");
        }
    }
}

        


  
    

