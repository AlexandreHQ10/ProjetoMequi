package projetoMequi;

import java.util.Scanner;

public class ProjetoMequi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("----PROJETO MEQUI----");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("--SELECIONE UMA OPÇÃO---");
		System.out.println("");
		System.out.println("*******Cardápio*******");
		System.out.println("");
		System.out.println("1 - Lançamentos");
		System.out.println("2 - Brabos do Mequi");
		System.out.println("3 - Sanduiches de Carne Bovina");
		System.out.println("4 - Família Tasty");
		System.out.println("5 - Sanduiches de Frango");
		System.out.println("6 - MC Lanche Feliz");
		System.out.println("7 - Méqui 1000 ");
		System.out.println("8 - Acompanhamentos");
		System.out.println("9 - Sobremesas");
		System.out.println("10 - Bebidas Frias");
		System.out.println("11 - Café da Manhã");
		System.out.println("12 - Bebidas Quentes");
		System.out.println("13 - MC Ofertas");
		System.out.println("14 - Méqui Box ");
		System.out.println("15 - MC Café ");

		int opcaoMenu1 = sc.nextInt();
		switch (opcaoMenu1) {
		case 1:
			System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
			System.out.println("");
			System.out.println("*******LANÇAMENTOS*******");
			System.out.println("");
			System.out.println("1 - McCrispy Chicken Legend");
			System.out.println("2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
			System.out.println("3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
			System.out.println("4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
			System.out.println("");
			System.out.println("--SELECIONE UMA OPÇÃO---");
			System.out.println("");

			int opcaoMenuSubMenu1 = sc.nextInt();
			switch (opcaoMenuSubMenu1) {
			case 1:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
				System.out.println("");
				System.out.println("");
				System.out.println("- McCrispy Chicken Legend -");
				System.out.println("");
				System.out.println("- 926 kcal -");
				System.out.println("");
				System.out.println("Composto por pão tipo brioche com batata, molho do CBO, cebola");
				System.out.println("crispy, bacon em fatias, alface americana, queijo sabor cheddar e carne");
				System.out.println("100% de peito de frango, temperada e empanada.");
				 break;
			case 2:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2---");
				System.out.println("");
				System.out.println("");
				System.out.println("- McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate -");
				System.out.println("");
				System.out.println("- 319 kcal -");
				System.out.println("");
				System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a");
				System.out.println("Kopenhagen podem oferecer! A sobremesa é composta por");
				System.out.println("espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea");
				System.out.println("sabor baunilha e cobertura sabor chocolate.");
				break;
			case 3:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3---");
				System.out.println("");
				System.out.println("");
				System.out.println("- McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango -");
				System.out.println("");
				System.out.println("- 479 kcal -");
				System.out.println("");
				System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a");
				System.out.println("Kopenhagen podem oferecer! A sobremesa é composta por");
				System.out.println("espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea");
				System.out.println("sabor baunilha e cobertura sabor morango.");
				break;
			case 4:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 4---");
				System.out.println("");
				System.out.println("");
				System.out.println("- McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo -");
				System.out.println("");
				System.out.println("- 325 kcal -");
				System.out.println("");
				System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a");
				System.out.println("Kopenhagen podem oferecer! A sobremesa é composta por");
				System.out.println("espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea");
				System.out.println("sabor baunilha e cobertura sabor caramelo.");

				break;
			}
			break;
		default:
			System.out.println("");
			System.out.println("Valor invalido;");

			break;
		}int opcaoMenu2 = sc.nextInt();
		switch (opcaoMenu2) {
		case 2:
			System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2---");
			System.out.println("");
			System.out.println("*******Brabos do Méqui*******");
			System.out.println("");
			System.out.println("1 - Brabo Melt Crispy");
			System.out.println("2 - Brabo Bacon Salad");
			System.out.println("");
			System.out.println("--SELECIONE UMA OPÇÃO---");
			System.out.println("");

			int opcaoMenuSubMenu2 = sc.nextInt();
			switch (opcaoMenuSubMenu2) {
			case 1:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1---");
				System.out.println("");
				System.out.println("   Brabo Melt Crispy");
				System.out.println("");
				System.out.println("1057 kcal");
				System.out.println("");
				System.out.println("Delicioso molho lácteo cremoso sabor cheddar, hambúrguer de carne 100%");
				System.out.println("bovina, a nova Méquinese, exclusiva maionese especial com sabor de carne");
				System.out.println(
						"defumada, cebola crispy, fatias de bacon, queijo sabor cheddar, tudo isso no pão");
				System.out.println("tipo brioche trazendo uma explosão de sabores a cada mordida!");
				break;
			case 2:
				System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2---");
				System.out.println("");
				System.out.println("   Brabo Bacon Salad");
				System.out.println("");
				System.out.println("1064 kcal");
				System.out.println("");
				System.out.println("Composto pelo nosso pão tipo brioche, hambúrguer de carne 100% bovina, a nova");
				System.out.println("Méquinese, exclusiva maionese especial com sabor de carne defumada, alface,");
				System.out.println("tomate, fatias de bacon e queijo sabor cheddar.");
				break;
			}
		default:
			break;
		}
			sc.close();}	
				}
			
		
	
