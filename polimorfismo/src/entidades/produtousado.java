package entidades;

public class produtousado extends produtonormal {

	private int codigodeuso;
	
	public produtousado() {
		super();
	}

	public produtousado(String nome, double preco, int quantidade, int codigodeuso) {
		super(nome, preco, quantidade);
		this.codigodeuso = codigodeuso;
	}

	public int getCodigodeuso() {
		return codigodeuso;
	}

	public void setCodigodeuso(int codigodeuso) {
		this.codigodeuso = codigodeuso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
