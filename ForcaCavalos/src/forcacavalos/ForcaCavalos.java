package forcacavalos;
import java.util.Scanner;

public class ForcaCavalos {

    public static void main(String[] args) {
        // Declaração de variáveis
        double massa, altura, segundos, qtCavalos;
        //Teclado
        Scanner teclado = new Scanner(System.in);
        
        //
        System.out.println("Vamos decsobrir quantos cavalos serão necessários para levantar determinada massa.");
        System.out.println("Digite a quantidade de peso em KG(quilogramas) que você deseja levantar:");
        massa = teclado.nextDouble();
        System.out.println("Digite agora a altura, em M(metros):");
        altura = teclado.nextDouble();
        System.out.println("E em quanto tempo, em s(segundos)?:");
        segundos = teclado.nextDouble();
        qtCavalos = (massa*altura/segundos)/ 745.699;
        System.out.println("A quantidade de cavalos necessária para levantar esse peso é de " +qtCavalos+" cavalos");
        
        
    }
    
}
