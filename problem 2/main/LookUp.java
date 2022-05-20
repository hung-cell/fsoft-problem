
package main;

import exception.MissingInformationException;
import model.Video;
import model.Thing;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.BookOnTape;

/**
 *
 * @author HungDao
 * @version 1.0
 */
public class LookUp {
    private static boolean run = true;
    private static Scanner scanner;
    private static List<Thing> things;
    public static void main(String[] args) {
        welcome(); 
        scanner= new Scanner(System.in); 
        // input choice from user
         things = new ArrayList<>();
        // Loop until choice == 0 => user wanna to exist the program
        while(run){
            System.out.print("Choose one choice: ");
            
            String choice = scanner.nextLine();
           
            switch(choice){
                // choose 1 to create new thing
                case "1": createNewThing();
                    System.out.println("-----------------------");
                    break;
                // choose 2 to show furniture infomation
                case "2": showAllFurniture();
                System.out.println("-----------------------");
                     break;
                // choose 3 to find a thing by a serial number
                case "3": findBySerialNumber();
                System.out.println("-----------------------");
                    break;
                case "0": existApp();
                    break;
                default: System.out.println("Please press the number we have talked above !");
                System.out.println("-----------------------");
            }
        }
    }
    
   /**
     * method to find a thing by serial number
    
     */
    private static void findBySerialNumber() {
        
       try{
           int flag = 0;
            System.out.println("Enter serial number: ");
            int serialNumber= scanner.nextInt();
            scanner.nextLine();
            for(Thing item : things){
            if(item.getSerialNumber()== serialNumber){
                System.out.println(item.getDescription());
                flag = 1;
                break;
            }
        }
        if(flag == 0) System.out.println("Sorry there are no things you want to find");
   
       }catch(InputMismatchException ex){
           System.out.println("You must print number");
           scanner.nextLine();
       }
 }
    /**
     * method to create new thing
     */
    private static void createNewThing() {
                    Thing obj;
                    System.out.print("Enter thing you want to create: ");
                    // input thing from user
                    String thing = scanner.nextLine();
                    thing = thing.toLowerCase();
                    
                    switch(thing){
                        case "video": 
                            try{
                                System.out.print("Enter title of the video: ");
                                String title = scanner.nextLine();
                                System.out.print("Enter author of the video: ");
                                String author = scanner.nextLine();
                                System.out.print("Enter content of the video: ");
                               
                                String content = scanner.nextLine();
                                System.out.print("Enter topic of the video: ");
                                String topic = scanner.nextLine();
                                obj = new Video(title,author, content, topic);
                                
                                
                                if(title.isEmpty() || author.isEmpty() 
                                        || content.isEmpty() || topic.isEmpty())
                                    throw new MissingInformationException();
                                things.add(obj);
                                System.out.println("Thêm thành công");
                            } catch(MissingInformationException e){
                                System.out.println("Incomplete information entered, Please try again");
                            }
                            break;
                        case "book on tape": 
                            try{
                                System.out.print("Enter title of the book: ");
                                String title = scanner.nextLine();
                                System.out.print("Enter author of the book: ");
                                String author = scanner.nextLine();
                                System.out.print("Enter type of the book: ");
                                String type = scanner.nextLine();
                                System.out.print("Enter accent of the book: ");
                                String accent = scanner.nextLine();
                                obj = new BookOnTape(title, author, type, accent);
                                
                                if(title.isEmpty() || author.isEmpty() 
                                        || type.isEmpty() || accent.isEmpty())
                                    throw new MissingInformationException();
                                things.add(obj);System.out.println("Thêm thành công");
                            } catch(MissingInformationException e){
                                System.out.println("Incomplete information entered, Please try again");
                            }
                            break;
                            case "furniture": 
                            try{
                                System.out.print("Enter name of the furniture: ");
                                String name = scanner.nextLine();
                                System.out.print("Enter manufacture of the furniture: ");
                                String manufacture = scanner.nextLine();
                                System.out.print("Enter design of the furniture: ");
                                String design = scanner.nextLine();
                                System.out.print("Enter brand of the furniture: ");
                                String brand = scanner.nextLine();
                                obj = new BookOnTape(name, manufacture, design, brand);
                                if(name.isEmpty() || manufacture.isEmpty() 
                                        || design.isEmpty() || brand.isEmpty())
                                    throw new MissingInformationException();
                                things.add(obj);System.out.println("Thêm thành công");
                            } catch(MissingInformationException e){
                                System.out.println("Incomplete information entered, Please try again");
                            }
                            break;
                            default: System.out.println("We just provide 3 things to you can create video, furniture and book on tape");
                           
                    } }
    /**
     * method to show all furniture was created
     */
    private static void showAllFurniture() {
        for(Thing item : things){
            System.out.println(item.getDescription());
        }
    }
    /**
     * method to print welcome interface in console
     */
    private static void welcome() {
           System.out.println("Welcome to Rudy's Rental System: ");
           System.out.println("We provide some fetures below: ");
           System.out.println("Press 1 to create new furniture you want (my system "
                   + "allow you to create video, furniture and book on tape: ");
           System.out.println("Press 2 to show all the furniture you have created: ");
           System.out.println("Press 3 to enter a serial number and find the furniture you want to search: ");
           System.out.println("Press 0 if you want to exist the application");
           System.out.println("We hope you enjoy");
    }

 
      /**
     * method to exist the app
     */
      private static void existApp() {
          run = false;
      }
     
}
