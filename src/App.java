public class App {
    public static void main(String[] args) throws Exception {
        int x = 2;
        System.out.println("Tabela de multiplicação de "+x);
        multiplica(x);
    }

    static void multiplica(int x){
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x*i));
        }
    }
}