import java.util.*;
public class VoucherDriver {

	public static void main(String[] args) {
		int choice = 1;
		
		
		
		Vouchers.initialize(1, 1, 3);
		
		
	while (choice != 0) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Activities Available"); 
		System.out.println("1. Create voucher");
		System.out.println("2. Print voucher register"); 
		System.out.println("3. Issue checks");
		System.out.println("Please enter activity number: ");
		choice = scn.nextInt();
		
		if (choice == 1) {
			Vouchers newVoucher = new Vouchers();
			newVoucher.makeVoucher();
		}
//		else if (choice == 2) {
//			
//		}
//		else if (choice == 3) {
//			
//		}
//		else if (choice == 0) {
//			main(null);
//		}
//		else {
//			System.out.println("Please enter a valid activity number");
//		}
//		
	}

		
		
	}

}
