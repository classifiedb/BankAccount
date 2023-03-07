package bank.analysis;

// import java.util.LinkedList;

public class account_list{
    account_node head;

    account_list(){
        /*
        constructor
        */
        head = null; //this is because we working with type account_list
    }

    public void insert_to_front(account_node node){
        /*
        Insert node n into the front of the linkedlist.
        */
        if(head == null){
            head = new account_node(node);
        } else{
            account_node temp = new account_node(node);
            temp.next = head;
            head = temp;
        }
    }

    public void insert_increasing_actnum(account_node n){
        /*
        Insert node n into the linkedlist in increasing order of account number.
        */
        account_node temp = head; // so we do not loose the existing linked list pointer so we don't loose existing nodes (temporary pointer)
            if(head == null || temp.actNum > n.actNum){
                insert_to_front(n);
            }else{
                // finding the increasing position for n
                while(temp.next != null && n.actNum > temp.next.actNum){
                temp = temp.next;
            }
            // temp points at the suitable position
            account_node copy = new account_node(n);
            copy.next = temp.next; // copy and temp both point to temp.next so we don't loose the linkedlist 
            temp.next = copy; 
        }
    }

    public void insert_decreasing_balance(account_node n){
        /*
        Insert node n into the linkedlist in decreasing order of account balance.
        */
        account_node temp = head; // so we do not loose the existing linked list pointer so we don't loose existing nodes (temporary pointer)
            if(head == null || temp.balance < n.balance){
                insert_to_front(n);
            }else{
                // finding the increasing position for n
                while(temp.next != null && n.balance < temp.next.balance){
                temp = temp.next;
            }
            // temp points at the suitable position
            account_node copy = new account_node(n);
            copy.next = temp.next; // copy and temp both point to temp.next so we don't loose the linkedlist 
            temp.next = copy; 
        }
    }

    public void searchNode(int act){
        /*
        Use a while loop to search a node in the linkedlist based on account number (act)
        display the node data if found; display message "Account not found!" if not found.
        */
        account_node temp = head;
        while(temp != null && act != temp.actNum){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("account number not found");
        }else{
            System.out.println("account number is:" + act);
        }
        //implement a function that prints all the node data in account_node.java class and call it here

    }
    
    public void showNodes(){
        /*
        Use a while loop to display all nodes in the linkedlist.
        */
        account_node temp = head;
        while(temp != null){
            //call the printing function
            temp = temp.next;
        }
    }
}
