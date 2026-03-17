import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Equipment e1 = null;
        Equipment e2 = null;

        int option;

        do {
            System.out.println("\n-- MENU --");
            System.out.println("1) Criar AudioVisualEquipment");
            System.out.println("2) Criar ComputingEquipment");
            System.out.println("3) Criar Laptop");
            System.out.println("4) Criar Desktop");
            System.out.println("5) Comparar dois equipamentos");
            System.out.println("0) Sair");

            option = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (option) {
                case 1:
                    e1 = criarAudioVisual();
                    mostrarInfo(e1);
                    break;

                case 2:
                    e1 = criarComputing();
                    mostrarInfo(e1);
                    break;

                case 3:
                    e1 = criarLaptop();
                    mostrarInfo(e1);
                    break;

                case 4:
                    e1 = criarDesktop();
                    mostrarInfo(e1);
                    break;

                case 5:
                    System.out.println("Criar primeiro equipamento:");
                    e1 = criarGenerico();

                    System.out.println("Criar segundo equipamento:");
                    e2 = criarGenerico();

                    System.out.println("Sao iguais? " + e1.equals(e2));
                    break;

                case 0:
                    System.out.println("A sair.");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }

        } while (option != 0);
    }

    // auxiliares

    public static void mostrarInfo(Equipment e) {
        System.out.println("\n- EQUIPAMENTO CRIADO -");
        System.out.println(e.toString());
        System.out.println("Tipo: " + e.getEquipmentType());
        System.out.println("Seguro: " + e.calculateInsurance());
    }

    public static Equipment criarGenerico() {
        System.out.println("Escolha tipo (1-AV, 2-Computing, 3-Laptop): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        switch (tipo) {
            case 1: return criarAudioVisual();
            case 2: return criarComputing();
            case 3: return criarLaptop();
            default: return null;
        }
    }

    public static AudioVisualEquipment criarAudioVisual() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço diário: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Resolução: ");
        String resolution = sc.nextLine();

        System.out.print("É smart (true/false): ");
        boolean isSmart = sc.nextBoolean();
        sc.nextLine();

        return new AudioVisualEquipment(id, name, price, resolution, isSmart);
    }

    public static ComputingEquipment criarComputing() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço diário: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Processador: ");
        String processor = sc.nextLine();

        return new ComputingEquipment(id, name, price, processor);
    }

    public static Laptop criarLaptop() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço diário: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Processador: ");
        String processor = sc.nextLine();

        System.out.print("Bateria (horas): ");
        int battery = sc.nextInt();

        System.out.print("Peso (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();

        return new Laptop(id, name, price, processor, battery, weight);
    }


    public static ComputingEquipment criarDesktop() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço diário: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Processador: ");
        String processor = sc.nextLine();

        return new ComputingEquipment(id, name, price, processor);
    }
}