package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.view.View;
import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.Receita;

public class StartApp {

	private View view = new View();
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {

		StartApp app = new StartApp();
		app.initialize();

	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {

			view.printMenu();

			choice = readInt(scanner);

			if (choice == 1) {

				view.printSaveReceita();
				salvarReceita(scanner);

			}

			else if (choice == 2) {

				view.listCliente();
				verClientes();
				verReceita(scanner);
			}

			else if (choice == 3) {
				view.printExcluirCliente();
				verClientes();
				excluirCliente(scanner);
			}

			else if (choice == 4) {
				view.printEditarCliente();
				verClientes();
				editarCliente(scanner);

			}
		} while (choice != 10);

	}

	public void salvarReceita(Scanner scanner) {

		view.printInformNome();
		String nome = scanner.nextLine();

		view.printInformCPF();
		String CPF = scanner.nextLine();

		view.printInformCel();
		String cel = scanner.nextLine();

		view.printInformODEsf();
		double ODEsf = readDouble(scanner);

		view.printInformODCil();
		double ODCil = readDouble(scanner);

		view.printInformODEixo();
		double ODEeixo = readDouble(scanner);

		view.printInformODEsf();
		double OEEsf = readDouble(scanner);

		view.printInformOECil();
		double OECil = readDouble(scanner);

		view.printInformOEEixo();
		double OEEeixo = readDouble(scanner);

		view.printInformADC();
		double adc = readDouble(scanner);

		Receita receita = new Receita(ODEsf, ODCil, ODEeixo, OEEsf, OECil, OEEeixo, adc);
		Cliente cliente = new Cliente(nome, CPF, cel, receita);

		clientes.add(cliente);

	}

	public double readDouble(Scanner scanner) {
		double x = scanner.nextFloat();
		scanner.nextLine();

		return x;

	}

	public int readInt(Scanner scanner) {

		int i = scanner.nextInt();
		scanner.nextLine();

		return i;
	}

	public void verClientes() {
		for (int i = 0; i < clientes.size(); i++) {

			Cliente c1 = clientes.get(i);

			view.printCliente(c1, (i + 1));

		}

	}

	public void excluirCliente(Scanner scanner) {

		view.informCliente();

		int num = readInt(scanner) - 1;

		clientes.remove(num);

		view.printMsgClienteExcluido();

	}

	public void verReceita(Scanner scanner) {

		view.informCliente();

		int num = readInt(scanner);

		view.printReceita(clientes, (num - 1));

	}

	public void editarCliente(Scanner scanner) {

		view.informCliente();
		int num = readInt(scanner) - 1;

		Cliente c1 = clientes.get(num);

		view.printInformNome();
		c1.setNome(scanner.nextLine());

		view.printInformCPF();
		c1.setCPF(scanner.nextLine());

		view.printInformCel();
		c1.setCel(scanner.nextLine());
		
		view.printInformODEsf();
		c1.getReceita().setODEsf(readDouble(scanner));
		
		view.printInformODCil();
		c1.getReceita().setODCil(readDouble(scanner));;
		
		view.printInformODEixo();
		c1.getReceita().setODEixo(readDouble(scanner));;
		
		view.printInformOEEsf();
		c1.getReceita().setOEEsf(readDouble(scanner));

		view.printInformOECil();
		c1.getReceita().setOECil(readDouble(scanner));;
		

		view.printInformOEEixo();
		c1.getReceita().setOEEixo(readDouble(scanner));;

		view.printInformADC();
		c1.getReceita().setAdc(readDouble(scanner));
		
		view.msgClienteEditado();

	}
}
