package com.zandroid.person;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface  PersonRepository extends ElasticsearchRepository<Person, String> {
}
