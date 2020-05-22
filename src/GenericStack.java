import java.lang.reflect.Array;

public class GenericStack<T> {
    private T[] stack = null;
    private int counter = 0;

    public GenericStack(int size) {
        super();
        stack=(T[]) new Object[size];
    }
    
    public void push(T obj){
        if(counter >= stack.length){
            T[] temp = (T[])new Object[stack.length*2];
           for (int i = 0; i < stack.length; i++)
               temp[i]=stack[i];
            stack=temp;
        }
        Array.set(stack, counter++, obj);
    }

    public T pop(){
        if(counter <= stack.length/2){
            T[] tempArr = (T[])new Object[stack.length/2];
            for (int i = 0; i < counter; i++)
                tempArr[i]=stack[i];
            stack=tempArr;
        }
        T temp =stack[--counter];
        stack[counter] =null;
        return temp;
    }

    public String display(){ 
        String text = "";
        for (T t : stack)
            if(t!=null)
                text+=t.toString()+"\n";
        return text;
    }
    public int getSize(){return stack.length;}
    public int getElementCount(){return counter;}                                                                    
}