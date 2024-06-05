import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados pelo terminal
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome e sobrenome:");
        String nomeSobrenome = scanner.nextLine();
        
        System.out.println("Por favor, digite sua Agência no formato XXX-X:");
        String agencia = scanner.next();
        
        System.out.println("Por gentileza, digite o Número de sua Conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Agora, digite seu Saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem da Conta Criada
        System.out.println("Olá, " + nomeSobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
