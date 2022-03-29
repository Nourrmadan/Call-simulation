public class LLQueue {
    //inner class Node
    class Node {
        Call incoming;
        Node Next;
        //Node one-argument constructor
        public Node(Call incoming) {
            this.incoming = incoming;
            this.Next = null;
        }
    }
    public Node head=null;
    public Node tail=null;

    //this method is used to enqueue calls
    public void Enqueue(Call incoming){
        Node newNode=new Node(incoming);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.Next=newNode;
            tail=newNode;
        }

    }
    //this method is used to dequeue objects from the queue
    public Call Dequeue(){
        Call temp = head.incoming;
        head = head.Next;
        return temp;

    }

}