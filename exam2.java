
public class exam2 {

	public static void main(String[] args) {
		
		int num = 14;
		
	    boolean flag = false;
	    
	    for (int i = 2; i <= num / 2; ++i) {
	    
	      if (num % i == 0) {
	        flag = true;
	        break;
	        
	      }
	      
	    }

	    if (!flag)
	      System.out.println("소수가 맞습니다.");
	    else
	      System.out.println("소수가 아닙니다.");
	    
	  }
	
	}