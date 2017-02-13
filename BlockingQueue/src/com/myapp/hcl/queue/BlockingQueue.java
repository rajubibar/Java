package com.myapp.hcl.queue;

import java.util.LinkedList;

public class BlockingQueue{

private int tail=list.length();
private bound;
LinkedList list = new LinkedList();

void BlockingQueue(int upperBound){
 this.bound=upperBound;
}
 
public void push(int element){
  if(tail==bound)
  {
   System.out.println("The queue is full wait for it to be available.");
   
  }
  else{
  
   list.add(element);
   tail+=1;
  
  }
 
 }

public void pull(){
 if(tail==0)
  {
   System.out.println("The queue is empty wait for element to be added.");
   
  }
  else{
  
   list.remove();
   tail--;
  
  }
  

}
 
}