package com.example.jwt.database;

import javax.persistence.*;

@Entity
@Table(name = "Replica")
public class Replica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replicaId;



    private String replica;

    public Replica(){

    }
    public Replica(String replica){
        this.replica = replica;
    }

    public Long getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(Long replicaId) {
        this.replicaId = replicaId;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

}
