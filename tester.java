package tdpp1;

public class tester {

	public static void main(String[] args) {
		
		Graph gp = new Graph();
		
		gp.addNode(1);
		gp.addNode(1);
		gp.addNode(2);
		gp.addNode(3);
		gp.addNode(4);
		gp.addNode(5);
		
		gp.addEdge(1, 2);
		gp.addEdge(1, 2);
		gp.addEdge(1, 5);
		gp.addEdge(2, 5);
		gp.addEdge(0, 7);
		
		gp.removeNode(6);
		gp.removeNode(5);
		gp.removeNode(3);
		
		gp.removeEdge(1, 2);
		gp.removeEdge(5, 4);
		gp.removeEdge(2, 4);
		gp.removeEdge(2, 5);
	}

}
