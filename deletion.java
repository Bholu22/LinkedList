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
			public Listnode deleteAtfirst(Listnode head){
				if(head==null){return head;}
				Listnode temp=head;
				head=head.next;
				temp.next=null;
				return temp;
				
			}
			public Listnode deleteAtlast(Listnode head){
				if(head==null){return head;}
				Listnode last=head;
				Listnode previoustolast=null;
				
				while(last.next!=null){
					previoustolast=last;
					last=last.next;
				}     
				previoustolast.next=null;
				return last;
			}
			public Listnode deleteAtgivenpos(Listnode head,int pos){
				int size=length(head);
				if(pos>size || pos<1){
					System.out.println("Invalid position!!");
					return head;
				}
				//Listnode newNode=new Listnode(data);
				if(size==1){
					if(head==null){
						return head;
					}
					Listnode temp=head;
					head=head.next;
					return temp;
				}
				Listnode previous=head;
				int count=1;
				while(count<pos-1){
					previous=previous.next;
					count++;
				}
				Listnode current=previous.next;
				previous.next=current.next;
				current.next=null;
				return current ;
				
				
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
			  
			  //Listnode head=a;
			  a.next=b;
			  b.next=h;
			  h.next=i;
			  i.next=s;
			  s.next=x;
			  x.next=e;
			  e.next=k;
			  
			  SinglyLinkedList sll=new SinglyLinkedList();
			  sll.display(a);
			  System.out.println("The number of letters in name is: "+ sll.length(a));
			  Listnode last=sll.deleteAtlast(a);
			  sll.display(a);
			  System.out.println(last.data);
			 // Listnode last=sll.deleteAtlast(a);
			  //sll.display(a);
			 // System.out.println(last.data);
			   Listnode last1=sll.deleteAtgivenpos(a,5);
			  sll.display(a);
			  System.out.println(last1.data);
			  
			  
		}
			  
	}