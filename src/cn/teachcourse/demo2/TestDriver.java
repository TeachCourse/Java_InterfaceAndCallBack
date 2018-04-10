package cn.teachcourse.demo2;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 */
public class TestDriver {

	public static void main(String[] args) {
		Boss boss = new Boss();
		IEmployee employee = new IEmployeeImpl(boss);
		
		boss.setEmployee(employee);
		boss.allocateTask();
	}

}
