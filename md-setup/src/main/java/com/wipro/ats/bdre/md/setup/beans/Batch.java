package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Batch generated by hbm2java
 */
@Entity
@Table(name="BATCH"
    ,schema="BDRE"
    ,catalog="BDRE"
)
public class Batch  implements java.io.Serializable {


     private Long batchId;
     private Long sourceInstanceExecId;
     private String batchType;

    public Batch() {
    }

	
    public Batch(String batchType) {
        this.batchType = batchType;
    }
    public Batch(Long sourceInstanceExecId, String batchType) {
       this.sourceInstanceExecId = sourceInstanceExecId;
       this.batchType = batchType;
    }
   
     @Id 
    
    @Column(name="BATCH_ID", unique=true, nullable=false)
    public Long getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
    
    @Column(name="SOURCE_INSTANCE_EXEC_ID")
    public Long getSourceInstanceExecId() {
        return this.sourceInstanceExecId;
    }
    
    public void setSourceInstanceExecId(Long sourceInstanceExecId) {
        this.sourceInstanceExecId = sourceInstanceExecId;
    }
    
    @Column(name="BATCH_TYPE", nullable=false, length=45)
    public String getBatchType() {
        return this.batchType;
    }
    
    public void setBatchType(String batchType) {
        this.batchType = batchType;
    }




}

