class evenodd {
    public static void main(String[] args) {
        int number = 10; 
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}