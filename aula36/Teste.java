package aula36;

public class Teste {

	public static void main(String[] args) {
	
		Contato contato = new Contato();
		
		contato.setNome("John");
		//contato.setEndereco("Asgard");
		//contato.setTelefone("40028922");
	
		//System.out.println(contato.getNome());
		//System.out.println(contato.getEndereco());
		//System.out.println(contato.getTelefone());
		
		// Relacionamento tem-um endereco
		Endereco end = new Endereco();
		end.setCep("21324165");
		end.setCidade("Halifax");
		end.setComplemento("IDK");
		end.setNomeRua("Central pk");
		end.setNumero("n/a");
		end.setEstado("Nova Scotia");
		
		contato.setEndereco(end);
		
		//Relacionamento tem-um telefone
		Telefone tel = new Telefone();
		tel.setDdd("021");
		tel.setNumero("2123564546");
		tel.setTipo("desconhecido");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("021");
		tel2.setNumero("2123564546");
		tel2.setTipo("trabalho");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		contato.setTelefones(telefones);
		
		//Sa?da no console
		System.out.println(contato.getNome());		
		//System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null)
			System.out.println(contato.getEndereco().getCidade());
		
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) 
				System.out.println(t.getDdd() + " " + t.getNumero());
		}

	}

}
