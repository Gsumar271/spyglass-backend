package com.spyglass.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "goal")
public class Goal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NotBlank
	@Column(name = "name")
	private String name;
	
	@NotBlank
	@Column(name = "description")
	private String description;
	
	@NotBlank
	@Column(name = "image_src")
	private String imageSrc;
	
	@NotBlank
	@Column(name = "target_date")
	private String targetDate;
	
	@NotNull
	@Column(name = "target_amount")
	private double targetAmount;
	
	@NotNull
	@Column(name = "current_amount")
	private double currentAmount;
	
	public Goal() {
		super();
	}

	public Goal(Long id, @NotBlank String name, @NotBlank String description, @NotBlank String imageSrc,
			@NotBlank String targetDate, @NotNull double targetAmount, @NotBlank double currentAmount) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageSrc = imageSrc;
		this.targetDate = targetDate;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	@Override
	public String toString() {
		return "Goal [id=" + id + ", name=" + name + ", description=" + description + ", imageSrc=" + imageSrc
				+ ", targetDate=" + targetDate + ", targetAmount=" + targetAmount + ", currentAmount=" + currentAmount
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	


}
