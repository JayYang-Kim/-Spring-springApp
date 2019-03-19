package com.di7;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
	// AtomicLong : thread ȯ�濡�� ������ų�� ���
	private static AtomicLong count = new AtomicLong(0);
	private boolean isVeg;

	public Pizza() {
		count.incrementAndGet();
	}
	
	public String toString() {
		return "A new " + (isVeg ? "veggie" : "") + "Pizza count(" + count.get() + ")";
	}
	
	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
}
