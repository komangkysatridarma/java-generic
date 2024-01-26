package generic.application;

import generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Komeng");
        MyData<Integer> integerMyData = new MyData<Integer>(20);

        String stringValue =  stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
