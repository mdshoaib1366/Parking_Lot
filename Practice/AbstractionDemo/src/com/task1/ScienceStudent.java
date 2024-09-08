package com.task1;

public class ScienceStudent extends Student{
	 
	private int physics;
	private int maths;
	private int chemistry;
	
	
	public ScienceStudent(String studentName, String studentClass,int n,int physics, int maths, int chemistry) {
		super(studentName, studentClass, n);
		this.physics = physics;
		this.maths = maths;
		this.chemistry = chemistry;
		
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}



	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}


	@Override
	public int getPercentage()
	{
		int percentage = ((this.physics+this.maths+this.chemistry)/3);
		return percentage;
	}
}
