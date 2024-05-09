package Prova_2_Lab_POO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Receita> receitasCoz1 = new ArrayList<>();
        ArrayList<Receita> receitasCoz2 = new ArrayList<>();

        Pirata coz1 = new Cozinheiro("jao", "pao de batata", 10, receitasCoz1);
        Pirata coz2 = new Cozinheiro("ze", "macarrao", 8, receitasCoz2);
        Receita macarrao = new Receita("macarrao", 2);
        Receita pao_de_batata = new Receita("pao de batata", 4);

        receitasCoz1.add(macarrao);
        receitasCoz1.add(pao_de_batata);

        receitasCoz2.add(macarrao);
        receitasCoz2.add(pao_de_batata);
        ((Cozinheiro) coz1).mostrarReceitas();
        ((Cozinheiro) coz2).mostrarReceitas();

        String cozido_coz1 = ((Cozinheiro)coz1).prepararPrato(1);
        System.out.println("Cozinhou: " + cozido_coz1);

        ((Cozinheiro)coz2).prepararPrato(0);

        Pirata davy_jones = new Pirata("davy jones", "macarrao", 9);
        System.out.println("Poder antes comer: " + davy_jones.getPoder());
        davy_jones.comer(((Cozinheiro)coz1), 0);
        System.out.println("Poder depois comer: " + davy_jones.getPoder());

        Pirata edward_kenway = new Capitao("edward kenway", "pao de batata", 14);
        Pirata linn = new Espadachim("linn", "pao de batata", 15);
        ((Capitao)edward_kenway).conquistarNovoSeguidor(davy_jones);
        ((Capitao)edward_kenway).conquistarNovoSeguidor(linn);

        ((Capitao)edward_kenway).darOrdens();
        ((Espadachim)linn).darOrdens();

        ((Capitao)edward_kenway).mudarRota();
        ((Espadachim)linn).mudarRota();

        edward_kenway.lutar(linn);
        linn.lutar(edward_kenway);
        edward_kenway.lutar(davy_jones);
        edward_kenway.lutar(coz1);
    }
}
