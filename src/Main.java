import Entities.Comment;
import Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice tripe");
        Comment c2 = new Comment("Wow that´s awesome");
        Post p1 = new Post(sfd.parse("21/06/2018 13:05:44"),
                "Traveling new zeland",
                "Vou visitar esse pais",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


        Comment c3 = new Comment("Have a nice tripe");
        Comment c4 = new Comment("Wow that´s awesome");
        Post p2 = new Post(sfd.parse("21/06/2018 13:05:44"),
                "Traveling new zeland",
                "Vou visitar esse pais",
                12);

        p1.addComment(c3);
        p1.addComment(c4);

        System.out.println(p2);

    }
}