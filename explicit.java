class explicit {
    public static void main(String args[]) {
        double a = 5.0, b = 2.5;
        int c = (int)(a+b); //explicit
        double d = a+b+c; //implicit
        System.out.println(c);
    }
}