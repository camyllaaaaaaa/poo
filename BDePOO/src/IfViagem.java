public interface IfViagem {
	
	//cliente adiciona agência;
	public Adicionar adicionar (Cliente cliente,Agência agência);
	
	//cliente adiciona hotel para sua hospedagem;
	public Adicionar adicionar (Cliente cliente,Hotel hotel);
	
	//cliente escolhe o tipo de quarto da sua preferência;
	public Escolher escolher (Cliente cliente,Quarto quarto);
	
	//cliente compra a passagem para o lugar que escolheu;
	public Comprar comprar (Cliente cliente,Passagem passagem);
	
	//cliente adiciona o Aeroporto que seu vôo vai sair;
	public Adicionar adicionar (Cliente cliente,Aeroporto aeroporto);


}
           