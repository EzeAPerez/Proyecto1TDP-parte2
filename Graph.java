package tdpp1;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph{
	 
	private Map<Integer, Integer> nodos;
	private Map<String, Par<Integer,Integer>> edge;
	private static Logger Logger;
	
	public Graph() {
		nodos = new HashMap<Integer, Integer>();
		edge = new HashMap<String, Par<Integer,Integer>>();
		
		if(Logger == null) {
			Logger = Logger.getLogger(Graph.class.getName());
			
			Handler hnd = new ConsoleHandler();
			hnd.setLevel(Level.FINE);
			Logger.addHandler(hnd);
			
			Logger.setLevel(Level.WARNING);
			
			Logger rootLogger = Logger.getParent();
			for(Handler h : rootLogger.getHandlers()) {
				h.setLevel(Level.OFF);
			}
		}
	}
	
	public void addNode(int node) {
		
		boolean esta = nodos.containsKey(node);
		Logger.fine("Se quiere insertar el nodo "+node+".");
		if(esta) {
			Logger.warning("No se puede insertar el nodo "+node+" porque ya existe.");}
		else {
			nodos.put(node, node);
			Logger.info("El nodo fue "+node+" insertado con exito.");
		}
	}
	
	public void addEdge(int node1, int node2) {
		boolean esta1 = nodos.containsKey(node1);
		boolean esta2 = nodos.containsKey(node2);
		Logger.fine("Se quiere insertar un arco con los nodos "+node1+" y "+node2+".");
		if(esta1 && esta2) {
			Par<Integer, Integer> par = new Par(node1, node2);
			String key = node1+" "+node2;
			Par<Integer, Integer> value = edge.put(key, par);
			if(value!=null) 
				Logger.warning("No se puede insertar el arco con los nodos "+node1+" y "+node2+" porque ya existe.");
			else {
				edge.put(key, par);
				Logger.info("El arco con los nodos "+node1+" y "+node2+" fue insertado con exito.");
			}
		}
		else Logger.warning("No se puede insertar el arco porque el nodo "+node1+" existe : "+esta1+" y el nodo "+node2+" existe: "+esta2+".");
	}
	
	public void removeNode(int node) {
		boolean esta = nodos.containsKey(node);
		Logger.fine("Se quiere remover el nodo "+node+".");
		if(esta) {
			nodos.remove(node);
			Logger.info("El nodo "+node+" fue removido con exito.");
		}
		else {
			Logger.warning("No se puede remover el nodo "+node+" porque no existe.");
		}
	}
	
	public void removeEdge(int node1, int node2) {
		boolean esta1 = nodos.containsKey(node1);
		boolean esta2 = nodos.containsKey(node2);
		
		Logger.fine("Se quiere remover el arco con los nodos "+node1+" y "+node2+".");
		if(esta1 && esta2) {
			Par<Integer, Integer> par = new Par(node1, node2);
			String key = node1+" "+node2;
			Par<Integer, Integer> value = edge.put(key, par);
			if(value!=null) {
				edge.remove(key);
				Logger.info("El arco con los nodos "+node1+" y "+node2+" fue removido con exito.");
			}
			else {
				Logger.warning("No se puede remover el arco con los nodos "+node1+" y "+node2+" porque no existe.");
			}
		}
		else Logger.warning("No se puede remover el arco porque el nodo "+node1+" existe: "+esta1+" y el nodo "+node2+" existe: "+esta2+".");
	}
	
}