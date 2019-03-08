/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author shoeb
 */
import java.util.Scanner;
public class TestUserprofile {
    public static void main(String[] args){
        String name;
        String genre;
        UserProfile up = new UserProfile("","");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a user ID to create the profile");
        name = in.nextLine();
        up.setUserID(name);
        System.out.println("Choose your following genre from the following list:");
        up.getAllGenres();
        genre = in.nextLine();
        up.setGenre(genre);
        System.out.println("Your Profile has been created");
        
    }
}
