import java.util.Scanner;
public class Comparativa {
    public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    var num1= sc.nextInt();
    System.out.println("Ingrese el segundo numero");
    var num2= sc.nextInt();

    if (num1>num2){
        System.out.println("el numero mayor es:"+num1);
    }else if(num1==num2){
        System.out.println("los numeros son iguales ");
    } else 
    System.out.println("el numero mayor es:"+num2);

 }
 
}