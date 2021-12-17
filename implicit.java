class implicit {
    public static void main(String args[]) {
        char c = 'A';
        int i = 5;
        float f = 14.5f;
        double d = 2.0d;
        d = c+i+f/d;
        System.out.println(d);
    }
}