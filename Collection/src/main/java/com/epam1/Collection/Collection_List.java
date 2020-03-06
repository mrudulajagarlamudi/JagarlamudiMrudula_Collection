package com.epam1.Collection;
import java.util.Arrays;

public class Collection_List<E> {
		    
		    private int len = 0;
		     
		    
		    private static final int Min_Capacity = 10;
		     
		        private Object Numbers[];
		 
		    public Collection_List() {
		    	Numbers = new Object[Min_Capacity];
		    }
		 
		    public void add(E e) {
		        if (len == Numbers.length) {
		            ensureCapacity();
		        }
		        Numbers[len++] = e;
		    }
		     
		    @SuppressWarnings("unchecked")
		    public E get(int j) {
		        if (j >= len || j < 0) {
		            throw new IndexOutOfBoundsException("Index: " + j + ", Size " + j);
		        }
		        return (E) Numbers[j];
		    }
		     
		    @SuppressWarnings("unchecked")
		    public E remove(int k) {
		        if (k >= len || k < 0) {
		            throw new IndexOutOfBoundsException("Index: " + k + ", Size " + k);
		        }
		        Object item = Numbers[k];
		        int numElts = Numbers.length - ( k + 1 ) ;
		        System.arraycopy( Numbers, k + 1, Numbers, k, numElts ) ;
		        len--;
		        return (E) item;
		    }
		     
		    public int size() {
		        return len;
		    }
		     
		    @Override
		    public String toString() 
		    {
		         StringBuilder sb = new StringBuilder();
		         sb.append('[');
		         for(int i = 0; i < len ;i++) {
		             sb.append(Numbers[i].toString());
		             if(i<len-1){
		                 sb.append(",");
		             }
		         }
		         sb.append(']');
		         return sb.toString();
		    }
		     
		    private void ensureCapacity() {
		        int newSize = Numbers.length * 2;
		        Numbers = Arrays.copyOf(Numbers, newSize);
		    }

			}


