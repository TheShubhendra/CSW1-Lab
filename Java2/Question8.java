
public class Question8 {
	
	public static int rev(int n) {
		if(n<0) {
			return -1 * rev(-1*n);
		}
		int res = 0;
		while(n!=0) {
			res= (res*10 + n%10);
			n/=10;

		}
		return res;
	}
	
	 public static boolean isPalindrome(int a) {
		 return a == rev(a);
	 }
	 
	 public static int evenDigitCount(int a) {
		 int c = 0;
		 while(a>0) {
			 if(a%2==0) {
				 c++;
			 }
			 a/=10;
		 }
		 return c;
	 }
	 
	 public static int[] freq(int a) {
		 int[] res = new int[10];
		 while(a!=0) {
			 res[a%10]++;
			 a/=10;
		 }
		 return res;
	 }
	 
	 public static int q12(int a, int b) {
		 int r = rev(a);
		return r%10 * 1000 + (r/10)%10 * 100 +  b%100;
	 }
	 public static int count1(int a){
		int count = 0;
		while(a!=0){
			count+=a&1;
			a = a>>1;
		}
		return count;
	 }


	public static int bitwiseMulti(int a, int b){
		int res=0;
		int pos=0;
		while(b>0){
			if((b&1) == 1){
			res = bitwiseAdd(res, a<<pos);
			}
			pos++;
			b>>=1;
		}
		return res;
	}

	public static int bitwiseAdd(int a, int b){
			 int s = a ^ b;
			 int c = a & b;
			 while(c!=0){
				int x = c<<1;
				s = s ^ x;
				c = s & x;
			 }
			 return s;
	}

	// 12 x 34
	//     48
	//    360
// 6 * 3
// 18
	// 110 x 11
	//    110
	//   1100


	public static void main(String[] args) {
		System.out.println("Reverse of 123 is " + rev(123) + " , and of -245 is"+ rev(-245));
		System.out.print("Is 1243421 palindrome? " + isPalindrome(1243421));
		System.out.println("Number of even digits in 543532425 is "+ evenDigitCount(4332425));
		System.out.println("Frequencey of digits in 387473: ");
		int[] res = freq(387473);
		for(int i=0; i<10; i++) {
			 
			System.out.println(i + " : " + res[i]);
		}
		
		System.out.println("Question Input: 45768, 312 Output: "+ q12(45768,312));
		System.out.println("Number of 1s in 33 is : "+ count1(33));
		System.out.println("Bitwise Multiplication of 5 & 9 is: "+ bitwiseMulti(5, 9));
	}

}