package com.company;

public interface IEntityRepository<T extends IEntity> {
    void add(T entity); // entity means that database object
    void delete(T entity);
    void update(T entity);
}
