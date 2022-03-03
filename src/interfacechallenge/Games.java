package interfacechallenge;

import java.util.ArrayList;

public class Games implements ISaveable {

    private ArrayList<String> games = new ArrayList<String>();

    @Override
    public void add(ArrayList items) {
        for (int i = 0; i < items.size(); i++) {
            this.games.add(i, items.get(i).toString());
        }
    }

    @Override
    public ArrayList show() {
        for (int i = 0; i < this.games.size(); i++) {
            System.out.println("Game " + (i + 1) + " is " + this.games.get(i).toString());
        }
        return games;
    }

    @Override
    public String toString() {
        return "Games{" +
                "games=" + games +
                '}';
    }
}
