package day12;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Trees {
    int idx = -1;
    public Node buildtree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node nn = new Node(nodes[idx]);
        nn.left = buildtree(nodes);
        nn.right = buildtree(nodes);
        return nn;
    }
    //pre order
    public void preorder(Node root){
        if(root== null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    //in order
    public void inorder(Node root){
        if(root== null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+"->");
        inorder(root.right);
    }
    //post order
    public void postorder(Node root){
        if(root== null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+"->");

    }
    public int count(Node root){
        if(root== null){
            return 0;

        }
        return count(root.left)+count(root.right)+1;
        
    }
    public int sum(Node root){
        if(root== null){
            return 0;

        }
        return sum(root.left)+sum(root.right)+root.data;
        
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        Trees  ob = new Trees();
        Node root = ob.buildtree(nodes);
        // System.out.println(root.data);
        System.out.println("pre order");
        ob.preorder(root);
        System.out.println("in order");

        ob.inorder(root);
        System.out.println("post order");

        ob.postorder(root);
        System.out.println("count");

        System.out.println( ob.count(root));
        System.out.println("count : "+ ob.sum(root));

    }
}
