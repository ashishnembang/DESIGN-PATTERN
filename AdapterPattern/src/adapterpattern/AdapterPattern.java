/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

interface StackTarget{
    public void push(int value);
    public int pop();
}

interface QueueTarget{
    public void enqueue(int value);
    public int dequeue();
}

class Adapter implements StackTarget, QueueTarget{
    Adaptee adaptee;

    public Adapter(){}
    
    @Override
    public void push(int value) {
        System.out.println(value);
        adaptee.add(value);
    }

    @Override
    public int pop() {
        return adaptee.remove();
    }

    @Override
    public void enqueue(int value) {
        adaptee.add(value);
    }

    @Override
    public int dequeue() {
        return adaptee.remove();
    }
}

class Adaptee{
    private final int[] data;
    //private final int start = -1;
    private int end;
    private final int start;
    public Adaptee(){
        data = new int[5];
        start = -1;
        end = 0;
    }
    
    public void add(int value){
        data[end] = value;
        end++;
    }
    
    public int remove(){
        int value = data[end];
        end--;
        return value;
    }
}
public class AdapterPattern {

    public static void main(String[] args) {
        StackTarget stack = new Adapter();
        
        stack.push(20);
        System.out.println("Pop"+ stack.pop());
            
    }
    
}
