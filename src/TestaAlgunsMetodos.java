
public class TestaAlgunsMetodos {

	public static void main (String[] args) {
		//Criando a conta
		Conta minhaConta = new Conta();
		
		//Alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1500.0;
		
		//Para mandar uma mensagem ao objeto e pedir que ele execute um método, também usamos o ponto. 
		//O termo usado para isso é INVOCAÇÃO DE MÉTODO.
		
		//Saca 200
		minhaConta.saca(200.0);
						
		//Deposita 500
		minhaConta.deposita(500);
		
		System.out.println("O saldo da Conta eh" +  " " + minhaConta.saldo);
		
		if (minhaConta.saca(200)) {
			System.out.println("Consegui sacar!!!!!!");
			System.out.println("O saldo da conta eh" + " " + minhaConta.saldo);
		} else {
			System.out.println("Nao consegui sacar!!!!");
		}
			
		Conta c1 = new Conta();
	    c1.deposita(100);

	    Conta c2 = c1;  // linha importante! As referências apontam p/ o mesmo objeto
	    c2.deposita(200);

	    System.out.println(c1.saldo);
	    System.out.println(c2.saldo);
	} 					
	}

