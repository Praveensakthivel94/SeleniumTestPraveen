public class EvenOddIndexElements {
 public static void main(String[] args) {
 String[] elements = {"Java", "Selenium", "TestNG", "Maven", "Jenkins", "Docker"};
 System.out.print("Even index elements: ");
 for (int i = 0; i < elements.length; i = i+2) {
 System.out.print(elements[i] + " ");
 }
 
 System.out.print("\nOdd index elements: ");
 for (int i = 1; i < elements.length; i =i+2) {
 System.out.print(elements[i] + " ");
 }
 }
}