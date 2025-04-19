package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String createdBy;
    private LocalDateTime createdDate;
    private LocalDateTime dueDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
    private String status;

    @ManyToOne
    @JoinColumn(name ="assignerId", referencedColumnName = "id")
    private UserEntity userEntity;
}
