package cricket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuestionFactory {
	
	private static final List<String> questions = new ArrayList<>();
	
	private static Set<Integer> asked = new HashSet<>();
	
	private static Random random = new Random();
	
	private static int counter = 0;
	
	private QuestionFactory() {
	}
	
	static {
		questions.add("Sachin or Kohli?");
		questions.add("Sehwag or Rohit Sharma?");
		questions.add("T 20 World Cup 2007 or World Cup 2011?");
		questions.add("Jacques Kallis or Shane Watson?");
		questions.add("Dhoni or Gillchrist?");
		questions.add("Brett Lee or Mitchell Johnson?");
		questions.add("Shoaib Akhtar or Lasith Malinga?");
		questions.add("Shane Warne or Ashwin?");
		questions.add("Chris Gayle or Glenn Maxwell?");
		questions.add("Eden Gardens or Wankhede?");
		questions.add("Lords or M.C.G?");
		questions.add("I.P.L or B.B.L?");
		questions.add("Run out or stump out?");
		questions.add("5 wickets for bowler, or a century for batsmen?");
		questions.add("Kumble or Bhajji?");
		questions.add("Sanjay Manjaraker or Harsha Bhogle?");
		questions.add("Gaurav Kapoor or Sameer Kochhar?");
		questions.add("Shahid Afridi or Shoaib Malik?");
		questions.add("Ashish Nehra or Zaheer Khan?");
		questions.add("India vs Pakistan, or India vs Australia?");
		questions.add("West Indies vs Zimbabwe, or Sri Lanka vs Bangladesh?");
		questions.add("Rahane or Jadeja?");
		questions.add("Rising Pune Super Giants, or Pune Warriors India?");
		questions.add("Deccan Chargers or Sun Risers?");
		questions.add("A.B Devilliers or Steve Smith?");
		questions.add("Wasim Akram or Waqar Younis?");
		questions.add("Irfan Pathan or Yusuf Pathan?");
		questions.add("ODI or Test?");
		questions.add("ODI or T 20?");
		questions.add("Heads or Tails?");
		questions.add("Batting or Bowling?");
		questions.add("Rahul Dravid or Saurav Ganguly?");
		questions.add("Shastri or Gavaskar?");
		questions.add("Super over or bowl-out?");
		questions.add("Sachin and Sehwag, or Rohit and Dhawan?");
	}
	
	public static String getQuestion() {
		if (counter == questions.size()) {
			asked.clear();
			counter = 0;
		}
		int index = -1;
		do {
			index = random.nextInt(questions.size());
		} while(!asked.add(index));
		
		counter++;
		
		return questions.get(index);
	}
}
