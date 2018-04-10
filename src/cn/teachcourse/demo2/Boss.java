package cn.teachcourse.demo2;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 * Boss类相当于类A，持有Employee的引用，并给员工分配一个任务
 */
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
