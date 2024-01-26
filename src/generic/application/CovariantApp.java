package generic.application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> myData = new MyData<String>("komeng");
        proses(myData);

        MyData<? extends Object> myData1 = myData; //bisa seperti ini atau seperti di bawah (method)

    }

    public static void proses(MyData<? extends Object> myData){
        System.out.println(myData.getData());
//        myData.setData("Woi"); //tidak boleh karena berbahaya
    }
}
