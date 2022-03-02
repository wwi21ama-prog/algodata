class Main {
    public static void main(String[] args) {
      int[] a = new int[0]; 
  
      a = add(a,42);
      //a.add(42);
      a = add(a,35);
      //a.add(35);
      
  
      System.out.println(a[1]);
    }
  
    public static int[] reallocate(int[] array, int size) {
      int[] replacement = new int[size];
  
      for (int i = 0; i<array.length; i++) {
        replacement[i] = array[i];
      }
      return replacement;
    }
  
    public static int[] add(int[] array, int data) {
      // Vereinfachte Version:
      // Auf jeden Fall zuerst reallocate aufrufen
      // und dann den neuen Wert schreiben.
      array = reallocate(array, array.length + 1);
      array[array.length-1] = data;
      return array;
    }
  }
  