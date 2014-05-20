	/** Classe finonacci feita para ser calculado até passar de 300
	*
	*/
public class fibonacci {
	public void fibonacci(int a){
        int x = 0;
        int y = 1;

        for(int i = 1; x <= 300; i++)
        {
            x = x + y;
            y = x - y;
            if (x >= 300) {
            	System.out.print(x);
            }
            else{
            	System.out.print(x + ", \n");
            }
            
            
            
        }

        System.out.println();
    }
}

