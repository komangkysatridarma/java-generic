package generic.application;

import generic.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(200));
        print(new MyData<String>("Komeng"));

    }

    public static void print(MyData<?> myData){ //wildcard memakai (<?>)
        System.out.println(myData.getData());
    }
}
