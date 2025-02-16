    package com.spring.data1.second.repository;

    import com.spring.data1.second.model.entity.Employee;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface EmpRepo  extends JpaRepository<Employee,Integer> {
    }
