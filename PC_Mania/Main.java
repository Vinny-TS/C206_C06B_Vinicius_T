package PC_Mania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        HardwareBasico[] hb_1 = new HardwareBasico[3];
        hb_1[0] = new HardwareBasico();
        hb_1[0].nome = "Pentium Core i3";
        hb_1[0].capacidade = 2200;
        hb_1[1] = new HardwareBasico();
        hb_1[1].nome = "Memória RAM";
        hb_1[1].capacidade = 8;
        hb_1[2] = new HardwareBasico();
        hb_1[2].nome = "HD";
        hb_1[2].capacidade = 500;
        SistemaOperacional os_1 = new SistemaOperacional();
        os_1.nome = "Linux Ubuntu";
        os_1.tipo = 32;
        MemoriaUSB mu_1 = new MemoriaUSB();
        mu_1.nome = "Pen-drive";
        mu_1.capacidade = 16;
        Computador computador_1 = new Computador(os_1, hb_1);
        computador_1.marca = "Positivo";
        computador_1.preco = 3300;
        computador_1.addMemoriaUSB(mu_1);


        HardwareBasico[] hb_2 = new HardwareBasico[3];
        hb_2[0] = new HardwareBasico();
        hb_2[0].nome = "Pentium Core i5";
        hb_2[0].capacidade = 3370;
        hb_2[1] = new HardwareBasico();
        hb_2[1].nome = "Memória RAM";
        hb_2[1].capacidade = 16;
        hb_2[2] = new HardwareBasico();
        hb_2[2].nome = "HD";
        hb_2[2].capacidade = 1000;
        SistemaOperacional os_2 = new SistemaOperacional();
        os_2.nome = "Windows 8";
        os_2.tipo = 64;
        MemoriaUSB mu_2 = new MemoriaUSB();
        mu_2.nome = "Pen-drive";
        mu_2.capacidade = 32;
        Computador computador_2 = new Computador(os_2, hb_2);
        computador_2.marca = "Acer";
        computador_2.preco = 8800;
        computador_2.addMemoriaUSB(mu_2);

        HardwareBasico[] hb_3 = new HardwareBasico[3];
        hb_3[0] = new HardwareBasico();
        hb_3[0].nome = "Pentium Core i7";
        hb_3[0].capacidade = 4500;
        hb_3[1] = new HardwareBasico();
        hb_3[1].nome = "Memória RAM";
        hb_3[1].capacidade = 32;
        hb_3[2] = new HardwareBasico();
        hb_3[2].nome = "HD";
        hb_3[2].capacidade = 2000;
        SistemaOperacional os_3 = new SistemaOperacional();
        os_3.nome = "Windows 10";
        os_3.tipo = 64;
        MemoriaUSB mu_3 = new MemoriaUSB();
        mu_3.nome = "HD Externo";
        mu_3.capacidade = 1000;
        Computador computador_3 = new Computador(os_2, hb_2);
        computador_3.marca = "Vaio";
        computador_3.preco = 4800;
        computador_3.addMemoriaUSB(mu_3);

        Cliente cliente = new Cliente();

        System.out.println("Bem vindo à PCMania, vamos fazer o seu cadastro. Digite o seu nome:");
        cliente.nome = entrada.nextLine();
        System.out.println("Digite o seu cpf:");
        cliente.cpf = entrada.nextLong();

        boolean menu = true;
        int promocao;
        int nComputadores = 0;

        System.out.println("Menu");
        System.out.println("\nPromoção 1:");
        computador_1.mostraPCConfigs();
        System.out.println("\nPromoção 2:");
        computador_2.mostraPCConfigs();
        System.out.println("\nPromoção 3:");
        computador_3.mostraPCConfigs();
        while (menu){
            System.out.println("Para adicionar um computador ao carrinho, digite o código da promoção:");
            promocao = entrada.nextInt();
            switch (promocao){
                case (0):
                    System.out.println("Compra encerrada.");
                    menu = false;
                    break;
                case (1):
                    System.out.println("Promoção 1 adcionada ao carrinho!");
                    cliente.computador[nComputadores] = computador_1;
                    nComputadores += 1;
                    break;
                case (2):
                    System.out.println("Promoção 2 adcionada ao carrinho!");
                    cliente.computador[nComputadores] = computador_2;
                    nComputadores += 1;
                    break;
                case (3):
                    System.out.println("Promoção 3 adcionada ao carrinho!");
                    cliente.computador[nComputadores] = computador_3;
                    nComputadores += 1;
                    break;
                default:
                    System.out.println("Promoção Inválida");
                    break;
            }
        }
        System.out.println("Informações cliente:");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        if(nComputadores != 0){
            for (Computador computador:
                    cliente.computador) {
                if(computador != null){
                    computador.mostraPCConfigs();
                    System.out.println();
                }
            }
            System.out.println("\nO valor total do carrinho é de: R$" + cliente.calculaTotalCompra());
        }
        else {
            System.out.println("Carrinho vazio.");
        }
        entrada.close();
    }
}
