package src.com.demo.generics;

import src.com.demo.InterfacesClasses.Nested.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0; //size is also working as index value

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        this.data[size++] = num;
    }

    private boolean isFull(){
        return this.data.length == size;
    }

    private void resize(){
        int[] temp = new int[this.data.length*2];
        for(int i =0;i<this.data.length;i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public int remove(){
        int removedItem = this.data[--size];
        return removedItem;
    }

    public int get(int index){
        return this.data[index];
    }

    public void set(int index,int num){
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

        CustomArrayList list = new CustomArrayList();

        for (int i=0;i<10;i++){
            list.add(i);
        }

        System.out.println(list.toString());

        ArrayList<Integer> list2 = new ArrayList<>();
        //        ^ The above thing is called generics
        // generics are also called parameterized type
    }
}
