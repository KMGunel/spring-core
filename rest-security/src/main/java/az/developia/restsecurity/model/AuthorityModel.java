package az.developia.restsecurity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="authorities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String username;
private String authority;

}
