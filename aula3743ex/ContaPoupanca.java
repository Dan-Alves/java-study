package aula3743ex;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	ContaBancaria cb = new ContaBancaria();
			
	public int getDiaRendimento() {
		return diaRendimento;
	}



	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public boolean calcularNovoSaldo(double taxRendimento) {
		
		Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxRendimento));
            return true;
        }
        return false;
        
	}
	
	public String toString() {
        String s = "ContaPoupanša[";
        s += " diaRendimento: " + diaRendimento;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }

}
