import java.util.*;
public class Vouchers {
	private static int nextVouchNum;
	private static int nextChkNum;
	private static Vouchers[] _voucher;
	
	private int voucherNum;
	private String purchaseDate;
	private double amount;
	private String debitAcct;
	private String vendor;
	private int checkNmbr;
	private String payDate;
	
	
	
	public static void initialize (int firstVouchNum, int firstChkNum, int maxNumOfVouch) {
		
		nextVouchNum = firstVouchNum;
		nextChkNum = firstChkNum;
		_voucher = new Vouchers[maxNumOfVouch];
	}
	
	public void makeVoucher() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter purchase date (dd/mm/yyyy):");
		purchaseDate = scan.nextLine();
		System.out.println("Enter name of account to debit:");
		debitAcct = scan.nextLine();
		System.out.println("Enter name of vendor:");
		vendor = scan.nextLine();
		System.out.println("Enter amount:");
		amount = scan.nextDouble();
		
		
	}
	
	
	
	
	public Vouchers() {
	
		int strtInd = 0;
		
		for (int i = 0; i < _voucher.length; i++) {
			if (_voucher[i] == null) {
				strtInd = i;
				break;
			}
		}
		_voucher[strtInd] = this;
		
		
		voucherNum = nextVouchNum;
		nextVouchNum++;
		
		
	}
	
	public Vouchers findVouch (int voucherNum) {
		Scanner scn = new Scanner(System.in);
		voucherNum = scn.nextInt();
		
		for (int i = 0; i < _voucher.length;) {
			if (_voucher[i].voucherNum == voucherNum) {
				return _voucher[i];
		
			}
			
		}
		return null;
		
	}
	
	
	public void issueCheck() {
		while (amount != 0.0 && vendor != null) {
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter voucher number to pay: ");
			checkNmbr = scn.nextInt();
			System.out.print("Enter payment date (dd/mm/yyyy): ");
			payDate = scn.next();
		}
	}
	
	
	
	

}





