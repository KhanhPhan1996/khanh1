package ATM;

public class ATMImpl implements ATM{
	private int idATM;
	private int accountld;
	
	public int getIdATM() {
		return idATM;
	}

	public void setIdATM(int idATM) {
		this.idATM = idATM;
	}

	public int getAccountld() {
		return accountld;
	}

	public void setAccountld(int accountld) {
		this.accountld = accountld;
	}


	@Override
	public boolean withdraw(int stk, double str) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(int stk, double stg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double queryBalance(int sd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String ttk, String mk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
