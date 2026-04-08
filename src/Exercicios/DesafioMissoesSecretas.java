package Exercicios;

import java.util.Scanner;

public class DesafioMissoesSecretas {
    public static void main(String[] args) {

        /*
 DESAFIO 4 — Sistema de Missões Secretas

 Você gerencia agentes secretos.

 Funcionalidades:

 - Cadastrar nome do agente
 - Cadastrar nível de ameaça da missão (1 a 10)
 - Listar agentes
 - Mostrar quantas missões são de nível 8 ou superior
 - Encerrar

 Aqui você treina:

 - Contador condicional

 Exemplo:

 if (nível >= 8) {
     contador++;
 }

 Isso desenvolve lógica estatística básica.
*/

        Scanner scan = new Scanner(System.in);
        int qtdAgentes = 0;
        String[] agentes = new String[5];
        int[] niveisMissao = new int[5];

        int opcaoMenu = 0;

        while (opcaoMenu != 4) {
            System.out.println("---------- MENU -----------");
            System.out.println("1 - Cadastrar AGENTE");
            System.out.println("2 - Listar AGENTES");
            System.out.println("3 - Missões nível 8++");
            System.out.println("4 - Sair");

            System.out.print("Informe a opção que deseja executar: ");
            opcaoMenu = scan.nextInt();
            scan.nextLine();

            switch (opcaoMenu) {
                case 1:
                    if (qtdAgentes == agentes.length) {
                        System.out.println("O número MÁXIMO de cadastros de agentes foi alcançado.");
                        System.out.println("Favor liberar mais memória.");
                    } else {
                        System.out.println("---------- CADASTRO DE AGENTES -----------");
                        System.out.print("Nome do agente: ");
                        agentes[qtdAgentes] = scan.nextLine();
                        System.out.print("Nível da missão(1 a 10): ");
                        niveisMissao[qtdAgentes] = scan.nextInt();
                        qtdAgentes++;

                        System.out.println("Agente cadastrado com sucesso.");
                    }
                    break;
                case 2:
                    if (qtdAgentes == 0) {
                        System.out.println("Não há AGENTES cadastrados ainda...");
                        System.out.println("Voltando ao menu...");
                    } else {
                        System.out.println("---------- LISTAGEM DE AGENTES -----------");
                        for (int i = 0; i < qtdAgentes; i++) {
                            System.out.println("AGENTE - " + (i + 1));
                            System.out.println("Agente: " + agentes[i]);
                            System.out.println("Nível da missão: " + niveisMissao[i]);
                            System.out.println("-----------------------------------------");
                        }
                    }
                    break;
                case 3:
                    int qtdMissoes8mais = 0;
                    if (qtdAgentes == 0) {
                        System.out.println("Não há AGENTES cadastrados ainda...");
                        System.out.println("Voltando ao menu...");
                    } else {
                        for (int i = 0; i < qtdAgentes; i++) {
                            if (niveisMissao[i] >= 8) {
                                qtdMissoes8mais++;
                            }
                        }
                        System.out.println("A quantidade de missões nível 8++ é de: " +
                                qtdMissoes8mais + " missões.");
                    }
                    break;
                case 4:
                    System.out.println("O programa será encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

    }
}
