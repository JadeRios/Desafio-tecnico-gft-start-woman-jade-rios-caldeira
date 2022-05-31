import java.util.Scanner;

public class Triangulo {

    public int ladoA;
    public int ladoB;
    public int ladoC;

    public Triangulo(int a, int b, int c) {
        ladoA = a;
        ladoB = b;
        ladoC = c;
    }

    public void classificarTriangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triângulo: ");
        int ladoA = scan.nextInt();
        System.out.println("Digite o segundo lado do triângulo: ");
        int ladoB = scan.nextInt();
        System.out.println("Digite o terceiro lado do triângulo: ");
        int ladoC = scan.nextInt();

        if (ladoA < ladoB + ladoC || ladoB < ladoA + ladoC || ladoC < ladoA + ladoB){
            System.out.println("Não é possível formar um triângulo");
        }else if( ladoA == ladoB && ladoB == ladoC){
            System.out.println("Triângulo equilátero");
        } else if (ladoA != ladoB && ladoB != ladoC && ladoA!=ladoC) {
            System.out.println("Triângulo escaleno");
        }else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
            System.out.println("Triângulo isosceles");
        }
    }




}
