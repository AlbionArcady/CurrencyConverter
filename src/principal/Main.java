package principal;

import java.util.Scanner;
import consult.ConsultCurrency;
import model.Currency;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultCurrency consult= new ConsultCurrency();
        Currency currency = null;
        int option = 0;
        Double amount = 0.0;

        while(option != 9) {
            System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("♥      Welcome to currency converter       ♥");
            System.out.println("♥                                          ♥");
            System.out.println("♥ 1. USD to MXN                            ♥");
            System.out.println("♥ 2. MXN to USD.                           ♥");
            System.out.println("♥ 3. USD to COP.                           ♥");
            System.out.println("♥ 4. COP to USD.                           ♥");
            System.out.println("♥ 5. USD to BRL.                           ♥");
            System.out.println("♥ 6. BRL to USD                            ♥");
            System.out.println("♥ 7. USD to ARS.                           ♥");
            System.out.println("♥ 8. ARS to USD                            ♥");
            System.out.println("♥ 9. Exit.                                 ♥");
            System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("Choose an option:");
            try {
                option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("USD","MXN", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 2:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("MXN","USD", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 3:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("USD","COP", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 4:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("COP","USD", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 5:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("USD","BRL", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 6:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("BRL","USD", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 7:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("USD","ARS", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 8:
                        System.out.println("Enter the amount to be converted:");
                        amount  = Double.parseDouble(scanner.nextLine());
                        currency = consult.searchCurrency("ARS","USD", amount);

                        System.out.println("The amount is: " + currency.conversion_result());
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Enter a valid number");

                }

            }catch (NumberFormatException e) {
                System.out.println("ERROR ENTER A VALID OPTION: " + e.getMessage());
            }

        }
    }
}
