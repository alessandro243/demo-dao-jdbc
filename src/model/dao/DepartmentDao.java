package model.dao;

import entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deletebyld(Integer id);
    Department findbyld(Integer id);
    List<Department> findAll();
}
