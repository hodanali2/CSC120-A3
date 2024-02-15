import java.util.Scanner;

class Conversation {

public static void main(String[] arguments) {
    // You will start the conversation here.
    
      
      Scanner sc = new Scanner(System.in);

      System.out.println("How many rounds do you want do it?: ");
      int rounds = sc.nextInt();
      sc.nextLine();
      String[] conversation = new String[]{"Hi, how was your day?","what did you had for lunch?","what do you do after lunch?"};
      String[] transcript= new String[rounds];
      

      for(int i=0; i<rounds-1; i++){
        System.out.println(conversation[i%3]);
        transcript[i]=conversation[i%3];
        
      

        String response = sc.nextLine();
        String[] words = response.split(" ");
        transcript[i]+= " " + String.join(" ", response);
        
      
      //mirroring the words user responds
        for(int j=0; j< words.length; j++){
          if (words [j].equals ("I" )|| words [j].equals ("i" )) {
            words[j]="you";
        }
          else if (words[j].equals("me") || words[j].equals("Me")) {
          words[j]="you";
        }
          else if (words[j].equals("am") || words[j].equals("Am")){
          words[j]="are";
        }
          else if (words[j].equals("you") || words[j].equals("You")){
          words[j]="I";
        }
          else if (words[j].equals("my") || words[j].equals("My")){
          words[j]="your";
        }
          else if (words[j].equals("your") || words[j].equals("Your")){
          words[j]="my";
        } 

      }
  
      for (int m=0; m<words.length;m++ ){
        System.out.print(words [m]+" ");

      }
      System.out.print("? ");
      transcript[i]+= " " + String.join(" ", words) + "?";
      
      
  }

//printing the good bye message
  String goodbye_message = "hmmm, it was nice talking to you!!";
  System.out.println(goodbye_message);
  transcript[rounds -1 ] = goodbye_message; 

      
//printing the transcript of the conversation
  System.out.println("printing the transcript of the entire conversation! :");
  System.out.println("\n---Transcript ---");

  System.out.println(transcript.length);
  for(String line : transcript){
    System.out.println(line);
  }

  

    }
}

      


   
          



