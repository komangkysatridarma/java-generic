package generic.application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> myData = new MyData<>("Meng");
        myData.setData(2000); //jadi kan tadi ada Object lalu di konversi menjadi String di method proses, nah ketika saya set si object nya menjadi integer tidak akan error di code, tapi saat dijalankan akan error karena string ke integer tidak akan bisa
        MyData<? super String> myData1 = myData;

        proses(myData);

        System.out.println(myData.getData());

    }

    public static void proses(MyData<? super String> myData1){
        String value = (String) myData1.getData();
        System.out.println(value);
        myData1.setData("Hello");
    }
}
