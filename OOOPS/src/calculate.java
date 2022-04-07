
public interface calculate {

	 void cal(int item);
	}
	class display implements calculate {
	    int x;
	    public void cal(int item) {
	        x = item * item;           
	    }
	}
