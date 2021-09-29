package Menu;

import Characters.Mago.Mago;

import java.util.Scanner;

public class Menu {
    public Menu(){
        Scanner read = new Scanner(System.in);
        int optionGame = 0;

        System.out.println("\t\tSeja bem vindo ao RPG - Floot Rups");
        System.out.println("\t\tEscolha o que deseja fazer: ");

        do {
            System.out.println("\t\t 1- Jogar\n \t\t 2- Sair");
            System.out.printf("Opção: ");
            optionGame = read.nextInt();

            if(optionGame == 1){
                System.out.println("Escolha os personagens que deseja ver:");
                System.out.println("\t\t 1- Mago");
                System.out.println("\t\t 2- Arqueiro");
                System.out.println("\t\t 3- Cavaleiro");
                System.out.println("\t\t 4- Mostrar todos");
                System.out.println("\t\t 5- Sair");

                optionGame = read.nextInt();

                switch (optionGame){
                    case 1:
                        Mago mago = new Mago();
                        break;
                    case 2:
                        System.out.println("Personagem:");
                        break;

                    case 3:
                        System.out.println("Personagem:");
                        break;

                    case 4:
                        System.out.println("Personagem:");
                        break;

                    case 5:
                        System.out.println("Personagem:");
                        break;
                }

            }

            else
                System.out.println("Até a próxima");

        }while(optionGame < 1 || optionGame > 2);
    }

}
