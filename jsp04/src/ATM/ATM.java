package ATM;

public interface ATM {
	public boolean withdraw(int stk,double str);
	public boolean deposit(int stk,double stg);
	public double queryBalance(int sd);
	public boolean login(String ttk,String mk);
	public boolean logout(String t);
	
}
