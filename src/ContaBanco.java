
public class ContaBanco {
	
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//Métodos personalizados
	public void estadoAtual() {
		System.out.println("----------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "cc") {
			this.setSaldo(50);
		} else if (t == "cp") {
			this.setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com saldo");
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta devedora");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar (double valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else
			System.out.println("Impossível depositar");
	}
	
	public void sacar (double valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente!");
			}			
			
		} else {	
		System.out.println("Impossível sacar de uma conta fechada");
		}
	}

	
	public void pagarMensal() {
		double valor = 0;
		if(this.getTipo() == "cc") {
			valor = 12;
		}else if(this.getTipo() == "cp") {
			valor = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar com uma conta fechada!");
		}
	} 

	//Métodos especiais
	public void ContaBanco() {
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		dono = d;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		status = s;
	}
	
}


