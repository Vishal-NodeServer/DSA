class LL {
    Node head;

    class Node{
        String data;
        Node next;
        

        //create single node [data] -> [data]
        Node(String data){
            this.data = data;
            this.next = null;  //in the begning the first node is null ://
        }
    }
 //insert at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){  //head is empty
            head = newNode;  //newNode will be head if empty
            return;

        } //else
        newNode.next = head;   //existing Node will be newNode.next  [head]-->[next]
        head = newNode;        //newNode will be head  [head]-->null || [newhead]->[next]-null
    }

// insert at last
    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
           head =  newNode;
           return;
        }
    
      //linklist ko travel krr rhe hai jab tak last node tak nhi aate 
      //that's set  is called traverse krna
        Node currNode = head;  //node that is head update every time 
         while(currNode.next != null){ //currNode jab tak null nhi hojata
          
            currNode = currNode.next;  //null --> head bnaya hai abhi k liye
        } 

        currNode.next = newNode;  //null meh node horha hai
    }

    public void printlist(){

        if(head == null){
            System.out.println("list is empty hahaha");
            return;
        }
        Node currNode = head;  //node that is head update every time 
         while(currNode != null){ //currNode jab tak null nhi hojata
          
           System.out.print(currNode.data + "--->");
           currNode = currNode.next; 
        } 
        System.out.print("Null");



    }



    public static void main(String args[]){

        LL list = new LL(); //init class object
        //insert  --> first , last 

        list.addFirst("vishal");
        list.addFirst("vijay");
        list.addFirst("chetan");
        list.addFirst("roshni");
        list.printlist();
        //Display
        //delete
        //Size

    }
}