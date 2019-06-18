public Node reverseList(Node temp){  
        Node current = temp;  
        Node prevNode = null, nextNode = null;  
          
       //Swap the previous and next nodes of each node to reverse the direction of the list  
        while(current != null){  
            nextNode = current.next;  
            current.next = prevNode;  
            prevNode = current;  
            current = nextNode;  
        }  
        return prevNode;  
    } 
    public int length(Node head){
				if(head==null){return 0;}
				int count=0;
				Node current=head;
				while(current!=null){
					count++;
					current=current.next;
				}
				return count;
			}
			
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        Node current = head;  
        boolean flag = true;
        int size=length(head);
          
        //Store the mid position of the list  
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
          
        //Finds the middle node in given singly linked list  
        for(int i=1; i<mid; i++){  
            current = current.next;  
        }  
          
        //Reverse the list after middle node to end  
        Node revHead = reverseList(current.next);  
   
        //Compare nodes of first half and second half of list  
        while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
   
        if(flag)  
            return true;  
        else  
            return false;
    }
