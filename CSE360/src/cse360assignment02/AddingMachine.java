
// my code repository : https://github.com/AgoodPersonYbr/cse360assignment02


package cse360assignment02;
public class AddingMachine {
	
	
	public static void main(String[] args) {
	       AddingMachine machine = new AddingMachine();
	       machine.add(0);
	       System.out.print(machine.toString());
	       machine.add(4); 
	       System.out.print(machine.toString());
	       machine.subtract(2); 
	       System.out.print(machine.toString());
	       machine.add(5);
	       System.out.print(machine.toString());
	   }
	
	
	 private int total;
	 private String output; 
	 
	 
  
  public AddingMachine() {
    total = 0;  // not needed - included for clarity
    output = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  if(total == 0) {
		  output = "0";
	  }else
		  
	  output = " + " + value;
  }

  public void subtract (int value) {
	  total = total + value;
	  output = " - " + value;
  }

  public String toString () {
    return output;
  }

  public void clear() {
	  total = 0;
  }

}




