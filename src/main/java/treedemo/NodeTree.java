package treedemo;

/**
 * 简单二叉树
 * <ul>
 *     <li>所有节点存储一个关键字</li>
 *     <li>非叶子节点的左指针指向小于其关键字的子树，右指针指向大于其关键字的子树</li>
 *     <li>参考链接：https://blog.csdn.net/liaodehong/article/details/52767285</li>
 * </ul>
 * Created by liuBo on 2018/3/28.
 */
public class NodeTree {

    private int data;
    private NodeTree left;
    private NodeTree right;

    /**
     * 初始化树根节点
     * @param data
     */
    public NodeTree(int data){
        this.data = data;
        left = null;
        right = null;
    }

    private void insertNode(NodeTree root,int data){
        if(data > root.data){
            if(null == root.right){
                root.right = new NodeTree(data);
            }else{
                this.insertNode(root.right,data);
            }
        }else{
            if(null == root.left){
                root.left = new NodeTree(data);
            }else{
                this.insertNode(root.left,data);
            }
        }
    }

    private static void preOrder(NodeTree root){
        if(null != root){
            System.out.println(root.data+" - ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args){
        int[] array = {35,17,39,9,28,65,56,87};
        NodeTree root = new NodeTree(array[0]);
        for(int i = 1; i < array.length; i++){
            root.insertNode(root,array[i]);
        }
        System.out.println("先序遍历");
        preOrder(root);
    }
}
