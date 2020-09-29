package edu.wctc.wfcsecurity.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name="Users")
public class User {

    @Id
    private String username;
    private boolean enabled;
}
