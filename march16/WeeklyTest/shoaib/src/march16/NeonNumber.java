package march16;

public class NeonNumber {
	
		public boolean checkNeonNumber(int num)
		{
			int res = num*num;
			int t = (res/10) + (res%10);
			
			if(t==num) {
			return true;
			}
			else {
			return false;
			}
		}
}
