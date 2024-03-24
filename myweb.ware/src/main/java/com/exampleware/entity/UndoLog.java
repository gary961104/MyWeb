package com.exampleware.entity;

import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.*;
import java.time.Instant;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "undo_log", schema = "oms")
public class UndoLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Column(name = "xid", nullable = false, length = 100)
    private String xid;

    @Column(name = "context", nullable = false, length = 128)
    private String context;

    @Column(name = "rollback_info", nullable = false)
    private byte[] rollbackInfo;

    @Column(name = "log_status", nullable = false)
    private Integer logStatus;

    @Column(name = "log_created", nullable = false)
    private Instant logCreated;

    @Column(name = "log_modified", nullable = false)
    private Instant logModified;

    @Column(name = "ext", length = 100)
    private String ext;

}