package entidades;

public class produtoimportado extends produtonormal {

	    private double taxadeimportacao;
	    
	    public produtoimportado() {
	    	super();
	    }

		public produtoimportado(String nome, double preco, int quantidade, double taxadeimportacao) {
			super(nome, preco, quantidade);
			this.taxadeimportacao = taxadeimportacao;
		}

		public double getTaxadeimportacao() {
			return taxadeimportacao;
		}

		public void setTaxadeimportacao(double taxadeimportacao) {
			this.taxadeimportacao = taxadeimportacao;
		}
	
		public double convertertaxa() {
			 return taxadeimportacao * 100;
		}
		
		@Override
	    public final double calcularprecofinal() {
	          return super.calcularprecofinal() + convertertaxa() * calcularprecofinal();
		}
	
	    
	
	
	
	
	
	
}
