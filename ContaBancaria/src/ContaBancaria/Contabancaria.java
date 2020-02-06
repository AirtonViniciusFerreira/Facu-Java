/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBancaria;

import java.util.Scanner;

/**
 *
 * @author a120104
 */
public class Contabancaria extends Lista {

//    /**
//     * @param args the command line arguments
//     */
    public Contabancaria(int qts) {
        super(qts);
    }

//    
    public static void main(String[] args) {
        // TODO code application logic here
        int qnt;
        int num;
        double sd;
        int men;
        int menu2;
        Scanner menu = new Scanner(System.in);
        Scanner qt = new Scanner(System.in);
        Scanner lernum = new Scanner(System.in);
        Scanner lersaldo = new Scanner(System.in);

//      System.out.println("Digite um quantidade de contas: ");
//      qnt = qt.nextInt();
        Lista list = new Lista(10);
        Lista list2 = new Lista(10);
        Lista list3;
        CC conta;
        CC cdep;
        do {
            System.out.println("Digite o que deseja fazer:");
            System.out.println("1 - Para Opçoes da Lista (1). ");
            System.out.println("2 - Para Opçoes da Lista (2). ");
            System.out.println("3 - Para Opçoes entre as listas. ");
            System.out.println("4 - Sair");
            menu2 = menu.nextInt();
            switch (menu2) {
                case 1:
                    do {
                        System.out.println("Digite o que deseja fazer:");
                        System.out.println("1 - Inserir conta. ");
                        System.out.println("2 - Depositar. ");
                        System.out.println("3 - Sacar. ");
                        System.out.println("4 - Listar contas");
                        System.out.println("5 - imprimir saldo. ");
                        System.out.println("6 Remover conta");
                        System.out.println("7 Sair");
                        men = menu.nextInt();
//      list.listaConta[1].depositar(sd);
                        switch (men) {
                            case 1:
                                System.out.println("Digite um numero da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Se deseja iniciar a conta com saldo, digite o saldo, quaso não queira digite 0: ");
                                sd = lersaldo.nextDouble();

                                conta = new CC(num, sd);

                                if (list.inserir(conta) != true) {
                                    System.out.println("Não foi possivel incerir.");
                                } else {
                                    System.out.println("Conta inserida.");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Digite o valor a ser depositado: ");
                                sd = lersaldo.nextDouble();

//                cdep = list.getlista(num);
                                if (list.listaConta[num].depositar(sd)) {
                                    System.out.println("Valor depositado. \n" + list.toString(num));
                                } else {
                                    System.out.println("Não foi possivel depositar.");
                                }
                                break;
                            case 3:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Digite o  valor a ser sacado: ");
                                sd = lersaldo.nextDouble();
//                cdep = list.getlista(num);
                                if (list.listaConta[num].sacar(sd)) {
                                    System.out.println("Valor sacado. \n" + list.toString(num));
                                } else {
                                    System.out.println("Não foi possivel sacar.");
                                }
                                break;
                            case 4:
                                System.out.println("Lista de contas\n" + list.toString());
                                break;
                            case 5:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();
                                System.out.println(list.toString(num));
                                break;
                            case 6:
                                System.out.println("Digite O Indice da conta: ");
                                num = lernum.nextInt();
                                System.out.println(list.remover(num));
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Entrada invalida. ");
                                break;
                        }
                    } while (men != 7);
                break;
                case 2:
                    do {
                        System.out.println("Digite o que deseja fazer:");
                        System.out.println("1 - Inserir conta. ");
                        System.out.println("2 - Depositar. ");
                        System.out.println("3 - Sacar. ");
                        System.out.println("4 - Listar contas");
                        System.out.println("5 - imprimir saldo. ");
                        System.out.println("6 Remover conta");
                        System.out.println("7 Sair");
                        men = menu.nextInt();
//      list.listaConta[1].depositar(sd);
                        switch (men) {
                            case 1:
                                System.out.println("Digite um numero da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Se deseja iniciar a conta com saldo, digite o saldo, quaso não queira digite 0: ");
                                sd = lersaldo.nextDouble();

                                conta = new CC(num, sd);

                                if (list2.inserir(conta) != true) {
                                    System.out.println("Não foi possivel incerir.");
                                } else {
                                    System.out.println("Conta inserida.");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Digite o valor a ser depositado: ");
                                sd = lersaldo.nextDouble();

//                cdep = list.getlista(num);
                                if (list2.listaConta[num].depositar(sd)) {
                                    System.out.println("Valor depositado. \n" + list2.toString(num));
                                } else {
                                    System.out.println("Não foi possivel depositar.");
                                }
                                break;
                            case 3:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();

                                System.out.println("Digite o  valor a ser sacado: ");
                                sd = lersaldo.nextDouble();
//                cdep = list.getlista(num);
                                if (list2.listaConta[num].sacar(sd)) {
                                    System.out.println("Valor sacado. \n" + list2.toString(num));
                                } else {
                                    System.out.println("Não foi possivel sacar.");
                                }
                                break;
                            case 4:
                                System.out.println("Lista de contas\n" + list2.toString());
                                break;
                            case 5:
                                System.out.println("Digite o Indice da conta: ");
                                num = lernum.nextInt();
                                System.out.println(list2.toString(num));
                                break;
                            case 6:
                                System.out.println("Digite O Indice da conta: ");
                                num = lernum.nextInt();
                                System.out.println(list2.remover(num));
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Entrada invalida. ");
                                break;
                        }
                    } while (men != 7);
                break;
                case 3:
                    do{
                    System.out.println("Digite o que deseja fazer:");
                    System.out.println("1 - Concatenar. ");
                    System.out.println("2 - Igual. ");
                    System.out.println("3 - Diferente. ");
                    System.out.println("4 - Sair");
                    men = menu.nextInt();
                    switch(men){
                        case 1:
                            System.out.println("Digite o que deseja fazer:");
                            System.out.println("1 - Lista 1  - Lista 2. ");
                            System.out.println("2 - Lista 2 - Lista 1. ");
                            men = menu.nextInt();
                            if(men == 1){
                                list3 = list.concatena(list2);
                            }
                            else{
                                list3 = list2.concatena(list);
                            }
                            System.out.println("Lista de contas\n" + list3.toString());
                            break;
                        case 2:
                            list3 = list.iguais(list2);
                            System.out.println("Lista de contas\n" + list3.toString());
                            break;
                        case 3:
                            list3 = list.iguais(list2);
                            System.out.println("Lista de contas\n" + list3.toString());
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Entrada invalida. ");
                            break;                 
                    }
                    break;
                    }while(men !=4);
                case 4:
                    break;
                default:
                    System.out.println("Entrada invalida. ");
                    break;
            }
        } while (menu2 != 4);
    }

}
