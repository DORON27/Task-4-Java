import java.io.*;
import java.util.Scanner;

public class NotesApp{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int choice;

    do{
      System.out.println("\n---Notes App---");
      System.out.println("1. Add Note");
      System.out.println("2. View Note");
      System.out.println("3. Exit");
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice){
        case 1:
          System.out.println("Enter your note: ");
          String note = scanner.nextLine();
          try (FileWriter fw = new FileWriter("notes.txt", true)){
            fw.write(note + "\n");
            System.out.println("Note Saved!");
          }
          catch(IOException e){
            System.out.println("Error writing note:" + e.getMessage());
          }
          break;

        case 2:
         try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
           String line;
           System.out.println("\n---Saved Notes---");
           while ((line = br.readLine()) != null){
             System.out.println(line);
           }
         } catch (IOException e) {
           System.out.println("Error reading notes:" + e.getMessage());
         }
         break;

        case 3:
          System.out.println("Exiting");
          break;
          default:
          System.out.println("Invalid choice!");
      }
    }
    while(choice != 3);

    scanner.close();
  }
}