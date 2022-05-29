class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 30; i++) {
            System.out.println(f.fibo(i) + " ");
        }
    }
}