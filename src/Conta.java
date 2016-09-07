//Classe em Java especifica o que todo objeto dessa classe deve ter
//No caso, declaramos o que toda conta deve ter. 
//Estes s�o os atributos que toda conta, quando criada, vai ter.

public class Conta {
	int numero;
	String dono;
	//String � tamb�m uma classe em Java. Neste momento guarda cadeia de caracteres ou frase completa
	//Como estamos ainda aprendendo o que � uma classe, entenderemos com detalhes a classe String apenas 
	//em cap�tulos posteriores.
	
	double saldo;
	double limite;
	Cliente titular;
	
	
	//M�todos
	   //Dentro da classe, tamb�m declararemos o que cada conta faz e como isto � feito - 
	   //os comportamentos que cada classe tem, isto �, o que ela faz. 
	   //Por exemplo, de que maneira que uma Conta saca dinheiro? Especificaremos isso dentro 
	   //da pr�pria classe Conta, e n�o em um local desatrelado das informa��es da pr�pria Conta. 
	   //� por isso que essas "fun��es" s�o chamadas de m�todos. 
	   //Pois � a maneira de fazer uma opera��o com um objeto.

	   
	   //M�todo para SACAR DINHEIRO (SEM RETORNO)
	   /*void saca (double quantidade) {
		   double novoSaldo = this.saldo - quantidade;
		   this.saldo = novoSaldo; 
	   } */
	
	
	   
	   
	   //M�todos com retorno
	   //Um m�todo sempre tem que definir o que retorna, nem que defina que n�o h� retorno, 
	   //como nos exemplos anteriores onde est�vamos usando o void.
	   
	   //Um m�todo pode retornar um valor para o c�digo que o chamou. 
	   //No caso do nosso m�todo saca , podemos devolver um valor booleano indicando se a 
	   //opera��o foi bem sucedida.

	//M�todo para SACAR DINHEIRO (COM RETORNO)
	
	
	   	boolean saca(double valor) {
		   if (this.saldo < valor) {
			   return false;
		   } 
		   else {
			   this.saldo -= valor;
			   return true;
			// A palavra chave return indica que o m�todo vai terminar ali, retornando tal informa��o.
		   }
	   }
	   
	   // IMPORTANTE: Mais adiante, veremos que algumas vezes � mais interessante lan�ar uma exce��o
	   // (::exception::) nesses casos. 
	   
	   //A declara��o do m�todo mudou! O m�todo saca n�o tem void na frente. Isto quer dizer que, 
	   //quando � acessado, ele devolve algum tipo de informa��o. No caso, um boolean. 
	   //A palavra chave return indica que o m�todo vai terminar ali, retornando tal informa��o.
	   
	   	   	   
	 //M�todo para DEPOSITAR DINHEIRO (ELEGANTE!!)
	   void deposita(double quantidade) {
		   this.saldo += quantidade;		   
	   }
	
	 //O += soma quantidade ao valor antigo do saldo e guarda no pr�prio saldo, o valor resultante.
	   
	   
	   //A palavra chave void diz que, quando voc� pedir para a conta sacar uma quantia, 
	   //nenhuma informa��o ser� enviada de volta a quem pediu.
	   //Quando algu�m pedir para sacar, ele tamb�m vai dizer quanto quer sacar. 
	   //Por isso precisamos declarar o m�todo com algo dentro dos par�nteses - o que vai a� dentro � 
	   //chamado de argumento do m�todo (ou par�metro). 
	   //Essa vari�vel � uma vari�vel comum, chamada tamb�m de tempor�ria ou local, pois, ao final da 
	   //execu��o desse m�todo, ela deixa de existir.
	   
	   //Dentro do m�todo, estamos declarando uma nova vari�vel. Essa vari�vel, assim como o argumento, 
	   //vai morrer no fim do m�todo, pois este � seu escopo. 
	   //No momento que vamos acessar nosso atributo, usamos a palavra chave this para mostrar que esse
	   //� um atributo, e n�o uma simples vari�vel. (veremos depois que � opcional)

	
	 //M�todo para TRANSFRIR DINHEIRO (Elegante!!)
	   void tranferepara(Conta destino, double valor) {
		   this.saldo -= valor;	
		   destino.saldo += valor;
	   }
	  
	   // A ideia � que, quando chamarmos o m�todo transfere, j� teremos um objeto do tipo Conta (o this), 
	   // portanto o m�todo recebe apenas um par�metro do tipo Conta, a Conta destino (al�m do valor).
	
	   //RESUMO IMPORTANTE
	   //Um sistema orientado a objetos � um grande conjunto de classes que vai se comunicar, 
	   //delegando responsabilidades para quem for mais apto a realizar determinada tarefa. 
	   //A classe Banco usa a classeConta que usa a classe Cliente, que usa a classe Endereco. 
	   //Dizemos que esses objetos colaboram, trocando mensagens entre si. Por isso acabamos tendo muitas 
	   //classes em nosso sistema, e elas costumam ter um tamanho relativamente curto.
}
