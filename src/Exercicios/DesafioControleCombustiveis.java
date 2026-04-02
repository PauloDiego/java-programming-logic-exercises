package Exercicios;

import java.util.Scanner;

public class DesafioControleCombustiveis {
    public static void main(String[] args) {
        /*Desafio - Controle de Combustível de Naves Espaciais

        Você trabalha para uma frota interplanetária.

        Crie um sistema que permita:

        - Registrar o nome da nave
        - Registrar a quantidade de combustível (double)
                - Listar todas as naves
                - Mostrar qual nave tem mais combustível
                - Encerrar o sistema

        Regras Técnicas:

        - Use arrays simples.
        - Use um contador para controlar posições.
                - Para descobrir a nave com mais combustível, use um for comparando valores.
        - Use if para verificar se existem naves cadastradas antes de buscar a maior.

                Desafio mental:

        Descobrir o maior valor num array é uma habilidade fundamental.
        Isso é a base de algoritmos de ordenação e busca.
        Você está treinando seu cérebro para pensar como máquina.*/

        Scanner scan = new Scanner(System.in);
        String[] naves = new String[10];
        double[] combustivel = new double[10];

        int qtdNaves = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 4) {
            System.out.println("---------- MENU -----------");
            System.out.println("1 - Cadastrar NAVE");
            System.out.println("2 - Listar NAVES");
            System.out.println("3 - NAVE COM MAIS COMBUSTÍVEL!");
            System.out.println("4 - Sair");

            System.out.print("Informe a opção que deseja executar: ");
            opcaoMenu = scan.nextInt();

            switch (opcaoMenu) {
                case 1:
                    if (qtdNaves == naves.length) {
                        System.out.println("O banco de dados do castrado de NAVES está CHEIO!");
                        System.out.println("Favor liberar mais memória.");
                    } else {
                        System.out.println("---------- CADASTRO -----------");
                        System.out.print("Nome da nave: ");
                        naves[qtdNaves] = scan.next();
                        System.out.print("Combustível restante: ");
                        combustivel[qtdNaves] = scan.nextDouble();
                        System.out.println("Nave cadastrada com sucesso!");
                        qtdNaves++;
                    }
                    break;
                case 2:
                    if (qtdNaves == 0) {
                        System.out.println("Não há naves castradas ainda.");
                        System.out.println("Voltando ao menu...");
                        break;
                    } else {
                        for (int i = 0; i < qtdNaves; i++) {
                            System.out.println("NAVE - " + (i + 1));
                            System.out.println("- Nome: " + naves[i]);
                            System.out.println("- Combustível restante: " + combustivel[i] + "L");
                        }
                    }
                    break;
                case 3:
                    if (qtdNaves == 0) {
                        System.out.println("Não há naves cadastradas ainda.");
                        System.out.println("Voltando ao menu...");
                    } else {
                        int maiorCombustivel = 0;
                        for (int i = 1; i < qtdNaves; i++) {
                            if (combustivel[i] > combustivel[maiorCombustivel]) {
                                maiorCombustivel = i;
                            }
                        }
                        System.out.println("----- NAVE COM MAIOR COMBUSTÍVEL -----");
                        System.out.println("Nave: " + naves[maiorCombustivel] + " - " + combustivel[maiorCombustivel] + "L restantes.");
                        System.out.println("Voltando ao menu...");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
