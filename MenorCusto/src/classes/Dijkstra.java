
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Dijkstra {

	      

	       
	        List<Vertice> menorCaminho = new ArrayList<Vertice>();    //Lista de vertices. menor caminho encontrado pelo algorítmo!                  
	        Vertice verticeCaminho = new Vertice();                   //vertices pertencentes ao menor caminho
            Vertice atual = new Vertice();                            //guarda o vertice  visitado nomento atual
            Vertice vizinho = new Vertice();                          //Variavel que marca o vizinho do vertice atualmente visitado
            List<Vertice> naoVisitados = new ArrayList<Vertice>();    // Lista dos vertices que ainda nao foram visitados                                                     

	        
	        
	        // Dijkstra
	        public List<Vertice> encontrarMenorCaminhoDijkstra(Grafo grafo, Vertice de,
	                        Vertice para) {

	                 
	                menorCaminho.add(de);                            // Adiciona a origem na lista do menor caminho

	               
	                for (int i = 0; i < grafo.getVertices().size(); i++) {    // Colocando a distancias iniciais

	                      
	                        if (grafo.getVertices().get(i).getIndice()                   //compara o vertice digitado pelo usuário com os inseridos no grafo.
	                                        ==(de.getIndice())) {

	                                grafo.getVertices().get(i).setCusto(0);             //inicialização dos vertices, o primeiro com custo 0 

	                        } else {                                                    

	                                grafo.getVertices().get(i).setCusto(9999);            //e os demeis infinito.

	                        }                                                     
	                       
	                        this.naoVisitados.add(grafo.getVertices().get(i));             //constroi uma lista de vertices não visitados
	                }

	                
	                Collections.sort(naoVisitados);                                        //ordena os vertices.
	                                          
	                while (!this.naoVisitados.isEmpty()) {                                // este while continua ate que todos os vertices sejam visitados

	                       

	                        atual = this.naoVisitados.get(0);
	                        System.out.println("PONTO DE PARTIDA DO VERTICE " + atual);
	                      
	                        for (int i = 0; i < atual.getArestas().size(); i++) {

	                                vizinho = atual.getArestas().get(i).getDestino();                //vizinho = destino
	                                
	                                if (!vizinho.verificarVisita()) {                            //vizinho default false  verifica se o vizinho já foi visitado


	                                        if (vizinho.getCusto() > (atual.getCusto() + atual    //compara o destino com o vertice atual.
	                                                        .getArestas().get(i).getPeso())) {

	                                                vizinho.setCusto(atual.getCusto()
	                                                                + atual.getArestas().get(i).getPeso());
	                                                vizinho.setPai(atual);

	                                               
	                                                if (vizinho == para) {                     // Quando o vizinho for o vertice procurado 
	                                                        menorCaminho.clear();              //apaga a lista de menor caminho
	                                                        verticeCaminho = vizinho;          
	                                                        menorCaminho.add(vizinho);         //add vizinho na lista menor caminho
	                                                        while (verticeCaminho.getPai() != null) {

	                                                                menorCaminho.add(verticeCaminho.getPai());
	                                                                verticeCaminho = verticeCaminho.getPai();

	                                                        }
	                                                                                             
	                                                        
	                                                        Collections.sort(menorCaminho);       // Ordena a lista do menor caminho, para que ele
	                                                                                              // seja exibido da origem ao destino.
	                                                }
	                                        }
	                                }

	                        }
	                        
	                        
	                        atual.visitar();                         // Marca o vertice atual como visitado e 
	                        this.naoVisitados.remove(atual);         //o retira da lista de nao  visitados
	                    

	                        Collections.sort(naoVisitados);    /*
	                         * Ordena a lista, para que o vertice com menor distancia fique na
	                         * primeira posicao
	                         */
	                        System.out.println("Nao foram visitados ainda:"+naoVisitados);

	                }

	                return menorCaminho; //retorna a lista de menor caminho.
	        }

	}
	


