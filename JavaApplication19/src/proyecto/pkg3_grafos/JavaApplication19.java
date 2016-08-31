/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg3_grafos;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.visualization.VisualizationImageServer;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Miguel A. Ardon E
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DirectedSparseGraph g = new DirectedSparseGraph();
    g.addVertex("Vertex1");
    g.addVertex("Vertex2");
    g.addVertex("Vertex3");
    g.addEdge("Edge1", "Vertex1", "Vertex2");
    g.addEdge("Edge2", "Vertex1", "Vertex3");
    g.addEdge("Edge3", "Vertex3", "Vertex1");
    VisualizationImageServer vs =
      new VisualizationImageServer(
        new CircleLayout(g), new Dimension(200, 200));
 
    JFrame frame = new JFrame();
    frame.getContentPane().add(vs);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
    
}
