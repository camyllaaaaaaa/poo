public interface IfViagem {
	
	//cliente adiciona ag�ncia;
	public Adicionar adicionar (Cliente cliente,Ag�ncia ag�ncia);
	
	//cliente adiciona hotel para sua hospedagem;
	public Adicionar adicionar (Cliente cliente,Hotel hotel);
	
	//cliente escolhe o tipo de quarto da sua prefer�ncia;
	public Escolher escolher (Cliente cliente,Quarto quarto);
	
	//cliente compra a passagem para o lugar que escolheu;
	public Comprar comprar (Cliente cliente,Passagem passagem);
	
	//cliente adiciona o Aeroporto que seu v�o vai sair;
	public Adicionar adicionar (Cliente cliente,Aeroporto aeroporto);


}
           