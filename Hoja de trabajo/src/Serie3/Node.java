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
public class Node<ADT> implements Position{
    private Object data;
    private Node next;
    private Node prev;

    public Node(Node prev, Object data, Node next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    @Override
    public Object getElement() throws IllegalStateException {
        return data;
    }
     
    public void setData(Object data)
    {
        this.data = data;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    public Node getNext()
    {
        return next;
    }

    public Node getPrev()
    {
        return prev;
    }
}
