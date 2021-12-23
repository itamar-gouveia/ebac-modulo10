import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        double n1,n2,n3,n4,nf;

        System.out.print("Informe a primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        n2 = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        n3 = scanner.nextDouble();
        System.out.print("Informe a quarta nota: ");
        n4 = scanner.nextDouble();
        
        nf = (n1+n2+n3+n4)/4.0;
        System.out.println("Sua média final foi "+ nf);
        if (nf >=7 ){
            System.out.println("Aprovado!!!!");
        }else if(nf>=5 && nf < 7){
            System.out.println("Recuperação!!!!");
        }else if (nf <5){
            System.out.println("Reprovado!!!!");
        }
        scanner.close();
    }
}
