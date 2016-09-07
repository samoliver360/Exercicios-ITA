//Já temos uma classe em Java que especifica o que todo objeto dessa classe deve ter. 
//Mas como usá-la?

class Programa {
   public static void main (String[] args){
	   Conta minhaConta;
	   minhaConta = new Conta();
	   //Para criar (construir, instanciar) uma Conta, basta usar a palavra chave new
	   //Bem, o código acima cria um objeto do tipo Conta, 
	   //mas como acessar esse objeto que foi criado? 
	   //Precisamos ter alguma forma de nos referenciarmos a esse objeto. 
	   //Precisamos de uma variável (MInhaConta)
	   
	   //Pode parecer estranho escrevermos duas vezes Conta: 
	   //uma vez na declaração da variável e outra vez no uso do new. 
	   //Mas há um motivo, que em breve entenderemos.
	   
	   //Através da variável minhaConta, podemos acessar o objeto recém criado para 
	   //alterar seu dono, seu saldo, etc
	   minhaConta.dono = "Duke";
	   minhaConta.numero = 123;
	   minhaConta.saldo = 1000.0;
	   
	   System.out.println("Saldo Atual é  " + minhaConta.saldo);
	   
	   //É importante fixar que o ::ponto:: foi utilizado para acessar algo em minhaConta. 
	   //A minhaConta pertence ao Duke, e tem saldo de mil reais.
			   

	   
	   
	   
	   
   }
}
