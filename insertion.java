 class SinglyLinkedList{
			
			private static class Listnode{
				private int data;
				private Listnode next;
				
				public Listnode(int data){
					this.data=data;
					this.next=null;
				}
			}
			public int length(Listnode head){
				if(head==null){return 0;}
				int count=0;
				Listnode current=head;
				while(current!=null){
					count++;
					current=current.next;
				}
				return count;
			}
			public void display(Listnode head){
				if(head==null){
					System.out.println("No elements to display in  the list!!!!!!!");
				}
				Listnode current=head;
				while(current!=null){
					System.out.print(current.data+"-->");
					current=current.next;
				}
				System.out.println(current);
			}
 			public Listnode insertAtfirst(Listnode head,int data){
				Listnode newNode =new Listnode(data);
				if(head==null){return newNode;}
				newNode.next=head;
				head=newNode;
				return head;
			}
			public Listnode insertAtlast(Listnode head,int data){
				Listnode newNode =new Listnode(data);
				if(head==null){return head;}
				Listnode current=head;
				while(current.next!=null){
					current=current.next;
				}
				current.next=newNode;
				return head;
			}
			public Listnode insertAtgivenpos(Listnode head, int data,int pos){
				int size=length(head);
				if(pos>size || pos<1){
					System.out.println("Invalid position!!");
					return head;
				}
				Listnode newNode=new Listnode(data);
				if(size==1){
					if(head==null){
						return newNode;
					}
					newNode.next=head;
					head=newNode;
					return head;
				}
				Listnode previous=head;
				int count=1;
				while(count<pos-1){
					previous=previous.next;
					count++;
				}
				Listnode current=previous.next;
				newNode.next=current;
				previous.next=newNode;
				return head;
				
				
			}
			public void insertAtafternode(Listnode previous,int data){
				if(previous==null){System.out.println("previous node cannot be null ");}
				Listnode newNode=new Listnode(data);
				newNode.next=previous.next;
				previous.next=newNode;
				
			}
			public static void main(String args[])
			{
			  Listnode a =new Listnode(11);
			  Listnode b =new Listnode(22);
			  Listnode h =new Listnode(33);
			  Listnode i =new Listnode(44);
			  Listnode s =new Listnode(55);
			  Listnode x=new Listnode(66);
			  Listnode e =new Listnode(77);
			  Listnode k =new Listnode(88);
			  
			  Listnode head=a;
			  a.next=b;
			  b.next=h;
			  h.next=i;
			  i.next=s;
			  s.next=x;
			  x.next=e;
			  e.next=k;
			  
			  SinglyLinkedList sll=new SinglyLinkedList();
			  sll.display(a);
			  System.out.println("The number of elements in the list is: "+ sll.length(a));
			  Listnode head1=sll.insertAtfirst(a,13);
			  sll.display(head1);
			  System.out.println("The new element inserted at firt is: "+ head1.data);
			  Listnode head2=sll.insertAtlast(a,14);
			  sll.display(head2);
			 // System.out.println("The new element inserted at last is: "+ head2.data);
			 Listnode head3=sll.insertAtgivenpos(a,15,6);
			  sll.display(head3);
			  System.out.println("The number of elements in the list is: "+ sll.length(head3));
			  sll.insertAtafternode(i,16);
			  sll.display(a);
			  
		}
			  
	}