class SinglyLinkedListsum{
			
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
			public Listnode sumofnodes(Listnode a, Listnode v){
				Listnode res=null;
				Listnode temp=null,prev=null;
				int carry=0,sum=0;
				while(a!=null ||v!=null){
					sum=carry + (a!=null?a.data:0) + (v!=null?v.data:0);
					carry=(sum>=10?1:0);
					sum=sum%10;
					Listnode newNode=new Listnode(sum);
					temp=newNode;
					
					if(res==null)
						res=temp;
					else
						prev.next=temp;
					prev=temp;
					
					if(a!=null)a=a.next;
					if(v!=null)v=v.next;
				}
				Listnode newNode=new Listnode(carry);
				if(carry>0)
					prev.next=newNode;
				return res;
			}
			public static void main(String args[])
			{
			  Listnode a =new Listnode(5);
			  Listnode b =new Listnode(7);
			  Listnode h =new Listnode(9);
			  Listnode i =new Listnode(9);
			  
			  
			  Listnode firsthead=a;
			  a.next=b;
			  b.next=h;
			  h.next=i;
			 
			  
			  Listnode v =new Listnode(7);
			  Listnode d =new Listnode(1);
			  Listnode s =new Listnode(9);
			 
			  
			  Listnode secondhead=v;
			  v.next=d;
			  d.next=s;
			 
			  SinglyLinkedListsum sll=new SinglyLinkedListsum();
			  sll.display(a);
			  sll.display(v);
			  Listnode result=sll.sumofnodes(a,v);
			  sll.display(result);
			  
			}
}	
			