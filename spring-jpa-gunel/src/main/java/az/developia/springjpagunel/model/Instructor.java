package az.developia.springjpagunel.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 2,message = "Minimum 2 herf olmalidir!")
	private String name;
	@Size(min = 2,message = "Minimum 2 herf olmalidir!")
	private String surname;
	
	
	@OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST})
	@JoinColumn(name="instructordetail_id")
	@JsonIgnoreProperties({"instructor","id"})
	private InstructorDetail instructordetail;
}
