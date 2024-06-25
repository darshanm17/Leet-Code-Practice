class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index>=size||head==null)
        return -1;
        Node temp=head;
       while(index>0){
        temp=temp.next;
        index--;
       }
      
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        if(head==null)
        head=node;
        else{
            node.next=head;
            head=node;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        if(head==null){
      head=node;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        }
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        if(index<0|| index>size){
            return;
        }
        else if(index==0){
            addAtHead(val);
        }else{
        Node node =new Node(val);
        Node temp=head;
        for(int i=0;i<index-1;i++){
                temp=temp.next;
        }
    node.next=temp.next;
    temp.next=node;
       
        size++;
        }

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size ||head==null)
        return;
        else if(index==0){
            head=head.next;
        }
        else if(index==size-1){
            Node temp=head;
            while(temp.next.next!=null){
            temp=temp.next;
            }
            temp.next=null;
        }
        else {
            Node temp=head;
            for(int i=0;i<index-1;i++){
           
                temp=temp.next;
            }
            temp.next=temp.next.next;
            
        }
        size--;
    }
    // public void display(Node head){
    //     Node temp=head;
    //     while(temp!=null){
    //         System.out.print(temp.data);
    //         temp=temp.next;
    //     }
    //     System.out.println();
    // }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */