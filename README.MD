回调的定义：

类A**调用**类B的方法`methodB()`，方法执行后，类B**调用**类A的方法`methodA()`，通知类A执行的结果，那么最后调用的`methodA()`，是一个回调的方法


**一个简单的回调的例子：**

```java
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
```

[例子源码](src/cn/teachcourse/SimpleExampleTest.java)

**一个包含接口和实现类回调的例子**

```java
public interface IEmployee {
	void result();
}
```

```java
public class Boss {
	IEmployee employee;

	public void setEmployee(IEmployee employee) {
		this.employee = employee;
	}

	/**
	 * 老板给员工分配了一个任务
	 */
	void allocateTask() {
		System.out.println("Boss：下班前，手写一个冒泡排序算法。。。");
		employee.result();
	}

}
```

```java
public class IEmployeeImpl implements IEmployee{
    Boss boss;
    
	public IEmployeeImpl(Boss boss) {
		this.boss = boss;
	}

	@Override
	public void result() {
		int a[]={1,3,4,5,8,3,1};
		
		sortingOfBubble(a);
		
		System.out.println("Employee：已经完成冒泡排序算法的封装，经过测试没有问题。。。");
	}

	private void sortingOfBubble(int[] a) {
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++){
				int temp;
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
```

```java
public class TestDriver {

	public static void main(String[] args) {
		Boss boss = new Boss();
		IEmployee employee = new IEmployeeImpl(boss);
		
		boss.setEmployee(employee);
	    boss.allocateTask();//Boss类调用allocateTask()方法，并调用了Employee的result()方法
	}

}
```

[例子源码](src/cn/teachcourse/demo2)

