package aula36ex;

public class Agenda {

	private Contato[] contatos;
	private String nome;
	
	public Agenda() { }
	
	public Agenda(String nome) {
        this.nome = nome;
    }
	
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String retornarInformacoes(){
        String info = "Nome = " + nome + "\n";
        
        if (contatos != null){
            for (Contato c : contatos){
                info += c.retornarInformacoes() + "\n";
            }
        }
        
        return info;
    }
	
	
}
