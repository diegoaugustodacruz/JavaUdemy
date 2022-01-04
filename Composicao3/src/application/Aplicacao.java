package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new  Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();		
		System.out.println("Digite o email do cliente: ");
		String email = sc.nextLine();
		System.out.println("Digite a data de nascimento do cliente: ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Client cliente = new Client(nome, email, dataNascimento);
				
		
		System.out.println("Digite a status da ordem: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.println("Quantos itens tem o pedido: ");
		int n = sc.nextInt();		

		for(int i=0; i<n; i++) {
			System.out.println("Enter #" +(i+1) + " item data");
			System.out.println("Digite o nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.next();
			System.out.println("Digite o preco do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.println("Digite a quantidade: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(nomeProduto, precoProduto);
			
			OrderItem it = new OrderItem(quantity, precoProduto, product);
			
			order.addItem(it);
			
		}
		
		System.out.println(order);
		
	}
}
