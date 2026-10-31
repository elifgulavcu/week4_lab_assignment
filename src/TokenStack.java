public class TokenStack {
    private class Node{
        String data ;
        Node next ;

        Node(String data){
            this.data = data;
            this.next = null ;
        }
    }
    private Node top ;

    public boolean isEmpty(){
        return ( top ==null);
    }
    public void push(String value){
        Node newNode = new Node(value);
        if(isEmpty()){
            top = newNode ;
        }else{
            newNode.next = top ;
            top = newNode;
        }
    }

    public String pop(){
        if(isEmpty()){
            return null ;
        }else{
            String poppedData = top.data ;
            top = top.next;
            return poppedData;
        }
    }
}
