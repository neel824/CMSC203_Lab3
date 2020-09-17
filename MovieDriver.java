import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String choice;

		do
		{		
		Movie movie = new Movie();
		
		System.out.println("Enter the name of the movie ");
		
		movie.setTitle(input.nextLine());
		
		System.out.println("Enter the rating of the movie ");
		
		movie.setRating(input.nextLine());
		
		System.out.println("Enter the tickets sold for the movie ");
		
		movie.setSoldTickets(input.nextInt());
		
		System.out.println(movie.toString());
		
		System.out.println("Do you want another (y or n)");
		
		choice = input.nextLine();
		choice = input.nextLine();
		
		}
		while(choice.equals("y"));
		
		if(choice.equals("n"))
		{
			System.out.println("Goodbye");
		}
		

	}

}
