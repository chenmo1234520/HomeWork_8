import java.util.InputMismatchException;
import java.util.Scanner;

class Number {
    int num;

    int count(int a, int b) {
        try {
            this.num = a * b;
            if (this.num < 0) {
                throw new Exception();
            } else {
                return this.num;
            }

        } catch (Exception e) {
            System.out.println("结果不是正数");

        }
        return this.num;
    }
}

class Test {
    Scanner sc = new Scanner(System.in);
    int num;
    int age;

    public void setAge(int age) {
        try {
            if (age >= 1 & age <= 100) {
                this.age = age;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println(e + ":数值超出范围1-100");

        }

    }

    void input() {
        System.out.println("请输入数字 1.java 2.python 3.linux");
        try {
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("java");
            } else if (num == 2) {
                System.out.println("python");
            } else if (num == 3) {
                System.out.println("linux");
            } else {
                throw new Exception();
            }

        } catch (InputMismatchException e) {
            System.out.println(e + ":输入的类型不是数字");
        } catch (Exception e) {
            System.out.println("error:" + "没有这个编号");
        }
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Test t = new Test();
        t.input();
        t.setAge(800);
        Number n = new Number();

        System.out.println(n.count(-1, 5));

    }
}
