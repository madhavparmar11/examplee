class evenodd {
    public static void main() {
        for (int num = 1; num <= 5; num++) {
            System.out.print(num);
            if (num % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        evenodd obj = new evenodd();
        obj.main();
    }
}
