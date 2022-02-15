package leetcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class TaskOne {

	public static void main(String[] args) {
		SolnTaskOne obj = new SolnTaskOne();
		System.out.println(obj.solution(new int[] { 100, 100, 100, -10}, new String[] { "2020-01-01", "2020-01-01","2020-01-01","2020-01-31" }));
	}

}

class SolnTaskOne {

	public int solution(int[] A, String[] D) {
		int[] noOfCardTrnsctnPerMnth = new int[12];
		int totalAmount = 0;
		int[] amtPerMnthCredit = new int[12];
		for (int i = 0; i < A.length; i++) {
			totalAmount += A[i];
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String dateString = D[i];
			LocalDate localDateVar = LocalDate.parse(dateString, formatter);
			if (A[i] < 0) {

				Integer mnth = localDateVar.getMonth().getValue();
				localDateVar.getMonth().getValue();
				noOfCardTrnsctnPerMnth[mnth - 1] += 1;
				amtPerMnthCredit[mnth - 1] += A[i];

			}
			

		}

		for (int i = 0; i < 12; i++) {
			if (noOfCardTrnsctnPerMnth[i] >= 3 && amtPerMnthCredit[i] <= -100) {
				
				continue;
			}
				totalAmount = totalAmount - 5;
			
		}
		

		return totalAmount;

	}
}
