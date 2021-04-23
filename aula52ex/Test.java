package aula52ex;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int option = 1;
		PhoneBook phoneBook = new PhoneBook();
		Scanner scan = new Scanner(System.in);
        
        while (option != 3){
        	option = getMenu(scan);
            
            if (option == 1){ //Consult contact
            	consultContactPerName(scan, phoneBook);
            } else if (option == 2){ //Add contact
            	addContact(scan, phoneBook);
            }
        }
    }
    
    public static void addContact(Scanner scan, PhoneBook phoneBook){
        try {
            System.out.println("Criando um contato, entre com as informações");
            String nome = readsInformationString(scan, "Entre com o nome do contato");
            String telefone = readsInformationString(scan, "Entre com o telefone do contato");
            
            Contact contact = new Contact();
            contact.setName(nome);
            contact.setPhone(telefone);
            
            System.out.println("Contato a ser criado: ");
            System.out.println(contact);
            
            phoneBook.addContact(contact);
        } catch (PhoneBookFullException e) {
            System.out.println(e.getMessage());
            
            System.out.println("Contatos da agenda");
            System.out.println(phoneBook);
        }
    }
    
    public static void consultContactPerName(Scanner scan, PhoneBook phoneBook){
        String nameContact = readsInformationString(scan, "\r\n"
        		+ "Enter the name of the contact to be searched: ");
            try {
                if (phoneBook.consultContactPerName(nameContact) >= 0){
                    System.out.println("Contato existe");
                }
            } catch (ContactDoesntExistExeption e) {
                System.out.println(e.getMessage());
            }
    }
    
    public static String readsInformationString(Scanner scan, String msg){
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }
    
    public static int getMenu(Scanner scan){
        
        boolean invalidInput = false;
        int option = 3;
        
        while (!invalidInput){
            System.out.println("Enter the desired option:");
            System.out.println("1: Consult contact");
            System.out.println("2: Add contact");
            System.out.println("3: Exit");
        
            try {
                String input = scan.nextLine();
                option = Integer.parseInt(input);
                
                if (option == 1 || option == 2 || option == 3){
                    invalidInput = true;
                } else {
                    throw new Exception("\r\n"
                    		+ "Invalid Input");
                }
            } 
            catch (Exception e){
                System.out.println("\r\n"
                		+ "Invalid Input, try again\n");
            }
        }
        
        return option;
    }

}
