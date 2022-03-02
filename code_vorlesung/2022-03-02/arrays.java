import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    int[] a1 = new int[5];
    int[] a2 = {1,3,5,7,9};

    System.out.println(a1[4]);
    //System.out.println(a1[5]);
    System.out.println(a2[3]);

    ArrayList<Integer> a3 = new ArrayList<>();
    a3.add(25);
    a3.add(38);
    System.out.println(a3);
  }
}