package tdpp1;

public class tester {

	public static void main(String[] args) {
		
		Graph gp = new Graph();
		gp.addNode(1);
		gp.addNode(1);
		gp.addNode(2);
		gp.addNode(5);
		
		gp.addEdge(1, 2);
		gp.addEdge(1, 5);
		
		gp.removeNode(6);
		gp.removeNode(5);
		
		gp.removeEdge(1, 2);
		gp.removeEdge(5, 4);
		
	}

}
