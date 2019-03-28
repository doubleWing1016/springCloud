package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{
    private static final long serialVersionUID = -4915126340245979295L;
    private Integer id;
    private Integer age;
    private String name;
    private String classes;
    private String database;
}