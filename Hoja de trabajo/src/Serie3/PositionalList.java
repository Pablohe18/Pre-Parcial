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
public interface PositionalList<ADT> {
        int size( );
	boolean isEmpty( );
	Position<ADT> first( );
	Position<ADT> last( );
	Position<ADT> addFirst(ADT e);
	Position<ADT> addLast(ADT e);
	Position<ADT> before(Position<ADT> p) throws IllegalArgumentException;
	Position<ADT> after(Position<ADT> p) throws IllegalArgumentException;
	Position<ADT> addBefore(Position<ADT> p, ADT e) throws IllegalArgumentException;
	Position<ADT> addAfter(Position<ADT> p, ADT e) throws IllegalArgumentException;
	ADT set(Position<ADT> p, ADT e) throws IllegalArgumentException;
	ADT remove(Position<ADT> p) throws IllegalArgumentException;
}
