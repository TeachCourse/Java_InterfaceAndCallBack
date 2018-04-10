package cn.teachcourse.demo2;

/**
 * Created by http://teachcourse.cn on 2018-4-10.
 */
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
