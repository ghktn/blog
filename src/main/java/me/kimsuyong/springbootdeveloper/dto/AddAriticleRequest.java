package me.kimsuyong.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.kimsuyong.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddAriticleRequest {
    private String title;
    private String content;

    public Article toEntity() { // 생성자를 사용해서 객체를 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }

}
