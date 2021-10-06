package com.candyfactory.catalog.persistence;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "catalog")
public class ItemEntity {
	
	@Id
    String sku;

	@NotBlank
    String title;

    @NotNull
    BigDecimal price;
    
    @Override
	public int hashCode() {
		return Objects.hash(sku);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemEntity other = (ItemEntity) obj;
		return Objects.equals(sku, other.sku);
	}
}
