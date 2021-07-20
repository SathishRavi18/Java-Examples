import java.util.EmptyStackException;



public class Stack {
    public ListNode top;
    public int length;
    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data ){
            this.data = data;
        }
    }
    public Stack(){
        top=null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        temp = top;
        length++;
    }

    public int pop(){
        if(isEmpty()){
        //return -1;
        throw new EmptyStackException();}

        int result = top.data;
        top = top.next;
        length--;

        return result;

    }

    public int peek(){
        if(isEmpty()){
        //return -1;
        throw new EmptyStackException();}
        return top.data;

    }




    



    public static void main(String args[]){
        Stack st = new Stack();
        st.push(10);
        st.push(15);
        st.push(20);

        System.out.println(st.peek());

        st.pop();

        System.out.println(st.peek());
        
    }
    
}
