class Prime {
  public static boolean checkPrime(int number) {
    for(int i = 2; i < number; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }

  public static void main(String args[]) {
    System.out.println(checkPrime(5));
  }
}
