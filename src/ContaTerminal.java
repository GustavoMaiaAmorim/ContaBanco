import java.util.Scanner;


public class ContaTerminal {  
    public static void main(String[] args) {
        
        //Criando objeto scanner para recebr as informações no terminal
        Scanner sc = new Scanner(System.in);

        //declarando variáveis/atributos
        String agencia;
        String nomeCliente;
        int numero;
        float saldo;
       

        //Enviando e recebendo dados do terminal
        System.out.println("Por favor, digite o numero da agencia:");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome:");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o numero:");
        numero = sc.nextInt();
       
        System.out.println("Por favor, digite o saldo:");
        saldo = sc.nextFloat();

        sc.close();
        
        //Enviando mensagem final ao usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo R$: " + saldo  + " já está disponível para saque.");
 
        
       
    }
}
