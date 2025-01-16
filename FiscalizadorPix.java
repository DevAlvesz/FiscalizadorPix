package Fiscalizador;

import java.util.Locale;
import java.util.Scanner;

public class FiscalizadorPix {
        public static void main(String[] args) {
            //Programa em java sobre a fiscalização do pix da receita federal, caso um usuário seja CPF (Pessoa Física), deverá informar
            // o cpf para ver se tem todos os 11 dígitos do cpf e irá consultar o valor feito no pix, caso tenha sido mais de 5mil,
            // deverá declarar este valor a receita federal
            // para a empresa, cnpj a mesma coisa, só que com 14 dígitos e o valor acima de 15mil mensais

            Scanner sc = new Scanner(System.in);
            Locale.setDefault(new Locale("en", "US"));


            int escolha, valcpf, valcnpj = 0;
            String numcpf, numcnpj = "";

            System.out.println("------------------------------------------");
            System.out.println(" SEJA BEM VINDO(A) A FISCALIZAÇÃO DO AMOR");
            System.out.println("------------------------------------------");

            System.out.println("Escolha a opção desejada: ");
            System.out.println("1- PARA CPF (Pessoa Física)");
            System.out.println("2- PARA CNPJ (Cadastro Nacional da Pessoa Jurídica");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:

                    do {
                        System.out.println("Digite seu CPF (Deve conter exatamente todos os 11 dígitos.");
                        numcpf = sc.next();

                        if (numcpf.length() != 11){
                            System.out.println("CPF INVÁLIDO! DIGITE NOVAMENTE.");
                        }
                    }while (numcpf.length() != 11);

                    System.out.println("CPF VÁLIDO! " + numcpf);

                    System.out.println("DIGITE O VALOR MOVIMENTADO NO PIX DURANTE O MÊS: ");
                    valcpf = sc.nextInt();

                    if (valcpf > 5000){
                        System.out.println("O VALOR MOVIMENTADO EM SUA CONTA FOI ACIMA DE R$5000, VOCÊ DEVERÁ DECLARAR O IMPOSTO DO AMOR!");

                        System.out.println("SIGA AS INSTRUÇÕES PARA DECLARAR IMPOSTO DE RENDA: ");
                        System.out.println("1- Separe todos os documentos para o Imposto de Renda.");
                        System.out.println("2- Escolha um canal da Receita Federal para fazer a declaração.");
                        System.out.println("3- Crie uma nova declaração ou use a pré-preenchida.");
                        System.out.println("4- Escolha entre a declaração completa e a simplificada.");
                        System.out.println("5- Cheque todas as informações antes de enviar.");

                    }
                    break;

                case 2:

                    do {
                        System.out.println("Digite seu CNPJ (Deve conter exatamente todos os 14 dígitos.");
                        numcnpj = sc.next();

                        if (numcnpj.length() != 14){
                            System.out.println("CNPJ INVÁLIDO! DIGITE NOVAMENTE.");
                        }
                    }while (numcnpj.length() != 14);

                    System.out.println("DIGITE O VALOR MOVIMENTADO NO PIX DURANTE O MÊS: ");
                    valcnpj = sc.nextInt();

                    if (valcnpj > 15000){
                        System.out.println("O VALOR MOVIMENTADO EM SUA CONTA FOI ACIMA DE R$15000, VOCÊ DEVERÁ DECLARAR O IMPOSTO DO AMOR!");

                        System.out.println("SIGA AS INSTRUÇÕES PARA DECLARAR IMPOSTO DE RENDA: ");
                        System.out.println("1- Separe todos os documentos para o Imposto de Renda.");
                        System.out.println("2- Escolha um canal da Receita Federal para fazer a declaração.");
                        System.out.println("3- Crie uma nova declaração ou use a pré-preenchida.");
                        System.out.println("4- Escolha entre a declaração completa e a simplificada.");
                        System.out.println("5- Cheque todas as informações antes de enviar.");

                    }

                    break;
            }

            sc.close();
        }
    }
