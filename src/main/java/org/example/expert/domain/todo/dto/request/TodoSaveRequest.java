package org.example.expert.domain.todo.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.expert.domain.common.entity.Timestamped;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoSaveRequest extends Timestamped {

    @NotBlank
    private String contents;

    @NotBlank
    private String title;

    @NotNull
    @Positive
    private Long userId;

    @NotBlank
    private String weather;

    private LocalDateTime created_at;

    private LocalDateTime modified_at;
}
