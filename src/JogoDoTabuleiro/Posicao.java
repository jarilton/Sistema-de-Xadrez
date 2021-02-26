package JogoDoTabuleiro;

public class Posicao {
	
	private int linha;
	private int coluna;
	public Posicao(int Linha, int coluna) {
		
		this.linha = Linha;
		this.coluna = coluna;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int fileira) {
		this.linha = fileira;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return linha + "," + coluna;
	}

}
