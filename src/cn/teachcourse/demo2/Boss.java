package cn.teachcourse.demo2;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 * Boss���൱����A������Employee�����ã�����Ա������һ������
 */
public class Boss {
	IEmployee employee;

	public void setEmployee(IEmployee employee) {
		this.employee = employee;
	}

	/**
	 * �ϰ��Ա��������һ������
	 */
	void allocateTask() {
		System.out.println("Boss���°�ǰ����дһ��ð�������㷨������");
		employee.result();
	}

}
