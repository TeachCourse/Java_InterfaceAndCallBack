package cn.teachcourse;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 */
public class SimpleExampleTest {

	public static void main(String[] args) {
		A a = new A();
		B b=new B(a);//ͬ����B������A������
        
		a.setB(b);//��A������B������
		a.b.methodB();//��A������B�ķ���methodB()��Ȼ����B�ص�����A�ķ���methodA()
	}

	static class A {
		B b;

		public void setB(B b) {
			this.b = b;
		}

		/**
		 * �ڸ÷����н���ִ�н��
		 */
		void methodA() {
			System.out.println("��B�ص�����A�ķ�����methodA()");
		}
		
	}

	static class B {
		A a;
		
		public B(A a) {
			this.a = a;
		}

		void methodB() {
			System.out.println("��Bִ�еķ�����methodB()");
			a.methodA();// ֪ͨ��A���Ѿ�ִ������B�ķ���
		}
	}
}
