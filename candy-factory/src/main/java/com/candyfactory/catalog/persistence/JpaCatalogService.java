package com.candyfactory.catalog.persistence;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Component;

import com.candyfactory.catalog.CatalogService;
import com.candyfactory.catalog.Item;


@Component
public class JpaCatalogService implements CatalogService {
	
	private final ItemRepository itemRepository;

	public JpaCatalogService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public Iterable<Item> getItems() {
		
		return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
	            .map(entity -> new Item(entity.title, entity.price))
	            .collect(Collectors.toList());
	}

	
}
