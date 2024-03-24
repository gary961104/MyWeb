package com.example.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "undo_log", schema = "admin")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public byte[] getRollbackInfo() {
        return rollbackInfo;
    }

    public void setRollbackInfo(byte[] rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public Instant getLogCreated() {
        return logCreated;
    }

    public void setLogCreated(Instant logCreated) {
        this.logCreated = logCreated;
    }

    public Instant getLogModified() {
        return logModified;
    }

    public void setLogModified(Instant logModified) {
        this.logModified = logModified;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

}