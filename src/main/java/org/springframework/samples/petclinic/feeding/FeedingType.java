package org.springframework.samples.petclinic.feeding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feedingType")
public class FeedingType extends BaseEntity {
    //Integer id;
	
	@NotNull
	@Column(name = "name", unique = true)
	@Size(min=5, max=30)
    String name;
	
	@NotNull
    String description;
	
	@NotNull
	@ManyToOne(optional=false)
	@JoinColumn(name = "pet_type_id")
    PetType petType;
}
