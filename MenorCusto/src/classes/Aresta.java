
public class Aresta {
	
	  private int peso;
      private Vertice origem;
      private Vertice destino;

      public Aresta(Vertice de, Vertice para) {

              this.peso = 1;
              this.origem = de;
              this.destino = para;

      }

      public void setPeso(int novoPeso) {

              this.peso = novoPeso;
      }

      public int getPeso() {

              return peso;
      }

      public void setDestino(Vertice destino) {
              this.destino = destino;
      }

      public Vertice getDestino() {
              return destino;
      }

      public void setOrigem(Vertice origem) {
              this.origem = origem;
      }

      public Vertice getOrigem() {
              return origem;
      }


}
