package repository;

import java.util.List;

public interface SystemRepository <Entity> {
    List<Entity> findAll();

    void save(Entity entity);

    void update(int id, Entity entity);

    void deleteById(int id);
}
