package site.metacoding.second2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Post {
    private int id;
    private String title;
    private String content;
}
