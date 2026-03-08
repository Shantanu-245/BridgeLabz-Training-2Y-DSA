
import java.util.*;

class Node{

    String name;
    int size;
    List<Node> children=new ArrayList<>();

    Node(String name,int size){
        this.name=name;
        this.size=size;
    }
}

public class DirectorySizeCalculator {

    static int calculate(Node node){

        int total=node.size;

        for(Node child:node.children){
            total+=calculate(child);
        }

        return total;
    }

    public static void main(String[] args){

        Node root=new Node("project",0);

        Node src=new Node("src",0);
        src.children.add(new Node("main.java",100));
        src.children.add(new Node("utils.java",50));

        Node docs=new Node("docs",0);
        docs.children.add(new Node("readme.txt",10));

        Node guides=new Node("guides",0);
        guides.children.add(new Node("setup.pdf",200));

        docs.children.add(guides);

        root.children.add(src);
        root.children.add(docs);
        root.children.add(new Node("config.xml",20));

        int total=calculate(root);

        System.out.println("Total Directory Size = "+total+" KB");
    }
}
