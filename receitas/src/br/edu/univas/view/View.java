package br.edu.univas.view;

import java.util.ArrayList;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.Receita;

public class View {

	public void printMenu() {

		System.out.println(
				"Cadastro de Receitas\n****************************************************************************");

		System.out.println("1 - Cadastrar receita");
		System.out.println("2 - Visualizar receita");
		System.out.println("3 - Excluir receita");
		System.out.println("4 - Editar receita");
		

		System.out.println("10- Sair\n");

	}

	public void printInformNome() {

		System.out.println("\nDigite o nome do cliente:");

	}

	public void printInformCPF() {

		System.out.println("Digite o CPF:");

	}

	public void printInformCel() {

		System.out.println("Digite o celular:");

	}

	public void printSaveReceita() {
		System.out.println(
				"\nSalvar Receita\n**************************************************************************");
	}

	public void listCliente() {
		System.out.println(
				"\nClientes cadastrados\n*********************************************************************");
	}

	public void printInformODEsf() {

		System.out.println("Digite gau esférico do olho direito:");

	}

	public void printInformODCil() {

		System.out.println("Digite gau cilíndrico do olho direito:");

	}

	public void printInformOEEsf() {

		System.out.println("Digite gau esférico do olho esquerdo:");

	}

	public void printInformOECil() {

		System.out.println("Digite gau cilíndrico do olho esquerdo:");

	}

	public void printInformODEixo() {

		System.out.println("Digite eixo do olho direito:");

	}

	public void printInformOEEixo() {

		System.out.println("Digite eixo do olho esquerdo:");

	}

	public void printInformADC() {

		System.out.println("Digite a adição:");

	}

	public void printCliente(Cliente c1, int idx) {

		System.out.println("Cliente " + idx + ": " + c1.getNome());

	}

	public void informCliente() {

		System.out.println("Digite o número do cliente: ");

	}

	public void printReceita(ArrayList<Cliente> clientes, int num) {

		Cliente c1 = clientes.get(num);

		System.out.println("\nNome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCPF());
		System.out.println("Celular: " + c1.getCel());

		System.out.println("\nOD Esférico: " + c1.getReceita().getODEsf() + " OD Cilíndrico: " + c1.getReceita().getODCil()
				+ " Eixo: " + c1.getReceita().getODEixo());

		System.out.println("OE Esférico: " + c1.getReceita().getOEEsf() + " OE Cilíndrico: " + c1.getReceita().getOECil()
				+ " Eixo: " + c1.getReceita().getOEEixo());
		System.out.println("\nADC: " + c1.getReceita().getAdc());

	}
public void printMsgClienteExcluido() {
	
	System.out.println("Cliente excluido\n");
	
	
}
public void printEditarCliente() {
	
	
	System.out.println(
			"\nEditar cadastrados\n*********************************************************************");
}
public void printExcluirCliente() {
	
	
	System.out.println(
			"\nExcluir clientes\n*********************************************************************");
}

public void msgClienteEditado() {
	
	System.out.println("Cliente editado\n");
	
	
}

}
