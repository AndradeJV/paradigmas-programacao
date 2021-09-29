package Menu;

import Characters.Arqueiro.Arqueiro;
import Characters.Cavaleiro.Cavaleiro;
import Characters.Characters;
import Characters.Mago.Mago;

import java.util.Scanner;

public class Menu {
    public Menu(){

        Mago mago = new Mago();
        Arqueiro arqueiro = new Arqueiro();
        Cavaleiro cavaleiro = new Cavaleiro();

        Scanner read = new Scanner(System.in);
        int optionGame = 0;
        int optionMenuIn = 0;

        System.out.println("\t\tSeja bem vindo ao RPG - Floot Rups");
        System.out.println("\t\tEscolha o que deseja fazer: ");

        do {
            System.out.println("\t\t 1- Mostrar Dados\n \t\t 2- Sair");
            System.out.printf("Opção: ");
            optionGame = read.nextInt();

            if(optionGame == 1){
                System.out.println("Escolha os personagens que deseja ver:");
                System.out.println("\t\t 1- Mago");
                System.out.println("\t\t 2- Arqueiro");
                System.out.println("\t\t 3- Cavaleiro");
                System.out.println("\t\t 4- Mostrar todos");
                System.out.println("\t\t 5- Sair");

                optionMenuIn = read.nextInt();

                switch (optionMenuIn){
                    case 1:
                        mago.printOut();
                        break;

                    case 2:
                        arqueiro.printOut();
                        break;

                    case 3:
                        cavaleiro.printOut();
                        break;

                    case 4:
                        mago.printOut();
                        arqueiro.printOut();
                        cavaleiro.printOut();
                        break;

                    case 5:
                        System.out.println("Até a próxima!");
                        break;

                    default:
                        System.out.println("Opção não encontrada!");
                        break;
                }
            }

            else
                System.out.println("Até a próxima");

        }while(optionGame < 1 || optionGame > 2);
    }

}
