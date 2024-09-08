package com.task.march22;

public class Trainer {
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double hra;
	private double da, perkPerBatch;
	private int batchCount;

	public Trainer(int managerId, String managerName, double basicSalary, double hra, double da, double perkPerBatch,
			int batchCount) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.perkPerBatch = perkPerBatch;
		this.batchCount = batchCount;
	}

	public double calculateGrossSalary() {
		return basicSalary + hra + da + (batchCount * perkPerBatch);
	}

	@Override
	public String toString() {
		return "Trainer [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", da=" + da + ", perkPerBatch=" + perkPerBatch + ", batchCount=" + batchCount + "]";
	}
}
