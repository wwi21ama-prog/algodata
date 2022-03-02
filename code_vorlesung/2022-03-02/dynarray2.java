class DynArray {
    public int[] data;
    public int currentSize;
  
    public DynArray() {
      data = new int[5];
    }
  
    public void add(int x) {
      if (data.length == currentSize) {
        int[] replacement = new int[2 * data.length];
        for (int i=0; i<data.length; i++) {
          replacement[i] = data[i];
        }
        data = replacement;
      }
  
      data[currentSize] = x;
      currentSize++;
    }
  
    public int get(int pos) {
      // TODO: Bereichsprüfung machen:
      // if (pos < currentSize) {...}
      return data[pos];
    }
  }
  
  class Main {
    public static void main(String[] args) {
      DynArray d1 = new DynArray();
      
      System.out.println(d1.data.length);
      System.out.println(d1.currentSize);
  
      d1.add(42);
      System.out.println(d1.data.length);
      System.out.println(d1.currentSize);
      
      d1.add(100);
      d1.add(100);
      d1.add(100);
      d1.add(100);
      System.out.println(d1.data.length);
      System.out.println(d1.currentSize);
      
      d1.add(200);
      System.out.println(d1.data.length);
      System.out.println(d1.currentSize);
  
      System.out.println(d1.get(3));
    }
  }