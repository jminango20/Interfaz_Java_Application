package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.servicies.ContractService;
import model.servicies.PayPalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    
	    System.out.println("Enter contract data: ");
	    System.out.print("Number: ");
	    int number = sc.nextInt();
	    System.out.print("Date (dd/MM/yyyy): ");
	    Date date = sdf.parse(sc.next());
	    System.out.print("Contract value: ");
	    double totalValue = sc.nextDouble();
	    
	    Contract contract = new Contract(number, date, totalValue);
	    
	    System.out.print("Enter number of installments: ");
	    int parcelas = sc.nextInt();
	    
	    ContractService contractService = new ContractService(new PayPalService());
	    contractService.processContract(contract, parcelas);
	    
	    System.out.println("Installments: ");
	    for(Installment installment:contract.getInstallments() ) {
	    	System.out.println(installment);
	    }
	    
	
				
		sc.close();
		

	}

}
