import java.util.Scanner;
public class Endereco {
    public static void main(String[] args) {
        System.out.println("----CADASTRO DE USUÁRIOS----");


        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        
        System.out.print("Insira a rua: ");
        String rua = scanner.nextLine();
        
        System.out.print("Digite o numero da sua residencia: ");
        String numero = scanner.nextLine();
        
        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();
        
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
    
        System.out.print("Digite a estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();

        System.out.println("Nome completo: "+ nome);
        System.out.println("Endereço: " + rua);
        System.out.print("Endereço: " + rua + " , " + numero + " - " + bairro + " , " + cidade + " - " + estado);
        System.out.println("CEP: " +cep);
    }
}
