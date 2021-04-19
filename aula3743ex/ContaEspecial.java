package aula3743ex;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacarDinheiro(double valorSaque) {
				
		if(valorSaque > getSaldo())
			return false;
		else {
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		
	}
	
	public String toString() {
        String s = "ContaEspecial[";
        s += " limite: " + limite;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
    

}
