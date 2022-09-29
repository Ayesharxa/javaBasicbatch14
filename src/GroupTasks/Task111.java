package GroupTasks;

public class Task111 {

	public static void main(String[] args) {
		
		
		String [] words= {"Ali","Ali", "Ayesha", "Maxim", "Maxim", "Rimma", "Lubna", "Serhii", "Tatiana", "Ugur"};

		for(int i=0; i<words.length; i++) {
			for (int j=i+1; j<words.length;j++) {
				if(words[i].equals(words[j])) {
						System.out.println(words[i] +" is duplicated in the array");}
			
		}
		}
		}
		}	
		

	


