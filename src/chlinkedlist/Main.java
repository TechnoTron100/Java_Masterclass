package chlinkedlist;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Me, Myself, and I", "Beyonce");
        album.addSong("All the single ladies", 3.4);
        album.addSong("Halo", 1.4);
        album.addSong("Runnin", 2.4);
        albums.add(album);
        album = new Album("For those about to rock", "AC/DC");

        album.addSong("For those about to rock", 5.44);
        album.addSong("I put my finger on you", 2.12);
        album.addSong("Inject the venom", 3.25);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();

        albums.get(0).addToPlayList("Halo", playlist);
        albums.get(0).addToPlayList("All the single ladies", playlist);
        albums.get(0).addToPlayList(3, playlist);

        albums.get(1).addToPlayList("I put my finger on you", playlist);
        albums.get(1).addToPlayList(3, playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of the playlist");
                        forward = false;
                    }
                    System.out.println();
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            listIterator.next();
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the beginning");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            listIterator.previous();
                            System.out.println("Replaying " + listIterator.next());
                            forward = true;
                        } else {
                            System.out.println("We are at the end");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    printList(playlist);
                    break;
            }
        }
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("++++++++++++++++++++");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("++++++++++++++++++++");
    }

    private static void printMenu() {
        System.out.println("Actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay song\n" +
                "4 - to list songa\n" +
                "5 - Print menu\n" +
                "6 - to delete current song from the playlist\n");
    }
}
