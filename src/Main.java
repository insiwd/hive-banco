import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print(ASCIIS.logo());

        System.out.println();
        Load();

        System.out.println("*#*#*#*#*#*#*#*#*#*#");
        System.out.println();

        Cliente cliente = new Cliente();

        System.out.print("Digite seu nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println("- - - - - - - ");

        Thread.sleep(1000);

        System.out.printf(ASCIIS.perfil(cliente.getNome(), cliente.getSaldo()));

        System.out.println();

        Thread.sleep(1000);

        System.out.println("*#*#*#*#*#*#*#*#*#*#");

        System.out.println();

        boolean menu = true;
        while (menu) {
            System.out.println("""
                    Operações:
                    
                    1 - Consultar néctares
                    2 - Receber néctar
                    3 - Transferir néctar
                    4 - Sair 
                    """);

            System.out.printf("Digite sua escolha (1 - 4): ");

            int escolha = sc.nextInt();

            System.out.println();
            switch (escolha) {
                case 1 -> {
                    System.out.println("O Néctar atual da abelha " + cliente.getNome() + " é: Nec$" + cliente.getSaldo());
                    System.out.println();
                }
                case 2 -> {
                    System.out.print("Néctar a receber: Nec$");
                    cliente.deposito(sc.nextDouble());
                    System.out.println();
                    System.out.println("Saldo atualizado: " + cliente.getSaldo());
                    System.out.println();
                }
                case 3 -> {
                    System.out.print("Quanto de Néctar a transferir? Nec$");
                    cliente.transferir(sc.nextDouble());
                    System.out.println();
                    System.out.println("Saldo atualizado: Nec$" + cliente.getSaldo());
                    System.out.println();
                }
                case 4 -> {
                    menu = false;
                    System.out.println("Obrigado por utilizar nossos serviços!");
                }
                default -> {
                    System.out.println("Opção inválida.");
                    System.out.println();
                }
            }
        }
    }

    public static void Load() {
        int x = 0;
        for (x = 0; x <= 100; x += 10) {

            System.out.printf("CARREGANDO: " + "%d\r", +x);
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }
}