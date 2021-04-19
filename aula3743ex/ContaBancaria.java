package aula3743ex;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacarDinheiro(double valorSaque) {
				
		if(valorSaque > getSaldo())
			return false;
		else {
			saldo -= valorSaque;
			return true;
		}
			
	}
	
    public void depositarDinheiro(double valorDeposito) {
		
		saldo += valorDeposito;
			
	}
    
    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta; 
        s += "; saldo: " + saldo;
        s += "]" ;
        return s; 
    }

}
