package graph;

public class Edge<T> {
    public int weight;
    public Node<T> node;

    public Edge(Node<T> node){
        this(node, 1); }

    public Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

   }
