package com.candyfactory.catalog.persistence;

import org.springframework.data.repository.CrudRepository;

interface ItemRepository extends CrudRepository<ItemEntity, String> {

}
