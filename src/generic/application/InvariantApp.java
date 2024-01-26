package generic.application;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Komeng");
//      doIt(stringMyData); //error
//      MyData<Object> objectMyData = stringMyData; //ERROR

        MyData<Object> objectMyData = new MyData<>(2000);
//        doItInteger(objectMyData); //error
//        MyData<String> stringMyData1 = objectMyData; //error

    }

    public static void doIt(MyData<Object> objectMyData){
        //do nothing
    }
    public static void doItInteger(MyData<Integer> integerMyData){
        //do nothing
    }
}
