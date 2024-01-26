package generic.application;

public class BoundedTypeParameterApp {
    public static void main(String[] args) {

        NumberData<Integer> numberData = new NumberData<Integer>(28);
        NumberData<Long> numberData1 = new NumberData<Long>(1L);
//        NumberData<String> numberData2 = new NumberData<String>("Hello"); //error karena bukan class turunan Number

    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
