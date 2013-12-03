
import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {

	private int indice;
	
	private int custo;
	private boolean visitado = false;
	private Vertice pai;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private List<Vertice> vizinhos = new ArrayList<Vertice>();

	
	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}


	public void visitar() {

		this.visitado = true;
	}

	public boolean verificarVisita() {

		return visitado;
	}

	public void setCusto(int custo) {

		this.custo = custo;
	}

	public int getCusto() {

		return this.custo;
	}

	public void setPai(Vertice pai) {

		this.pai = pai;
	}

	public Vertice getPai() {

		return this.pai;
	}

	public void setVizinhos(List<Vertice> vizinhos) {

		this.vizinhos.addAll(vizinhos);

	}

	public List<Vertice> getVizinhos() {

		return this.vizinhos;
	}

	public void setArestas(List<Aresta> arestas) {

		this.arestas.addAll(arestas);

	}

	public List<Aresta> getArestas() {

		return arestas;
	}

	public int compareTo(Vertice vertice) {
		if (this.getCusto() < vertice.getCusto())
			return -1;
		else if (this.getCusto() == vertice.getCusto())
			return 0;

		return 1;

	}
}
