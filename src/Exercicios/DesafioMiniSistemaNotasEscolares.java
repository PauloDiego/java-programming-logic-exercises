package Exercicios;

import java.util.Scanner;

public class DesafioMiniSistemaNotasEscolares {
    public static void main(String[] args) {

        /*
 DESAFIO 5 — Mini Sistema de Notas Escolares

 O sistema deve permitir:

 - Cadastrar nome do aluno
 - Cadastrar nota
 - Listar alunos
 - Mostrar alunos aprovados (nota >= 7)
 - Mostrar maior nota da turma
 - Encerrar

 Aqui você combina:

 - Filtro
 - Busca por maior valor
 - Controle de fluxo
 - Estrutura repetitiva
*/

        Scanner scan = new Scanner(System.in);
        String[] alunos = new String[5];
        double[] notas = new double[5];
        int qtdAlunos = 0;
        int opcaoMenu = 0;

        while (opcaoMenu != 5) {
            System.out.println("---------- MENU -----------");
            System.out.println("1 - Cadastrar ALUNO");
            System.out.println("2 - Listar ALUNOS");
            System.out.println("3 - Alunos APROVADOS( nota >= 7)");
            System.out.println("4 - MAIOR nota da turma");
            System.out.println("5 - Sair");

            System.out.print("Informe a opção que deseja executar: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenu){
                case 1:
                    if (qtdAlunos == alunos.length) {
                        System.out.println("O número MÁXIMO de alunos cadastrados foi atingido.");
                        System.out.println("Favor liberar mais memória.");
                    } else {
                        System.out.println("---------- CADASTRO DE ALUNOS -----------");
                        System.out.print("Nome do aluno: ");
                        alunos[qtdAlunos] = scan.nextLine();
                        System.out.print("Nota do aluno: ");
                        notas[qtdAlunos] = scan.nextInt();
                        qtdAlunos++;

                        System.out.println("Aluno cadastrado com sucesso.");
                    }
                    break;
                case 2:
                    if (qtdAlunos == 0) {
                        System.out.println("Não há ALUNOS cadastrados ainda.");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- LISTAGEM DE ALUNOS -----------");
                        for (int i = 0; i < qtdAlunos; i++) {
                            System.out.println("ALUNO - " + (i + 1));
                            System.out.println("Aluno: " + alunos[i]);
                            System.out.println("Nota do aluno: " + notas[i]);
                            System.out.println("-----------------------------------------");
                        }
                    }
                    break;
                case 3:
                    if (qtdAlunos == 0) {
                        System.out.println("Não há ALUNOS cadastrados ainda.");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- LISTAGEM DE ALUNOS APROVADOS -----------");
                        for (int i = 0; i < qtdAlunos; i++) {
                            if (notas[i] >= 7) {
                                System.out.println("---------------------------------------------------");
                                System.out.println("Aluno: " + alunos[i]);
                                System.out.println("Nota: " + notas[i]);
                                System.out.println("---------------------------------------------------");
                            }
                        }
                    }
                    break;
                case 4:
                    int indiceMaiorNota = 0;
                    if (qtdAlunos == 0) {
                        System.out.println("Não há ALUNOS cadastrados ainda.");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- MAIOR NOTA DA TURMA -----------");
                        for (int i = 0; i < qtdAlunos; i++) {
                            if (notas[i] > notas[indiceMaiorNota]) {
                                indiceMaiorNota = i;
                            }
                        }
                        System.out.println("-----------------------------------------");
                        System.out.println("Aluno: " + alunos[indiceMaiorNota]);
                        System.out.println("Nota: " + notas[indiceMaiorNota]);
                        System.out.println("-----------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("O programa será encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
