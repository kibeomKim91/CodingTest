class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int molecularSum = numer1*denom2+numer2*denom1;
		int denominator = denom1*denom2;

		int commonFactor = 1;

		for (int i = 1; i <= molecularSum && i <= denominator; i++) {
			if (molecularSum%i == 0 && denominator%i == 0) {
				commonFactor = i;
			}
		}

		molecularSum = molecularSum/commonFactor;
		denominator = denominator/commonFactor;

		int[] answer = {molecularSum, denominator};

		return answer;
	}
}