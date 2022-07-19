import java.util.List; 
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
class Satellite {
    //Assuming all are unique
    static int indexOfCharacter(List<Character> arr, char targetCharacter, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr.get(i) == targetCharacter){
                return i;
            }
        }
        return -1;
    }
    
    static Node build(List<Character> preorder, List<Character> inorder, int preorderStart, int preorderEnd, int inorderStart, int inorderEnd){
        if(preorderStart > preorderEnd || inorderStart > inorderEnd){
            return null;
        }
        Node root = new Node(preorder.get(preorderStart));
        int irootindex = indexOf(inorder, preorder.get(preorderStart), inorderStart, inorderEnd);
        int length = irootindex - inorderStart;
        root.left = build(preorder, inorder, preorderStart + 1, preorderStart + length, inorderStart, irootindex - 1);
        root.right = build(preorder, inorder, preorderStart + length + 1, preorderEnd, irootindex + 1, inorderEnd);
        return root;
    }
    public Tree treeFromTraversals(List<Character> preorder, List<Character> inorder) {
        if (preorder.size() != inorder.size())
            throw new IllegalArgumentException("traversals must have the same length");
        if (!preorder.stream().collect(toSet()).equals(inorder.stream().collect(toSet())))
            throw new IllegalArgumentException("traversals must have the same elements");
        if (preorder.stream().collect(toSet()).size() != preorder.size())
            throw new IllegalArgumentException("traversals must contain unique items");
        
        int size = preorder.size();
        return new Tree(build(preorder, inorder, 0, size - 1 , 0,  size -1));
    }
}