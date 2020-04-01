
public class TestaConta {
	
	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco();
		ContaBanco c2 = new ContaBanco();
		
		c1.setNumConta(1234);
		c1.setDono("Murilo");
		c1.setStatus(true);
		c1.abrirConta("cc");		
		
		c1.sacar(50.00);
		c1.fecharConta();
	
		
		
		c2.setNumConta(4321);
		c2.setDono("Nina");
		c2.setStatus(true);
		c2.abrirConta("cp");
		c2.sacar(100);
		
		c2.depositar(50.00);
		
		c1.estadoAtual();
		c2.estadoAtual();
		
		
	}
}
