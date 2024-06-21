package lambda_expression;

public class SuDung_Lambda {
    public static void main(String[] args) {
        //Bieu thuc Lambda
        MyInterface obj = (a,b)->a+b;

        System.out.println(obj.cong(10,20));
    }
}
