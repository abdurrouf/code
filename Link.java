/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;
 
public class Link
{
    public static void main(String args[])
    {
        LinkList list =new LinkList();
        list.add(12);
        list.add(34);
        list.add(400);
        list.add(1200);
        
        list.display();
        
    }
}

class LinkList{
    Node head;
    public void add(int val){
        Node newNode=new Node(val);
        newNode.next=null;
        if (head==null) {
            head=newNode;
        }
        else{
            Node node=head;
            while (node.next!=null) {                
                node=node.next;
            }
            node.next=newNode;
        }
    }
    void display(){
        Node node=head;
        
        while (node!=null) {            
            System.out.println(node.val);
            node=node.next;
        }
        
    }
}

class Node{
    int val;
    Node next;
    public Node(int val) {
        this.val=val;
    }
    
}