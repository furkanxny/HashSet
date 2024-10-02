import java.util.ArrayList;

public class MyHashSet {

    private ArrayList<Integer>[] buckets;
    private int numElements;


    public MyHashSet(){

        buckets = new ArrayList[4];
        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }
        numElements = 0;
    }


    public void add(int item){
        int index = item % buckets.length;
        buckets[index].add(item);
    }


    public void show(){
        for(ArrayList<Integer> a :  buckets){
            for(int i = 0; i < a.size(); i++)
                System.out.println(a.get(i));
        }
    }


}
