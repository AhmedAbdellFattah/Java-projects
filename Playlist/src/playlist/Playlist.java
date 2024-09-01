package playlist;

/**
 *
 * @author AhmedAbdellFattah
 */
/*'Desert Island Playlist' project via Codecademy (You’re heading to a desert island,
cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪) */

import java.util.ArrayList; //Importing the ArrayList class from the java.util package

//Create a class called Playlist (a playlist of favorite songs)
class Playlist {
  
  public static void main(String[] args) {
    //Initializing and declaring desertIslandPlaylist ArrayList
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    //Adding favorite songs to the playlist
    desertIslandPlaylist.add("set fire to the rain");
    desertIslandPlaylist.add("clocks");
    desertIslandPlaylist.add("can't let go");
    desertIslandPlaylist.add("pillowtalk");
    desertIslandPlaylist.add("sign of the times");
    desertIslandPlaylist.add("till i collapse");

    //Removing a song from the list at index 4
    desertIslandPlaylist.remove(4);

    //Swaping song at index 0 with song at index 1
    String temp = desertIslandPlaylist.get(0);
    desertIslandPlaylist.set(0, desertIslandPlaylist.get(1));
    desertIslandPlaylist.set(1, temp);

    //Print the indices of two swapped songs
    System.out.println("The index of the first swapped song is: "+desertIslandPlaylist.indexOf("set fire to the rain"));
    System.out.println("The index of the second swapped song is: "+desertIslandPlaylist.indexOf("clocks"));

    //Print the final playlist
    System.out.println("The final playlist: "+desertIslandPlaylist);
  }
}
