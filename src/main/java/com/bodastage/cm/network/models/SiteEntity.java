package com.bodastage.cm.network.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

@Entity
@Table(name="sites", schema="live_network")
public class SiteEntity {
	@GenericGenerator(
	        name = "sitesSequenceGenerator",
	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	        parameters = {
	                @Parameter(name = "sequence_name", value = "seq_sites_pk"),
	                @Parameter(name = "initial_value", value = "1"),
	                @Parameter(name = "increment_size", value = "1")
	        }
	)
	@Id
	@GeneratedValue(generator = "sitesSequenceGenerator")
	private Long pk;

	private String name;
	
	private Long nodePk;
	
	private @Type(type="text") String notes;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAdded;
	
	private int addedBy;
	
	private int modifiedBy;
	
	private Long vendorPk;
	
	@Column(name="tech_pk")
	private Long technologyPk;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateModified;
	
	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public int getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Long getNodePk() {
		return nodePk;
	}

	public void setNodePk(Long nodePk) {
		this.nodePk = nodePk;
	}

	public Long getVendorPk() {
		return vendorPk;
	}

	public void setVendorPk(Long vendorPk) {
		this.vendorPk = vendorPk;
	}

	public Long getTechnologyPk() {
		return technologyPk;
	}

	public void setTechnologyPk(Long technologyPk) {
		this.technologyPk = technologyPk;
	}
	
}
