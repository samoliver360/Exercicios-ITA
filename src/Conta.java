//Classe em Java especifica o que todo objeto dessa classe deve ter
//No caso, declaramos o que toda conta deve ter. 
//Estes são os atributos que toda conta, quando criada, vai ter.

public class Conta {
	int numero;
	String dono;
	//String é também uma classe em Java. Neste momento guarda cadeia de caracteres ou frase completa
	//Como estamos ainda aprendendo o que é uma classe, entenderemos com detalhes a classe String apenas 
	//em capítulos posteriores.
	
	double saldo;
	double limite;
	Cliente titular;
	
	
	//Métodos
	   //Dentro da classe, também declararemos o que cada conta faz e como isto é feito - 
	   //os comportamentos que cada classe tem, isto é, o que ela faz. 
	   //Por exemplo, de que maneira que uma Conta saca dinheiro? Especificaremos isso dentro 
	   //da própria classe Conta, e não em um local desatrelado das informações da própria Conta. 
	   //É por isso que essas "funções" são chamadas de métodos. 
	   //Pois é a maneira de fazer uma operação com um objeto.

	   
	   //Método para SACAR DINHEIRO (SEM RETORNO)
	   /*void saca (double quantidade) {
		   double novoSaldo = this.saldo - quantidade;
		   this.saldo = novoSaldo; 
	   } */
	
	
	   
	   
	   //Métodos com retorno
	   //Um método sempre tem que definir o que retorna, nem que defina que não há retorno, 
	   //como nos exemplos anteriores onde estávamos usando o void.
	   
	   //Um método pode retornar um valor para o código que o chamou. 
	   //No caso do nosso método saca , podemos devolver um valor booleano indicando se a 
	   //operação foi bem sucedida.

	//Método para SACAR DINHEIRO (COM RETORNO)
	
	
	   	boolean saca(double valor) {
		   if (this.saldo < valor) {
			   return false;
		   } 
		   else {
			   this.saldo -= valor;
			   return true;
			// A palavra chave return indica que o método vai terminar ali, retornando tal informação.
		   }
	   }
	   
	   // IMPORTANTE: Mais adiante, veremos que algumas vezes é mais interessante lançar uma exceção
	   // (::exception::) nesses casos. 
	   
	   //A declaração do método mudou! O método saca não tem void na frente. Isto quer dizer que, 
	   //quando é acessado, ele devolve algum tipo de informação. No caso, um boolean. 
	   //A palavra chave return indica que o método vai terminar ali, retornando tal informação.
	   
	   	   	   
	 //Método para DEPOSITAR DINHEIRO (ELEGANTE!!)
	   void deposita(double quantidade) {
		   this.saldo += quantidade;		   
	   }
	
	 //O += soma quantidade ao valor antigo do saldo e guarda no próprio saldo, o valor resultante.
	   
	   
	   //A palavra chave void diz que, quando você pedir para a conta sacar uma quantia, 
	   //nenhuma informação será enviada de volta a quem pediu.
	   //Quando alguém pedir para sacar, ele também vai dizer quanto quer sacar. 
	   //Por isso precisamos declarar o método com algo dentro dos parênteses - o que vai aí dentro é 
	   //chamado de argumento do método (ou parâmetro). 
	   //Essa variável é uma variável comum, chamada também de temporária ou local, pois, ao final da 
	   //execução desse método, ela deixa de existir.
	   
	   //Dentro do método, estamos declarando uma nova variável. Essa variável, assim como o argumento, 
	   //vai morrer no fim do método, pois este é seu escopo. 
	   //No momento que vamos acessar nosso atributo, usamos a palavra chave this para mostrar que esse
	   //é um atributo, e não uma simples variável. (veremos depois que é opcional)

	
	 //Método para TRANSFRIR DINHEIRO (Elegante!!)
	   void tranferepara(Conta destino, double valor) {
		   this.saldo -= valor;	
		   destino.saldo += valor;
	   }
	  
	   // A ideia é que, quando chamarmos o método transfere, já teremos um objeto do tipo Conta (o this), 
	   // portanto o método recebe apenas um parâmetro do tipo Conta, a Conta destino (além do valor).
	
	   //RESUMO IMPORTANTE
	   //Um sistema orientado a objetos é um grande conjunto de classes que vai se comunicar, 
	   //delegando responsabilidades para quem for mais apto a realizar determinada tarefa. 
	   //A classe Banco usa a classeConta que usa a classe Cliente, que usa a classe Endereco. 
	   //Dizemos que esses objetos colaboram, trocando mensagens entre si. Por isso acabamos tendo muitas 
	   //classes em nosso sistema, e elas costumam ter um tamanho relativamente curto.
}
