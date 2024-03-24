package com.example.product.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pms_comment_replay", schema = "pms")
public class PmsCommentReplay {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comment_id")
    private Long commentId;

    @Column(name = "reply_id")
    private Long replyId;

}