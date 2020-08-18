import java.util.Scanner;
public class ejercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        var num1 = 0;  
        var num2 = 0;  
        var resul = 0 ; 
        System.out.println("Indique la operacion:\n numero 1 realiza una suma\n numero 2 realiza una resta\n numero 3 realiza una multiplicacion\n numero 4 realiza una division ");
        var op = sc.nextInt();  
        
        if(op == 1)  {  
            System.out.println("Ingresar el numero 1 ");
           num1=sc.nextInt();
           System.out.println("Ingresar el numero 2 ");
           num2=sc.nextInt();
            resul = num1 + num2;
            System.out.println("El Resultado de la suma es:" + resul);
        } else if (op == 2) {
            System.out.println("Ingresar el numero 1 ");
            num1=sc.nextInt();
            System.out.println("Ingresar el numero 2 ");
            num2=sc.nextInt();
            resul = num1 - num2;
            System.out.println("El Resultado de la Resta es:" + resul);
        } else if (op == 3) {
            System.out.println("Ingresar el numero 1 ");
           num1=sc.nextInt();
           System.out.println("Ingresar el numero 2 ");
           num2=sc.nextInt();
            resul = num1 * num2;
            System.out.println("El Resultado de la multiplicacion es:" + resul);
        } else if (op == 4) {
            System.out.println("Ingresar el numero 1 ");
            num1=sc.nextInt();
            System.out.println("Ingresar el numero 2 ");
            num2=sc.nextInt();
            if(num2 != 0 ){
             resul=num1/num2;
                System.out.println("El resultado de la division es:"+ resul);
            }
            else {
                System.out.println("el numero ingresado es incorrecto");
            }
        }
    } 
}