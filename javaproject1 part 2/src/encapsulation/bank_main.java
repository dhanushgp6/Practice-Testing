package encapsulation;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank_account b= new bank_account();
		b.setAc_balance(10);
		b.setAc_no(2563);
		System.out.println("accout balance "+ b.getAc_no()+ " account "+ b.getAc_balance());
	}

}
