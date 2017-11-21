/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie3;

/**
 *
 * @author Pablo Herrera
 */
public class ManoCartas <ADT>{
    
    private Node first;
    private Node last;
    private int size;   
    public void AgragarCartas(int valor, String categoria){
        
           PositionalList PL = new PositionalList() {
               @Override
               public boolean isEmpty() {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }
          
               @Override
        public void addFirst(Object e) {
        Node node;
        if(isEmpty())
        {
            Node prev = null;
            Node next = null;
            node  = new Node(prev,e,next);
            first = node;
            last = node;
        }
        else
        {
            Node prev = null;
            Node next = first;
            node  = new Node(prev,e,next);
            first.setPrev(node);
            first = node;
        }
        size++;
               }

               @Override
               public Position addLast(Object e) {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Position before(Position p) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Position after(Position p) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Position addBefore(Position p, Object e) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Position addAfter(Position p, Object e) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Object set(Position p, Object e) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }

               @Override
               public Object remove(Position p) throws IllegalArgumentException {
                   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               }
           }; 
    }
}
