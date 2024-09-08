package com.sampleOnRecord;

public record Add(int a, int b) {

	public Add(int a)
	{
		this(1,2);
	}
}
