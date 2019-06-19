  public Node pairwise_swap(Node node)
    {
        // your code here
         Node temp = node; 
  
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) { 
  
            /* Swap the data */
            int k = temp.data; 
            temp.data = temp.next.data; 
            temp.next.data = k; 
            temp = temp.next.next; 
         }
         return node;
    }
