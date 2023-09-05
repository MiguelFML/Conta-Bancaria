package conta;

import java.util.Locale;

import java.util.Scanner;

public class Conta {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Locale.setDefault(Locale.US);

double saldo=0;


System.out.println("Nome do cliente:");

String nome = sc.next();

System.out.println("Tipo da conta: ");

String tipo = sc.next();


System.out.print("Is there an initial deposit (y/n)? ");

char response = sc.next().charAt(0);


if (response == 'y') {

System.out.print("Enter initial deposit value: ");

saldo = sc.nextDouble();

}

else {

saldo=0;

}

int opcao=0;



while(opcao != 4) {

System.out.println("Digite sua opção");

System.out.println("1- Cosultar saldo");

System.out.println("2- transferir valor");

System.out.println("3- Receber valor");

System.out.println("4- sair");

opcao = sc.nextInt();


if(opcao == 1) {

System.out.println("Saldo: " + saldo);

}else if(opcao==2) {

System.out.println("Digite o valor da sua transferencia:");

double tranference= sc.nextDouble();

saldo -= tranference;

System.out.println(saldo);

}else if(opcao ==3) {

System.out.println("Digite o valor que você vai receber:");

double entrada= sc.nextDouble();

saldo += entrada;

System.out.println(saldo);

}else if(opcao ==4){

System.out.println("Você saiu da sua conta");

}

}
