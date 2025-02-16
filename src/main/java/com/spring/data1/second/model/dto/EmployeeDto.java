    package com.spring.data1.second.model.dto;

    import com.spring.data1.second.model.entity.Employee;
    import jakarta.persistence.Column;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class EmployeeDto {
        private Integer id;
        private String fname; // Lowercase "f"
        private String lname;
        private Double salary;
        public static Employee toEntity(EmployeeDto dto) {
            return Employee.builder()
                    .fname(dto.getFname())
                    .lname(dto.getLname())
                    .salary(dto.getSalary())
                    .build();
        }

        public static EmployeeDto fromEntity(Employee entity) { // Better method name
            return EmployeeDto.builder()
                    .id(entity.getId())
                    .fname(entity.getFname())
                    .lname(entity.getLname())
                    .salary(entity.getSalary())
                    .build();
        }
    }

