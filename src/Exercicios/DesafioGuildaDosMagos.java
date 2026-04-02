package Exercicios;

import java.util.Scanner;

public class DesafioGuildaDosMagos {
    public static void main(String[] args) {
        /*DESAFIO — Sistema da Guilda dos Magos
        Você foi contratado pela Guilda Arcana para gerenciar o registro de magos iniciantes.
        Sua missão é criar um sistema em Java que permita:
        - Cadastrar o nome de um mago
        - Cadastrar o nível do mago (int)
        - Listar todos os magos cadastrados
        - Mostrar apenas os magos acima do nível 5
        - Encerrar o sistema

        Regras Técnicas
        Use dois arrays:
        - String[] nomes
        - int[] niveis
        - Use switch para o menu.
        - Use while para manter o sistema rodando.
        - Use for para listar os magos.

        Use if para:
        - validar espaço disponível
        - filtrar magos acima do nível 5

        Desafio extra:
        Se o array estiver cheio, exiba:
        "A guilda atingiu o limite de aprendizes."*/

        Scanner scan = new Scanner(System.in);

        String[] magos = new String[10];
        int[] niveisDosMagos = new int[10];
        int qtdMagos = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 4) {
            System.out.println("--------- MENU ---------");
            System.out.println("1 - Cadastrar Mago");
            System.out.println("2 - Listar Magos");
            System.out.println("3 - Listar magos level 5+");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma ação: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenu) {
                case 1:
                    if (qtdMagos == magos.length) {
                        System.out.println("A guilda atingiu o limite de aprendizes.");
                    } else {
                        System.out.println("--------- CADASTRO DE MAGOS ---------");
                        System.out.print("Digite o nome do mago: ");
                        magos[qtdMagos] = scan.nextLine();
                        System.out.print("Digite o nível do mago: ");
                        niveisDosMagos[qtdMagos] = scan.nextInt();

                        System.out.println("Mago cadastrado com SUCESSO na guilda!");
                        System.out.println("Voltando ao MENU...");
                        qtdMagos++;
                    }
                    break;

                case 2:
                    System.out.println("--------- LISTAGEM DE MAGOS ---------");
                    if (qtdMagos == 0) {
                        System.out.println("Nenhum mago foi cadastrado ainda.");
                    } else {
                        for (int i = 0; i < qtdMagos; i++) {
                            System.out.println("-------------------------------------");
                            System.out.println("Nome: " + magos[i]);
                            System.out.println("Nível: " + niveisDosMagos[i]);
                            System.out.println("-------------------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("---- LISTAGEM DE MAGOS LEVEL 5++ ----");
                    if (qtdMagos == 0) {
                        System.out.println("Nenhum mago foi cadastrado ainda.");
                    } else {
                        for (int i = 0; i < qtdMagos; i++) {
                            if (niveisDosMagos[i] > 5) {
                                System.out.println("-------------------------------------");
                                System.out.println("Nome: " + magos[i]);
                                System.out.println("Nível: " + niveisDosMagos[i]);
                                System.out.println("-------------------------------------");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    System.out.println("Favor escolha uma opção do MENU.");
                    break;
            }
        }
    }
}
