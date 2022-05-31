import java.util.Scanner;

public class NumeroTelefone {

    public int numero;
    public String letras;

    public String lerExpressao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a expressão a ser convertida: ");
        String letras = scan.nextInt();
        if (letras.equals(A) ||letras.equals(B) ||letras.equals(C)){
            System.out.println("2");
            } else if (letras.equals(D) ||letras.equals(E) ||letras.equals(F)){
            System.out.println("3");
            } else if (letras.equals(G) ||letras.equals(H) ||letras.equals(I)){
            System.out.println("4");
            } else if (letras.equals(J) ||letras.equals(K) ||letras.equals(L)) {
            System.out.println("5");
            } else if (letras.equals(M) ||letras.equals(N) ||letras.equals(O)){
            System.out.println("6"); {
            } else if (letras.equals(P) ||letras.equals(Q) ||letras.equals(R) ||letras.equals(S)){
            System.out.println("7"); {
            } else if (letras.equals(T) ||letras.equals(U) ||letras.equals(V)){
            System.out.println("8"); {
            } else if (letras.equals(W) ||letras.equals(X) ||letras.equals(Y) ||||letras.equals(Z)){
            System.out.println("9");
            }
        }

    }
