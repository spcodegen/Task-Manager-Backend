package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    private Integer id;
    private String title;
    private String description;
    private String createdBy;
    private LocalDateTime createdDate;
    private LocalDateTime dueDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private String status;
    private Integer assignerId;
}
