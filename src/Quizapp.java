import java.util.InputMismatchException;
import java.util.Scanner;
public class Quizapp {

	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("wellcome to Quiz Application");
		System.out.println("Enter your  name:");
		String playerName = sc.nextLine();
		System.out.println("Enter your mobile number");
		String mobileno = sc.nextLine();
		System.out.println("Enter your Mail Id\n");
		String mailId= sc.nextLine();
		//player details
		   System.out.print("ready to play quiz game? (yes/no): ");
	        String ready = sc.nextLine();
	        
	        if (!ready.equalsIgnoreCase("yes")) {
	            System.out.println("Game over. Goodbye!");
	            return;
}
			// instructions
       System.out.println("/n Rules");
       System.out.println("1.There are 10 Questions. ");
       System.out.println("2.Each Question ha 10 points.");
       System.out.println("3.Each Question has 4 options.");
       System.out.println("4.You have only 2 lifelines.");
       System.out.println("5.wrong answers ends the game.");
       System.out.println("6.Correct Answer to earn the paints.");
       System.out.println("7.Remember the Lifeline can be use only onnce.\n");
   //variables
		int score=0;
		int lifeline=2;
		{
			//Questions
			//1st Question
			System.out.println("Question1.Who is known as the \"Father of the Indian Constitution\"?");
			System.out.println("A. Jawaharlal Nehru");
			System.out.println("B.Mahatma Gandhi");
			System.out.println("C.Dr.A.R.Ambedkar");
			System.out.println("D.Sardar Vallabhbhai Patel");
			  // Lifeline option
	        System.out.print("Do you want to use a lifeline? (yes/no): ");
	        String Lifeline =sc.nextLine();

	        if (Lifeline.equalsIgnoreCase("yes")) {
				if (lifeline>0) {
	                lifeline--;
	                System.out.println("Lifeline used! Hint: The answer is 'c'.");
	            } else {
	                System.out.println("No lifelines left.");
	            }
	        }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer1=sc.next();
			if(answer1.equalsIgnoreCase("c")) {
				System.out.println("Corrcet!:your score 10");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
				
			}
			//2st Question
			System.out.println("Question2.What is the minimum age to become the Prime Minister of India?");
			System.out.println("A.30 years ");
			System.out.println("B.35 years");
			System.out.println("C.25 years");
			System.out.println("D.40 years");
			 // Lifeline option
	        System.out.print("Do you want to use a lifeline? (yes/no): ");
	        String Lifeline1 =sc.nextLine();

	        if (Lifeline1.equalsIgnoreCase("yes")) {
				if (lifeline>0) {
	                lifeline--;
	                System.out.println("Lifeline used! Hint: The answer is 'c'.");
	            } else {
	                System.out.println("No lifelines left.");
	            }
	        }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer2=sc.next();
			if(answer1.equalsIgnoreCase("c")) {
				System.out.println("Corrcet!:your score 10");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
		}
			//3rd Question
			System.out.println("Question3.Which Article of the Indian Constitution provides for the Fundamental Rights?");
			System.out.println("A.Articles 12 to 35");
			System.out.println("B.Articles 1 to 11");
			System.out.println("C.Articles 36 to 51");
			System.out.println("D.Articles 52 to 62");
			 // Lifeline option
	        System.out.print("Do you want to use a lifeline? (yes/no): ");
	        String Lifeline2 =sc.nextLine();

	        if (Lifeline2.equalsIgnoreCase("yes")) {
				if (lifeline>0) {
	                lifeline--;
	                System.out.println("Lifeline used! Hint: The answer is 'a'.");
	            } else {
	                System.out.println("No lifelines left.");
	            }
	        }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer3=sc.next();
			if(answer3.equalsIgnoreCase("c")) {
				System.out.println("Corrcet!:your score 10");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
	}
			//4th Question
			System.out.println("Question4.Who was the first female Prime Minister of India?");
			System.out.println("A. Sonia Gandhi");
			System.out.println("B.Indira Gandhi");
			System.out.println("Pratibha Patil");
			System.out.println("D.Sarojini Naidu");
			 // Lifeline option
	        System.out.print("Do you want to use a lifeline? (yes/no): ");
	        String Lifeline3 =sc.nextLine();

	        if (Lifeline3.equalsIgnoreCase("yes")) {
				if (lifeline>0) {
	                lifeline--;
	                System.out.println("Lifeline used! Hint: The answer is 'b'.");
	            } else {
	                System.out.println("No lifelines left.");
	            }
	        }
	      
			System.out.println("Enter your answer(a/b/c/d):");
			String answer4=sc.next();
			if(answer4.equalsIgnoreCase("c")) {
				System.out.println("Corrcet!:your score 10");
				score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
	}
			
			//5th Question
			System.out.println("Question5.What is the tenure of the President of India?");
			System.out.println("A.4 years");
			System.out.println("B.5 years");
			System.out.println("c.6 years");
			System.out.println("D.7 years");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline4 =sc.nextLine();

			if (Lifeline4.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'b'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer5=sc.next();
			if(answer5.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
}
			//6th Question
			System.out.println("Question6.Who appoints the Chief Election Commissioner of India?");
			System.out.println("A.The Prime Minister");
			System.out.println("B.The President");
			System.out.println("c.The Parliament");
			System.out.println("D.The Supreme Court");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline5 =sc.nextLine();

			if (Lifeline.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'b'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer6=sc.next();
			if(answer6.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
}
			//7th Question
			System.out.println("Question7.Which Indian political party was founded by Shyama Prasad Mukherjee in 1951?");
			System.out.println("A.Indian National Congress");
			System.out.println("B. Bharatiya Janata Party ");
			System.out.println("c.Bharatiya Jana Sangh");
			System.out.println("D.Communist Party of India");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline6 =sc.nextLine();

			if (Lifeline6.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'c'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer7=sc.next();
			if(answer7.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
}
			//8th Question
			System.out.println("Question8.How many members are nominated by the President to the Rajya Sabha?");
			System.out.println("A.10");
			System.out.println("B.12 ");
			System.out.println("c.15");
			System.out.println("D.8");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline7 =sc.nextLine();

			if (Lifeline7.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'b'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer8=sc.next();
			if(answer8.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
}
			//9th Question
			System.out.println("Question9.Which constitutional amendment lowered the voting age from 21 to 18 years?");
			System.out.println("A.61st Amendment");
			System.out.println("B.42nd Amendment ");
			System.out.println("c.44th Amendment");
			System.out.println("D.73rd Amendment");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline8 =sc.nextLine();

			if (Lifeline.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'a'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer9=sc.next();
			if(answer9.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
}
			//10th Question
			System.out.println("Question10.Who was the first Governor-General of Independent India?");
			System.out.println("A.C. Rajagopalachari");
			System.out.println("B.Lord Mountbatten");
			System.out.println("c.Dr. Rajendra Prasad");
			System.out.println("D.Jawaharlal Nehru");
	 // Life line option
			System.out.print("Do you want to use a lifeline? (yes/no): ");
			String Lifeline9 =sc.nextLine();

			if (Lifeline9.equalsIgnoreCase("yes")) {
		if (lifeline>0) {
            lifeline--;
            System.out.println("Lifeline used! Hint: The answer is 'b'.");
        } else {
            System.out.println("No lifelines left.");
        }
    }
			System.out.println("Enter your answer(a/b/c/d):");
			String answer10=sc.next();
			if(answer10.equalsIgnoreCase("c")) {
		System.out.println("Corrcet!:your score 10");
		score+=10;
			}else {
				System.out.println("Wrong answer.Game over!");
				System.out.println("You total score:"+score);
				return;
	
			}
		}
		}
			catch(InputMismatchException e1)
			{
				System.out.println(e1);
			}
		}
}
		