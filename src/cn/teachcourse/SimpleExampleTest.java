package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 */
public class SimpleExampleTest {

	public static void main(String[] args) {
		A a = new A();
		B b=new B(a);//同理，类B持有类A的引用
        
		a.setB(b);//类A持有类B的引用
		a.b.methodB();//类A调用类B的方法methodB()，然后类B回调了类A的方法methodA()
	}

	static class A {
		B b;

		public void setB(B b) {
			this.b = b;
		}

		/**
		 * 在该方法中接收执行结果
		 */
		void methodA() {
			System.out.println("类B回调了类A的方法：methodA()");
		}
		
	}

	static class B {
		A a;
		
		public B(A a) {
			this.a = a;
		}

		void methodB() {
			System.out.println("类B执行的方法：methodB()");
			a.methodA();// 通知类A，已经执行了类B的方法
		}
	}
}
