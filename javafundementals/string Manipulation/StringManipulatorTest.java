public class StringManipulatorTest{
public static void main(String[] args){

StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld

StringManipulator manipulator1 = new StringManipulator();
char letter = 'o';
Integer a = manipulator1.getIndexOrNull("Coding", letter);
Integer b = manipulator1.getIndexOrNull("Hello World", letter);
Integer c = manipulator1.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null


}


}