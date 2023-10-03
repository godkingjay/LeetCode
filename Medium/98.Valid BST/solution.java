import java.util.*;
public class isValidBST {

  static class Node{
    int data;
    Node left;
    Node right;
  

  Node(int data){
    this.data = data;
  }
  }



 public static boolean isValid(Node root , Node min , Node max){

      if(root == null){
        return true;
      }

      if(min!=null &&root.data <=min.data ){
        return false;
      }

      if(max !=null && root.data >=max.data ){
        return false;
      }
      return isValid(root.left,min,max) && isValid(root.right,root,max);
    }




public static void main(String args[]) {
 if(isValid(null ,null ,null)){
    System.out.println("Valid");
  }else{
    System.out.println("Not Valid");

  }
}
}