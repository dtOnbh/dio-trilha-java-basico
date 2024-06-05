import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e imnportar a classe Scanner
        //Exibir as msg para o uruario
        //Obter pela classe scanner os valores digitados pelo terminal
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e sobrenome");
        String nomeSobrenome = scanner.next();
        
        System.out.println("Por favor, digite sua Agência no formato XXX-X");
        String agencia = scanner.next();

        System.out.println("Por gentileza, digite o Numero de sua Conta");
        int numero = scanner.nextInt();

        System.out.println("Agora Digite seu Saldo");
        double saldo = scanner.nextInt();
        
        
        //Exibir a mensagem da Conta Criada
        System.out.println("Ola," + nomeSobrenome +  ",Obrigado por criar uma conta em nosso banco,");
        System.out.println(" Sua agência é" + agencia + "conta" + numero + "e seu saldo "+ saldo +" ja esta disponível para saque.");
        
        
    }
}
