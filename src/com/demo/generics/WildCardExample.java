package src.com.demo.generics;

import java.util.ArrayList;
import java.util.Arrays;

// Generics added
                               // Wildcard added (only bounded to)
public class WildCardExample<T extends Number> {

private Object[] data;
private int DEFAULT_SIZE = 10;
private int size = 0; //size is also working as index value

public WildCardExample(){
this.data = new Object[DEFAULT_SIZE];
}

public void add(T num){
if(this.isFull()){
resize();
}
this.data[size++] = num;
}

private boolean isFull(){
return this.data.length == size;
}

private void resize(){
Object[] temp = new Object[this.data.length*2];
for(int i =0;i<this.data.length;i++){
temp[i] = this.data[i];
}
this.data = temp;
}

public T remove(){
T removedItem = (T)(this.data[--size]);
return removedItem;
}

public T get(int index){
return (T)(this.data[index]);
}

public void set(int index,T num){
this.data[index] = num;
}

public int getSize(){
return this.size;
}

@Override
public String toString() {
return "CustomArrayList{" +
"data=" + Arrays.toString(data) +
", DEFAULT_SIZE=" + DEFAULT_SIZE +
", size=" + size +
'}';
}

public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//
//        System.out.println(list.toString());

WildCardExample list = new WildCardExample();

for (int i=0;i<10;i++){
list.add(i);
}

System.out.println(list.toString());

ArrayList<Integer> list2 = new ArrayList<>();
//        ^ The above thing is called generics
// generics are also called parameterized type

WildCardExample<Number> list3 = new WildCardExample<>();
list3.add(45);
list3.add(2);
System.out.println(list3.toString());
}
}
