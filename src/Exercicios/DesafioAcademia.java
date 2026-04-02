package Exercicios;

import java.util.Scanner;

public class DesafioAcademia {
    public static void main(String[] args) {
        /* DESAFIO 3 — Sistema de Academia
 Você precisa controlar os alunos de uma academia.

 O sistema deve:
 - Cadastrar aluno
 - Registrar peso do aluno
 - Listar alunos
 - Mostrar média de peso da academia
 - Mostrar aluno mais pesado
 - Sair

 Regras:
 - String[] alunos
 - double[] pesos
 - Use for para calcular a média.
 - Use variável acumuladora (soma += peso)
 - Média = soma / quantidade cadastrada
 - Use if para impedir cálculo se não houver alunos.

 Esse desafio trabalha:
 - Acumuladores
 - Controle de quantidade real cadastrada
 - Comparação dentro de arrays */

        Scanner scan = new Scanner(System.in);
        String[] alunos = new String[5];
        double[] pesos = new double[5];
        int qtdAlunos = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 5) {
            System.out.println("---------- MENU -----------");
            System.out.println("1 - Cadastrar ALUNO");
            System.out.println("2 - Listar ALUNOS");
            System.out.println("3 - Média de peso da academia");
            System.out.println("4 - Aluno mais pesado da academia");
            System.out.println("5 - Sair");

            System.out.print("Informe a opção que deseja executar: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenu) {
                case 1:
                    if (qtdAlunos == alunos.length) {
                        System.out.println("O banco de dados está cheio.");
                        System.out.println("Favor liberar mais memória.");
                    } else {
                        System.out.println("---------- CADASTRO DE ALUNOS -----------");
                        System.out.print("Nome do aluno: ");
                        alunos[qtdAlunos] = scan.nextLine();
                        System.out.print("Peso do aluno: ");
                        pesos[qtdAlunos] = scan.nextDouble();
                        qtdAlunos++;

                        System.out.println("Aluno matriculado com sucesso.");
                    }
                    break;
                case 2:
                    if (qtdAlunos == 0) {
                        System.out.println("Não há alunos matriculados ainda...");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- LISTAGEM DE ALUNOS -----------");
                        for (int i = 0; i < qtdAlunos; i++) {
                            System.out.println("ALUNO - " + (i + 1));
                            System.out.println("Aluno: " + alunos[i]);
                            System.out.println("Peso do aluno: " + pesos[i] + "kg");
                            System.out.println("-----------------------------------------");
                        }
                    }
                    break;
                case 3:
                    if (qtdAlunos == 0) {
                        System.out.println("Não há alunos matriculados ainda...");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- MÉDIA GERAL DE PESOS -----------");
                        double pesoTotal = 0;
                        for (int i = 0; i < qtdAlunos; i++) {
                            pesoTotal += pesos[i];
                        }
                        double media = pesoTotal / qtdAlunos;
                        System.out.println("A média geral de PESOS da academia é: " + media + " kg.");
                    }
                    break;
                case 4:
                    if (qtdAlunos == 0) {
                        System.out.println("Não há alunos matriculados ainda...");
                        System.out.println("Voltando ao menu...");
                    } else if (qtdAlunos == 1) {
                        System.out.println("---------- MAIOR PESO DA ACADEMIA -----------");
                        System.out.println("O maior PESO da academia é do único aluno: ");
                        System.out.println("Aluno: " + alunos[0]);
                        System.out.println("Peso: " + pesos[0]);
                    } else {
                        System.out.println("---------- MAIOR PESO DA ACADEMIA -----------");
                        int pesoMaior = 0;
                        for (int i = 1; i < qtdAlunos; i++) {
                            if (pesos[i] > pesos[pesoMaior]) {
                                pesoMaior = i;
                            }
                        }
                        System.out.println("Aluno: " + alunos[pesoMaior]);
                        System.out.println("Peso: " + pesos[pesoMaior]+" kg");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando programa...");
                    break;

            }
        }

    }
}
