package SoftUni.Fundamentals.ObjectAndClasses;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    private String type;
    private String name;
    private String time;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSongs = Integer.parseInt(scanner.nextLine());

        List<Songs> listOfSongs = new ArrayList<>();
        for (int i = 0; i < numSongs; i++) {
            String[] input = scanner.nextLine().split("_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Songs song = new Songs();
            song.setType(type);
            song.setName(name);
            song.setTime(time);

            listOfSongs.add(song);
        }
        String toBePrinted = scanner.nextLine();
        if (toBePrinted.equals("all")){
            for (Songs song:listOfSongs) {
                System.out.println(song.getName());
            }
        }else {
            for (Songs song:listOfSongs) {
                if (song.getType().equals(toBePrinted)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
