import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.util.Collections;

class Element implements Comparable<Element> {
  int key;  // Schlüssel, nach denen Daten durchsucht und sortiert werden.
  int value;  // Werte, die zu jedem Schlüssel gehören.
  Element next; // Zeiger auf den Nachfolger.

  public Element() {}

  public Element(int key, int value) {
    this.key = key;
    this.value = value;
    this.next = new Element();
  }
  
  public String toString() {
    return "(" + key + "," + value +  ")";
  }

  public int compareTo(Element other) {
    if (this.key < other.key) { return -1; } 
    if (this.key == other.key) { return 0; }
    return 1;
  }

  public void printList() {
      if (this.isValid()) {
          System.out.println(this);
          next.printList();
      }
  }

  public boolean isValid() {
      return next != null;
  }

    // Liefert das Ende der Liste (den Dummy am Ende):
    public Element getEnd() {
    
    }
  
    // Hängt ein neues Element mit den gegebenen Werten ans Ende an:
    public void add(int key, int value) {
      
    }
}



class FindAndSort {
  public static void main(String[] args) {

    // ArrayList erstellen und mit unsortierten Zahlen befüllen.
    List<Integer> l1 = new ArrayList<>(Arrays.asList(42,35,23,57,107,14));
    System.out.println(l1);

    // Position des Elements "42" bestimmen.
    int i1 = Collections.binarySearch(l1, 42);
    System.out.println(i1); // Unsinnige Ausgabe, da die Liste nicht sortiert ist.

    // Liste sortieren:
    Collections.sort(l1);
    System.out.println(l1);

    // Position des Elements "42" bestimmen.
    int i2 = Collections.binarySearch(l1, 42);
    System.out.println(i2);

    // Liste mit selbst definierten Elementen erstellen.
    Element e1 = new Element(42,155);
    Element e2 = new Element(23,123);
    Element e3 = new Element(107,370);
    Element e4 = new Element(38,1024);
    List<Element> l2 = new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
    System.out.println(l2);

    // Zwei Elemente "von Hand" vergleichen:
    System.out.println("e1.compareTo(e2): " + e1.compareTo(e2));

    // Diese Liste sortieren:
    Collections.sort(l2, Collections.reverseOrder());
    System.out.println(l2);    
    
    
    // Eine verkettete Liste aus den obigen Elementen zusammenbauen.
    e1.next = e2;
    e2.next = e3;
    e3.next = e4;
    e4.next = new Element();

    // Die Liste ausgeben:
    Element current = e1;
    while (current != null) {
        System.out.println(current);
        current = current.next;
    }

    System.out.println();
    System.out.println();

    e1.printList();

    e1.add(15,155); // Sollte dazu führen, dass das Paar (15,155) am Ende steht.
    e1.printList();
  }
}