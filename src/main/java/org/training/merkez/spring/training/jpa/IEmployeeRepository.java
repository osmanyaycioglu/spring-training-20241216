package org.training.merkez.spring.training.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    // select * from employee where name='osman' and surname='yaycioglu'
    // select e from Employee e where e.name=?1 and e.surname=?2
    List<Employee> findByNameAndSurnameOrderBySurname(String name,
                                                        String surname);

    List<Employee> findByNameIn(List<String> name);

    @Query("select e from Employee e where e.name=?1")
    List<Employee> searchName(String name);

    @Query("select e from Employee e where e.name=:xyz")
    List<Employee> searchName2(@Param("xyz") String name);

    @Query("select e.name,e.surname from Employee e where e.name=:xyz")
    List<Object[]> searchName3(@Param("xyz") String name);

    @Query("select new org.training.merkez.spring.training.jpa.NameInfo(e.name,e.surname) from Employee e where e.name=:xyz")
    List<NameInfo> searchName4(@Param("xyz") String name);

    @Query(value = "select * from employee e where e.name=?1", nativeQuery = true)
    List<Employee> searchName5(String name);

}
