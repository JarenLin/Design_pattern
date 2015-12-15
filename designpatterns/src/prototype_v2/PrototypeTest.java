package prototype_v2;

//原型
interface Prototype {
  void setSize(int x);
  void printSize();
}

//一个具体类
class A implements Prototype, Cloneable {
  private int size;

  public A(int x) {
      this.size = x;
  }

  @Override
  public void setSize(int x) {
      this.size = x;
  }

  @Override
  public void printSize() {
      System.out.println("Size: " + size);
  }

  @Override
  public A clone() throws CloneNotSupportedException {
      return (A) super.clone();
  }
}

//需要很多类似的对象进行测试
public class PrototypeTest {
  public static void main(String args[]) throws CloneNotSupportedException {
      A a = new A(1);

      for (int i = 2; i < 10; i++) {
          Prototype temp = a.clone();
          temp.setSize(i);
          temp.printSize();
      }
  }
}