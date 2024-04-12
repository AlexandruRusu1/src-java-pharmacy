package repository;

import Domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository <T extends BaseEntity> implements SystemRepository<T>{
    private List<T> entityList;

    public InMemoryRepository(){
        entityList=new ArrayList<>();
    }
    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void update(int id, T t) {

    }

    @Override
    public void deleteById(int id) {

    }

    private T findById(int id){
        for(T entity: entityList){
            if(entity.getId() == id){
                return entity;
            }
        }
        return null;
    }
}
