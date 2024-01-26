package generic.application;

public class MultipleBoundedTypeApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<Manager>(new Manager()); //error karena tidak implement canSayHello
        Data<VicePrecident> vicePrecidentrData = new Data<VicePrecident>(new VicePrecident());
    }
    public static interface canSayHello{
        void sayHello(String name);
    }

    public static abstract class employee{

    }

    public static class Manager extends employee{

    }

    public static class VicePrecident extends employee implements canSayHello{
        @java.lang.Override
        public void sayHello(java.lang.String name) {
            System.out.println("Hello" + name);
        }
    }

    public static class Data<T extends employee & canSayHello>{
        private T data;

        public Data(T data) {
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
