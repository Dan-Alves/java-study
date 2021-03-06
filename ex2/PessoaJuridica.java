package ex2;

public class PessoaJuridica extends Contribuinte{
	
	private String cnpj;
		
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}
	
	public String toString() {
        String s = "Pessoa Jur?dica[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;
    }
	
}
