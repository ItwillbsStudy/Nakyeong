package Level_0;

public class sum_even_numbers {

	public static void main(String[] args) {
		
		// < 짝수의 합 >
		
		// 정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return
		//
		// < 제한 사항 : 0 < n <= 100 >
		// n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 리턴
		// n이 4이므로 2 + 4 + 6을 리턴
		
		int n = 10;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0) {
				sum += i;
			} 
		}
		System.out.println(sum);
		
		
	}

}
