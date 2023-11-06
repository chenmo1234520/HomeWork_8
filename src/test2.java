
class MyException extends Exception {
  public MyException() {

  }

}

class Student {
  void speak(int m) {
    try {
      if (m > 1000) {
        throw new MyException();
      }

    } catch (MyException e) {
      System.out.println(e + ":超出范围值1000");

    }

  }
}

public class test2 {
  public static void main(String[] args) {
    Student s = new Student();
    s.speak(111111);
  }
}
