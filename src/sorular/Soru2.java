package sorular;

import java.util.ArrayList;
import java.util.List;

public class Soru2 {

	public static void main(String[] args) {
		// what is the output of the folowing cod snipper?
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(14);
		for(int x: list) {
			System.out.println(x + ", ");
			break;
		}
		
		//a) 10,14,
		//b) 10,14
		//c) 10,
		//d) the code will not compile because of line 7.
		//e) the code will not compile because of line 8.
		//f) the code contains an infinite loop and does not terminate 

	}

}
