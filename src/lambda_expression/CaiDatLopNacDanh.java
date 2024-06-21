package lambda_expression;

public class CaiDatLopNacDanh {
    public static void main(String[] args) {
        //Cai dat lop Anonymous class (lop nac danh)
        MyInterface obj = new MyInterface() {
            @Override
            public int cong(int a, int b) {
                return a+b;
            }

            public int tru(int a, int b) {
                return a-b;
            }
        };

        System.out.println(obj.cong(10,20));
    }
}
