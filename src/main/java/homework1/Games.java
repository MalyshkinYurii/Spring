package homework1;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Games {
    private int hours;
    private String name;
    private String genre;
    private boolean isLike;



    public Games(String name, String genre ) {
        this.name = name;
        this.genre = genre;
    }
}
