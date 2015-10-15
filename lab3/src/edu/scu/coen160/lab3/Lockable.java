package edu.scu.coen160.lab3;

public interface Lockable {
	public void lock(String key);
	public void unlock(String key);
	public void show();
}
